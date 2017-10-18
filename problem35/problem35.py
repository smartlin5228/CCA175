from pyspark import SparkContext, SparkConf
from pyspark.sql import SQLContext

conf = SparkConf().setAppName('Problem 15')
sc = SparkContext(conf)
sqlContext = SQLContext(sc)

employee = sqlContext.jsonFile('problem35/employee.json')
employee.registerTempTable("employee")
allemployee = sqlContext.sql("SELECT * FROM employee")

allemployee.toJSON()
