from pyspark import SparkContext, SparkConf
from pyspark.sql import SQLContext, DataFrame

conf = SparkConf().setAppName('Problem 16 SparkSQL')
sc = SparkContext(conf=conf)
sqlContext = SQLContext(sc)
# Loading data and create the dataframe
productRDD = sc.textFile("/user/smartlin1/data/product.csv").map(lambda line: line.split(","))
productDF = sqlContext.createDataFrame(productRDD, ['productID','productCode','name','quantity','price','supplierid'])
productDF.registerTempTable("products")
#df2 = sqlContext.sql("SELECT * FROM product")
#df2.show()

supplierRDD = sc.textFile("/user/smartlin1/data/supplier.csv").map(lambda line: line.split(","))
supplierDF = sqlContext.createDataFrame(supplierRDD, ['supplierID','name','phone'])
supplierDF.registerTempTable("suppliers")

supplier_product = sc.textFile("/user/smartlin1/data/products_suppliers.csv").map(lambda line: line.split(","))
supplier_productDF = sqlContext.createDataFrame(supplier_product,['productID', 'supplierID'])
supplier_productDF.registerTempTable("products_suppliers")

# Same product can be supplied by multiple supplier, now find the price for each product based on different supplier
results1 = sqlContext.sql("SELECT products.name AS product_name, price, suppliers.name as supplier_name FROM products_suppliers JOIN products ON products_suppliers.productID=products.productID JOIN suppliers ON products_suppliers.supplierID=suppliers.supplierID")

#results1.show()

# Find all the supplier name, who are suppling Pencil 3B
results2 = sqlContext.sql("SELECT p.name AS Product_Name, s.name AS Supplier_Name FROM products_suppliers AS ps JOIN products AS p ON ps.productID = p.productID JOIN suppliers AS s on ps.supplierID = s.supplierID WHERE p.name ='Pencil 3B'")

#results2.show()

# Find all the products, which are supplied by ABC Traders

results3 = sqlContext.sql("SELECT p.name AS Product_Name, s.name AS Supplier_Name FROM products AS p, products_suppliers AS ps, suppliers AS s WHERE p.productID =ps.productID AND ps.supplierID=s.supplierID AND s.name='ABC Traders'")

#results3.show()

# Select all the columns from product table with output header as below, productID AS ID code AS Code name AS Description price AS "Unit Price'

results4 = sqlContext.sql("""SELECT productID AS ID, productCode AS Code, name AS Description, price AS `Unit Price` FROM products ORDER BY ID""")

#results4.show()

# Select code and name both separated by ' -' and header name should be "Product Description.

results5 = sqlContext.sql("""SELECT CONCAT(productCode, '-', name) AS `Product Description`, price FROM products""")

#results5.show()

# Select all distinct prices/ name.

result6 = sqlContext.sql("""SELECT DISTINCT(price) AS `Distinct Price`, name FROM products""")

#result6.show()

# Select all price data sorted by both code and productID combination.
result7 = sqlContext.sql("""SELECT * FROM products ORDER BY productCode, productID""")
result7.show()

# count number of products for each code
result8 = sqlContext.sql("""SELECT COUNT(*) FROM products GROUP BY productCode""")
result8.show()
