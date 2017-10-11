from pyspark import SparkContext, SparkConf

conf = SparkConf().setAppName("Problem 20")
sc = SparkContext(conf=conf)

# create ds
people = []
people.append({'name':'Amit', 'age':45,'gender':'M'}) 
people.append({'name':'Ganga', 'age':43,'gender':'F'})
people.append({'name':'John', 'age':28,'gender':'M'})
people.append({'name':'Lolita', 'age':33,'gender':'F'})
people.append({'name':'Dont Know', 'age':18,'gender':'T'})

# create RDD
peopleRDD = sc.parallelize(people)
# Sum the age of all people as well count them in each partition
seqOp = (lambda x,y: (x[0] + y['age'], x[1] + 1)) # x[0] and x[1] applies to the local result which is the zero value (first args in aggregate function)
# Combine results from all partitions
combOp = (lambda x,y: (x[0] + y[0], x[1] + y[1])) # x[0] y[0] are from different partitions

# Aggregation
peopleRDD.aggregate((0,0), seqOp, combOp)
