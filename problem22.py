from pyspark import SparkContext, SparkConf

# Configure
conf = SparkConf().setAppName('Problem 22')
sc = SparkContext(conf=conf)

# Loading data
content = sc.textFile("/user/smartlin1/data/Content.txt")
remove = sc.textFile("/user/smartlin1/data/Remove.txt")
removeRDD = remove.flatMap(lambda word: word.split(",")).map(lambda x: x.strip())
# broadcast the removeRDD to each partition for a read only copy for each stack
bc = sc.broadcast(removeRDD.collect())
words = content.flatMap(lambda word: word.split(" "))
filteredWords = words.filter(lambda x: x not in bc.value)
wordPairs = filteredWords.map(lambda word: (word, 1))
wordCount = wordPairs.reduceByKey(lambda x,y: x+y)
wordCount.repartition(1).saveAsTextFile("output/result")
bc.unpersist()
