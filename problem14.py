from pyspark import SparkContext, SparkConf

conf = SparkConf().setAppName('Problem 14')
sc = SparkContext(conf=conf)

# load data
sentences = sc.textFile("/user/smartlin1/data/file1.txt").glom().map(lambda x: " ".join(x)).flatMap(lambda x: x.split("."))

# The glom() RDD method is used to create a single entry for each document containing the list of all lines, we can then join the lines up, then resplit them into sentences using "." as the separator, using flatMap so that every object in our RDD is now a sentence.

# Now we have isolated each sentence we can split it into a list of words and extract the word bigrams from it. Our new RDD contains tuples containing the word bigram (itself a tuple containing the first and second word) as the first value and the number 1 as the second value. 
bigrams = sentences.map(lambda x: x.split(" ")).flatMap(lambda x: [((x[i],x[i+1]),1)for i in range(0,len(x)-1)])

# Apply reduceByKey and sort in order of descending frequency
freq_bigrams = bigrams.reduceByKey(lambda x, y: x + y).map(lambda x: (x[1], x[0])).sortByKey(False)

# Checking the results
freq_bigrams.take(10)
