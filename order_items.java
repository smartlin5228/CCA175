// ORM class for table 'order_items'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Oct 21 17:19:42 PDT 2017
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

public class order_items extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("order_item_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_item_id = (Integer)value;
      }
    });
    setters.put("order_item_order_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_item_order_id = (Integer)value;
      }
    });
    setters.put("order_item_product_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_item_product_id = (Integer)value;
      }
    });
    setters.put("order_item_quantity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_item_quantity = (Integer)value;
      }
    });
    setters.put("order_item_subtotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_item_subtotal = (Float)value;
      }
    });
    setters.put("order_item_product_price", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        order_item_product_price = (Float)value;
      }
    });
  }
  public order_items() {
    init0();
  }
  private Integer order_item_id;
  public Integer get_order_item_id() {
    return order_item_id;
  }
  public void set_order_item_id(Integer order_item_id) {
    this.order_item_id = order_item_id;
  }
  public order_items with_order_item_id(Integer order_item_id) {
    this.order_item_id = order_item_id;
    return this;
  }
  private Integer order_item_order_id;
  public Integer get_order_item_order_id() {
    return order_item_order_id;
  }
  public void set_order_item_order_id(Integer order_item_order_id) {
    this.order_item_order_id = order_item_order_id;
  }
  public order_items with_order_item_order_id(Integer order_item_order_id) {
    this.order_item_order_id = order_item_order_id;
    return this;
  }
  private Integer order_item_product_id;
  public Integer get_order_item_product_id() {
    return order_item_product_id;
  }
  public void set_order_item_product_id(Integer order_item_product_id) {
    this.order_item_product_id = order_item_product_id;
  }
  public order_items with_order_item_product_id(Integer order_item_product_id) {
    this.order_item_product_id = order_item_product_id;
    return this;
  }
  private Integer order_item_quantity;
  public Integer get_order_item_quantity() {
    return order_item_quantity;
  }
  public void set_order_item_quantity(Integer order_item_quantity) {
    this.order_item_quantity = order_item_quantity;
  }
  public order_items with_order_item_quantity(Integer order_item_quantity) {
    this.order_item_quantity = order_item_quantity;
    return this;
  }
  private Float order_item_subtotal;
  public Float get_order_item_subtotal() {
    return order_item_subtotal;
  }
  public void set_order_item_subtotal(Float order_item_subtotal) {
    this.order_item_subtotal = order_item_subtotal;
  }
  public order_items with_order_item_subtotal(Float order_item_subtotal) {
    this.order_item_subtotal = order_item_subtotal;
    return this;
  }
  private Float order_item_product_price;
  public Float get_order_item_product_price() {
    return order_item_product_price;
  }
  public void set_order_item_product_price(Float order_item_product_price) {
    this.order_item_product_price = order_item_product_price;
  }
  public order_items with_order_item_product_price(Float order_item_product_price) {
    this.order_item_product_price = order_item_product_price;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof order_items)) {
      return false;
    }
    order_items that = (order_items) o;
    boolean equal = true;
    equal = equal && (this.order_item_id == null ? that.order_item_id == null : this.order_item_id.equals(that.order_item_id));
    equal = equal && (this.order_item_order_id == null ? that.order_item_order_id == null : this.order_item_order_id.equals(that.order_item_order_id));
    equal = equal && (this.order_item_product_id == null ? that.order_item_product_id == null : this.order_item_product_id.equals(that.order_item_product_id));
    equal = equal && (this.order_item_quantity == null ? that.order_item_quantity == null : this.order_item_quantity.equals(that.order_item_quantity));
    equal = equal && (this.order_item_subtotal == null ? that.order_item_subtotal == null : this.order_item_subtotal.equals(that.order_item_subtotal));
    equal = equal && (this.order_item_product_price == null ? that.order_item_product_price == null : this.order_item_product_price.equals(that.order_item_product_price));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof order_items)) {
      return false;
    }
    order_items that = (order_items) o;
    boolean equal = true;
    equal = equal && (this.order_item_id == null ? that.order_item_id == null : this.order_item_id.equals(that.order_item_id));
    equal = equal && (this.order_item_order_id == null ? that.order_item_order_id == null : this.order_item_order_id.equals(that.order_item_order_id));
    equal = equal && (this.order_item_product_id == null ? that.order_item_product_id == null : this.order_item_product_id.equals(that.order_item_product_id));
    equal = equal && (this.order_item_quantity == null ? that.order_item_quantity == null : this.order_item_quantity.equals(that.order_item_quantity));
    equal = equal && (this.order_item_subtotal == null ? that.order_item_subtotal == null : this.order_item_subtotal.equals(that.order_item_subtotal));
    equal = equal && (this.order_item_product_price == null ? that.order_item_product_price == null : this.order_item_product_price.equals(that.order_item_product_price));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.order_item_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.order_item_order_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.order_item_product_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.order_item_quantity = JdbcWritableBridge.readInteger(4, __dbResults);
    this.order_item_subtotal = JdbcWritableBridge.readFloat(5, __dbResults);
    this.order_item_product_price = JdbcWritableBridge.readFloat(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.order_item_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.order_item_order_id = JdbcWritableBridge.readInteger(2, __dbResults);
    this.order_item_product_id = JdbcWritableBridge.readInteger(3, __dbResults);
    this.order_item_quantity = JdbcWritableBridge.readInteger(4, __dbResults);
    this.order_item_subtotal = JdbcWritableBridge.readFloat(5, __dbResults);
    this.order_item_product_price = JdbcWritableBridge.readFloat(6, __dbResults);
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
    JdbcWritableBridge.writeInteger(order_item_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(order_item_order_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(order_item_product_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(order_item_quantity, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeFloat(order_item_subtotal, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(order_item_product_price, 6 + __off, 7, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(order_item_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(order_item_order_id, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(order_item_product_id, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(order_item_quantity, 4 + __off, -6, __dbStmt);
    JdbcWritableBridge.writeFloat(order_item_subtotal, 5 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(order_item_product_price, 6 + __off, 7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.order_item_id = null;
    } else {
    this.order_item_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.order_item_order_id = null;
    } else {
    this.order_item_order_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.order_item_product_id = null;
    } else {
    this.order_item_product_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.order_item_quantity = null;
    } else {
    this.order_item_quantity = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.order_item_subtotal = null;
    } else {
    this.order_item_subtotal = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.order_item_product_price = null;
    } else {
    this.order_item_product_price = Float.valueOf(__dataIn.readFloat());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.order_item_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_item_id);
    }
    if (null == this.order_item_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_item_order_id);
    }
    if (null == this.order_item_product_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_item_product_id);
    }
    if (null == this.order_item_quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_item_quantity);
    }
    if (null == this.order_item_subtotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.order_item_subtotal);
    }
    if (null == this.order_item_product_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.order_item_product_price);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.order_item_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_item_id);
    }
    if (null == this.order_item_order_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_item_order_id);
    }
    if (null == this.order_item_product_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_item_product_id);
    }
    if (null == this.order_item_quantity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.order_item_quantity);
    }
    if (null == this.order_item_subtotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.order_item_subtotal);
    }
    if (null == this.order_item_product_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.order_item_product_price);
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
    __sb.append(FieldFormatter.escapeAndEnclose(order_item_id==null?"null":"" + order_item_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_item_order_id==null?"null":"" + order_item_order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_item_product_id==null?"null":"" + order_item_product_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_item_quantity==null?"null":"" + order_item_quantity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_item_subtotal==null?"null":"" + order_item_subtotal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_item_product_price==null?"null":"" + order_item_product_price, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(order_item_id==null?"null":"" + order_item_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_item_order_id==null?"null":"" + order_item_order_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_item_product_id==null?"null":"" + order_item_product_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_item_quantity==null?"null":"" + order_item_quantity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_item_subtotal==null?"null":"" + order_item_subtotal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(order_item_product_price==null?"null":"" + order_item_product_price, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_item_id = null; } else {
      this.order_item_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_item_order_id = null; } else {
      this.order_item_order_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_item_product_id = null; } else {
      this.order_item_product_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_item_quantity = null; } else {
      this.order_item_quantity = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_item_subtotal = null; } else {
      this.order_item_subtotal = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_item_product_price = null; } else {
      this.order_item_product_price = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_item_id = null; } else {
      this.order_item_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_item_order_id = null; } else {
      this.order_item_order_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_item_product_id = null; } else {
      this.order_item_product_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_item_quantity = null; } else {
      this.order_item_quantity = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_item_subtotal = null; } else {
      this.order_item_subtotal = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.order_item_product_price = null; } else {
      this.order_item_product_price = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    order_items o = (order_items) super.clone();
    return o;
  }

  public void clone0(order_items o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("order_item_id", this.order_item_id);
    __sqoop$field_map.put("order_item_order_id", this.order_item_order_id);
    __sqoop$field_map.put("order_item_product_id", this.order_item_product_id);
    __sqoop$field_map.put("order_item_quantity", this.order_item_quantity);
    __sqoop$field_map.put("order_item_subtotal", this.order_item_subtotal);
    __sqoop$field_map.put("order_item_product_price", this.order_item_product_price);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("order_item_id", this.order_item_id);
    __sqoop$field_map.put("order_item_order_id", this.order_item_order_id);
    __sqoop$field_map.put("order_item_product_id", this.order_item_product_id);
    __sqoop$field_map.put("order_item_quantity", this.order_item_quantity);
    __sqoop$field_map.put("order_item_subtotal", this.order_item_subtotal);
    __sqoop$field_map.put("order_item_product_price", this.order_item_product_price);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
