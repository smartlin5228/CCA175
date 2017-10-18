// ORM class for table 'products'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Oct 18 03:30:01 PDT 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class products extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("product_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_id = (Integer)value;
      }
    });
    setters.put("product_category_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_category_id = (Integer)value;
      }
    });
    setters.put("product_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_name = (String)value;
      }
    });
    setters.put("product_description", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_description = (String)value;
      }
    });
    setters.put("product_price", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_price = (Float)value;
      }
    });
    setters.put("product_image", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        product_image = (String)value;
      }
    });
  }
  public products() {
    init0();
  }
  private Integer product_id;
  public Integer get_product_id() {
    return product_id;
  }
  public void set_product_id(Integer product_id) {
    this.product_id = product_id;
  }
  public products with_product_id(Integer product_id) {
    this.product_id = product_id;
    return this;
  }
  private Integer product_category_id;
  public Integer get_product_category_id() {
    return product_category_id;
  }
  public void set_product_category_id(Integer product_category_id) {
    this.product_category_id = product_category_id;
  }
  public products with_product_category_id(Integer product_category_id) {
    this.product_category_id = product_category_id;
    return this;
  }
  private String product_name;
  public String get_product_name() {
    return product_name;
  }
  public void set_product_name(String product_name) {
    this.product_name = product_name;
  }
  public products with_product_name(String product_name) {
    this.product_name = product_name;
    return this;
  }
  private String product_description;
  public String get_product_description() {
    return product_description;
  }
  public void set_product_description(String product_description) {
    this.product_description = product_description;
  }
  public products with_product_description(String product_description) {
    this.product_description = product_description;
    return this;
  }
  private Float product_price;
  public Float get_product_price() {
    return product_price;
  }
  public void set_product_price(Float product_price) {
    this.product_price = product_price;
  }
  public products with_product_price(Float product_price) {
    this.product_price = product_price;
    return this;
  }
  private String product_image;
  public String get_product_image() {
    return product_image;
  }
  public void set_product_image(String product_image) {
    this.product_image = product_image;
  }
  public products with_product_image(String product_image) {
    this.product_image = product_image;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof products)) {
      return false;
    }
    products that = (products) o;
    boolean equal = true;
    equal = equal && (this.product_id == null ? that.product_id == null : this.product_id.equals(that.product_id));
    equal = equal && (this.product_category_id == null ? that.product_category_id == null : this.product_category_id.equals(that.product_category_id));
    equal = equal && (this.product_name == null ? that.product_name == null : this.product_name.equals(that.product_name));
    equal = equal && (this.product_description == null ? that.product_description == null : this.product_description.equals(that.product_description));
    equal = equal && (this.product_price == null ? that.product_price == null : this.product_price.equals(that.product_price));
    equal = equal && (this.product_image == null ? that.product_image == null : this.product_image.equals(that.product_image));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof products)) {
      return false;
    }
    products that = (products) o;
    boolean equal = true;
    equal = equal && (this.product_id == null ? that.product_id == null : this.product_id.equals(that.product_id));
    equal = equal && (this.product_category_id == null ? that.product_category_id == null : this.product_category_id.equals(that.product_category_id));
    equal = equal && (this.product_name == null ? that.product_name == null : this.product_name.equals(that.product_name));
    equal = equal && (this.product_description == null ? that.product_description == null : this.product_description.equals(that.product_description));
    equal = equal && (this.product_price == null ? that.product_price == null : this.product_price.equals(that.product_price));
    equal = equal && (this.product_image == null ? that.product_image == null : this.product_image.equals(that.product_image));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.product_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.product_category_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.product_name = JdbcWritableBridge.readString(3, __dbResults);
    this.product_description = JdbcWritableBridge.readString(4, __dbResults);
    this.product_price = JdbcWritableBridge.readFloat(5, __dbResults);
    this.product_image = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.product_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.product_category_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.product_name = JdbcWritableBridge.readString(3, __dbResults);
    this.product_description = JdbcWritableBridge.readString(4, __dbResults);
    this.product_price = JdbcWritableBridge.readFloat(5, __dbResults);
    this.product_image = JdbcWritableBridge.readString(6, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(product_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(product_category_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(product_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_description, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(product_price, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(product_image, 6 + __off, 12, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(product_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(product_category_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(product_name, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(product_description, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(product_price, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(product_image, 6 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.product_id = null;
    } else {
    this.product_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.product_category_id = null;
    } else {
    this.product_category_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.product_name = null;
    } else {
    this.product_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_description = null;
    } else {
    this.product_description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.product_price = null;
    } else {
    this.product_price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.product_image = null;
    } else {
    this.product_image = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.product_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_id);
    }
    if (null == this.product_category_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_category_id);
    }
    if (null == this.product_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_name);
    }
    if (null == this.product_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_description);
    }
    if (null == this.product_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.product_price);
    }
    if (null == this.product_image) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_image);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.product_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_id);
    }
    if (null == this.product_category_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.product_category_id);
    }
    if (null == this.product_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_name);
    }
    if (null == this.product_description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_description);
    }
    if (null == this.product_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.product_price);
    }
    if (null == this.product_image) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, product_image);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(product_id==null?"null":"" + product_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_category_id==null?"null":"" + product_category_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_name==null?"null":product_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_description==null?"null":product_description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_price==null?"null":"" + product_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_image==null?"null":product_image, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(product_id==null?"null":"" + product_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_category_id==null?"null":"" + product_category_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_name==null?"null":product_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_description==null?"null":product_description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_price==null?"null":"" + product_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(product_image==null?"null":product_image, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_id = null; } else {
      this.product_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_category_id = null; } else {
      this.product_category_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_name = null; } else {
      this.product_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_description = null; } else {
      this.product_description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_price = null; } else {
      this.product_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_image = null; } else {
      this.product_image = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_id = null; } else {
      this.product_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_category_id = null; } else {
      this.product_category_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_name = null; } else {
      this.product_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_description = null; } else {
      this.product_description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.product_price = null; } else {
      this.product_price = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.product_image = null; } else {
      this.product_image = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    products o = (products) super.clone();
    return o;
  }

  public void clone0(products o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("product_id", this.product_id);
    __sqoop$field_map.put("product_category_id", this.product_category_id);
    __sqoop$field_map.put("product_name", this.product_name);
    __sqoop$field_map.put("product_description", this.product_description);
    __sqoop$field_map.put("product_price", this.product_price);
    __sqoop$field_map.put("product_image", this.product_image);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("product_id", this.product_id);
    __sqoop$field_map.put("product_category_id", this.product_category_id);
    __sqoop$field_map.put("product_name", this.product_name);
    __sqoop$field_map.put("product_description", this.product_description);
    __sqoop$field_map.put("product_price", this.product_price);
    __sqoop$field_map.put("product_image", this.product_image);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
