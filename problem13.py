from pyspark import SQLContext
from pyspark import SparkContext, SparkConf

conf = SparkConf().setAppName("Problem 13")
sc = SparkContext(conf=conf)
sqlContext = SQLContext(sc)
employee = sqlContext.read.json("/user/smartlin1/data/employee.json")
# Register a temp table using registerTempTable
employee.registerTempTable("Employee")
# Query and print data
emplyeeInfo = sqlContext.sql("SELECT * FROM Employee")
for row in emplyeeInfo.collect():
    print(row)

