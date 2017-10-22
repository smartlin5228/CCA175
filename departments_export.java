// ORM class for table 'departments_export'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Oct 21 17:19:20 PDT 2017
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

public class departments_export extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("department_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        department_id = (Integer)value;
      }
    });
    setters.put("department_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        department_name = (String)value;
      }
    });
    setters.put("created_date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        created_date = (java.sql.Timestamp)value;
      }
    });
  }
  public departments_export() {
    init0();
  }
  private Integer department_id;
  public Integer get_department_id() {
    return department_id;
  }
  public void set_department_id(Integer department_id) {
    this.department_id = department_id;
  }
  public departments_export with_department_id(Integer department_id) {
    this.department_id = department_id;
    return this;
  }
  private String department_name;
  public String get_department_name() {
    return department_name;
  }
  public void set_department_name(String department_name) {
    this.department_name = department_name;
  }
  public departments_export with_department_name(String department_name) {
    this.department_name = department_name;
    return this;
  }
  private java.sql.Timestamp created_date;
  public java.sql.Timestamp get_created_date() {
    return created_date;
  }
  public void set_created_date(java.sql.Timestamp created_date) {
    this.created_date = created_date;
  }
  public departments_export with_created_date(java.sql.Timestamp created_date) {
    this.created_date = created_date;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof departments_export)) {
      return false;
    }
    departments_export that = (departments_export) o;
    boolean equal = true;
    equal = equal && (this.department_id == null ? that.department_id == null : this.department_id.equals(that.department_id));
    equal = equal && (this.department_name == null ? that.department_name == null : this.department_name.equals(that.department_name));
    equal = equal && (this.created_date == null ? that.created_date == null : this.created_date.equals(that.created_date));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof departments_export)) {
      return false;
    }
    departments_export that = (departments_export) o;
    boolean equal = true;
    equal = equal && (this.department_id == null ? that.department_id == null : this.department_id.equals(that.department_id));
    equal = equal && (this.department_name == null ? that.department_name == null : this.department_name.equals(that.department_name));
    equal = equal && (this.created_date == null ? that.created_date == null : this.created_date.equals(that.created_date));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.department_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.department_name = JdbcWritableBridge.readString(2, __dbResults);
    this.created_date = JdbcWritableBridge.readTimestamp(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.department_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.department_name = JdbcWritableBridge.readString(2, __dbResults);
    this.created_date = JdbcWritableBridge.readTimestamp(3, __dbResults);
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
    JdbcWritableBridge.writeInteger(department_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(department_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_date, 3 + __off, 93, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(department_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(department_name, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created_date, 3 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.department_id = null;
    } else {
    this.department_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.department_name = null;
    } else {
    this.department_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.created_date = null;
    } else {
    this.created_date = new Timestamp(__dataIn.readLong());
    this.created_date.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.department_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.department_id);
    }
    if (null == this.department_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, department_name);
    }
    if (null == this.created_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created_date.getTime());
    __dataOut.writeInt(this.created_date.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.department_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.department_id);
    }
    if (null == this.department_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, department_name);
    }
    if (null == this.created_date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created_date.getTime());
    __dataOut.writeInt(this.created_date.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(department_id==null?"null":"" + department_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(department_name==null?"null":department_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_date==null?"null":"" + created_date, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(department_id==null?"null":"" + department_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(department_name==null?"null":department_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created_date==null?"null":"" + created_date, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.department_id = null; } else {
      this.department_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.department_name = null; } else {
      this.department_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_date = null; } else {
      this.created_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.department_id = null; } else {
      this.department_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.department_name = null; } else {
      this.department_name = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created_date = null; } else {
      this.created_date = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    departments_export o = (departments_export) super.clone();
    o.created_date = (o.created_date != null) ? (java.sql.Timestamp) o.created_date.clone() : null;
    return o;
  }

  public void clone0(departments_export o) throws CloneNotSupportedException {
    o.created_date = (o.created_date != null) ? (java.sql.Timestamp) o.created_date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("department_id", this.department_id);
    __sqoop$field_map.put("department_name", this.department_name);
    __sqoop$field_map.put("created_date", this.created_date);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("department_id", this.department_id);
    __sqoop$field_map.put("department_name", this.department_name);
    __sqoop$field_map.put("created_date", this.created_date);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
