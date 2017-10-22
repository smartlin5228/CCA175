// ORM class for table 'customers'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Oct 21 17:17:53 PDT 2017
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

public class customers extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("customer_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_id = (Integer)value;
      }
    });
    setters.put("customer_fname", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_fname = (String)value;
      }
    });
    setters.put("customer_lname", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_lname = (String)value;
      }
    });
    setters.put("customer_email", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_email = (String)value;
      }
    });
    setters.put("customer_password", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_password = (String)value;
      }
    });
    setters.put("customer_street", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_street = (String)value;
      }
    });
    setters.put("customer_city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_city = (String)value;
      }
    });
    setters.put("customer_state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_state = (String)value;
      }
    });
    setters.put("customer_zipcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        customer_zipcode = (String)value;
      }
    });
  }
  public customers() {
    init0();
  }
  private Integer customer_id;
  public Integer get_customer_id() {
    return customer_id;
  }
  public void set_customer_id(Integer customer_id) {
    this.customer_id = customer_id;
  }
  public customers with_customer_id(Integer customer_id) {
    this.customer_id = customer_id;
    return this;
  }
  private String customer_fname;
  public String get_customer_fname() {
    return customer_fname;
  }
  public void set_customer_fname(String customer_fname) {
    this.customer_fname = customer_fname;
  }
  public customers with_customer_fname(String customer_fname) {
    this.customer_fname = customer_fname;
    return this;
  }
  private String customer_lname;
  public String get_customer_lname() {
    return customer_lname;
  }
  public void set_customer_lname(String customer_lname) {
    this.customer_lname = customer_lname;
  }
  public customers with_customer_lname(String customer_lname) {
    this.customer_lname = customer_lname;
    return this;
  }
  private String customer_email;
  public String get_customer_email() {
    return customer_email;
  }
  public void set_customer_email(String customer_email) {
    this.customer_email = customer_email;
  }
  public customers with_customer_email(String customer_email) {
    this.customer_email = customer_email;
    return this;
  }
  private String customer_password;
  public String get_customer_password() {
    return customer_password;
  }
  public void set_customer_password(String customer_password) {
    this.customer_password = customer_password;
  }
  public customers with_customer_password(String customer_password) {
    this.customer_password = customer_password;
    return this;
  }
  private String customer_street;
  public String get_customer_street() {
    return customer_street;
  }
  public void set_customer_street(String customer_street) {
    this.customer_street = customer_street;
  }
  public customers with_customer_street(String customer_street) {
    this.customer_street = customer_street;
    return this;
  }
  private String customer_city;
  public String get_customer_city() {
    return customer_city;
  }
  public void set_customer_city(String customer_city) {
    this.customer_city = customer_city;
  }
  public customers with_customer_city(String customer_city) {
    this.customer_city = customer_city;
    return this;
  }
  private String customer_state;
  public String get_customer_state() {
    return customer_state;
  }
  public void set_customer_state(String customer_state) {
    this.customer_state = customer_state;
  }
  public customers with_customer_state(String customer_state) {
    this.customer_state = customer_state;
    return this;
  }
  private String customer_zipcode;
  public String get_customer_zipcode() {
    return customer_zipcode;
  }
  public void set_customer_zipcode(String customer_zipcode) {
    this.customer_zipcode = customer_zipcode;
  }
  public customers with_customer_zipcode(String customer_zipcode) {
    this.customer_zipcode = customer_zipcode;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof customers)) {
      return false;
    }
    customers that = (customers) o;
    boolean equal = true;
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.customer_fname == null ? that.customer_fname == null : this.customer_fname.equals(that.customer_fname));
    equal = equal && (this.customer_lname == null ? that.customer_lname == null : this.customer_lname.equals(that.customer_lname));
    equal = equal && (this.customer_email == null ? that.customer_email == null : this.customer_email.equals(that.customer_email));
    equal = equal && (this.customer_password == null ? that.customer_password == null : this.customer_password.equals(that.customer_password));
    equal = equal && (this.customer_street == null ? that.customer_street == null : this.customer_street.equals(that.customer_street));
    equal = equal && (this.customer_city == null ? that.customer_city == null : this.customer_city.equals(that.customer_city));
    equal = equal && (this.customer_state == null ? that.customer_state == null : this.customer_state.equals(that.customer_state));
    equal = equal && (this.customer_zipcode == null ? that.customer_zipcode == null : this.customer_zipcode.equals(that.customer_zipcode));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof customers)) {
      return false;
    }
    customers that = (customers) o;
    boolean equal = true;
    equal = equal && (this.customer_id == null ? that.customer_id == null : this.customer_id.equals(that.customer_id));
    equal = equal && (this.customer_fname == null ? that.customer_fname == null : this.customer_fname.equals(that.customer_fname));
    equal = equal && (this.customer_lname == null ? that.customer_lname == null : this.customer_lname.equals(that.customer_lname));
    equal = equal && (this.customer_email == null ? that.customer_email == null : this.customer_email.equals(that.customer_email));
    equal = equal && (this.customer_password == null ? that.customer_password == null : this.customer_password.equals(that.customer_password));
    equal = equal && (this.customer_street == null ? that.customer_street == null : this.customer_street.equals(that.customer_street));
    equal = equal && (this.customer_city == null ? that.customer_city == null : this.customer_city.equals(that.customer_city));
    equal = equal && (this.customer_state == null ? that.customer_state == null : this.customer_state.equals(that.customer_state));
    equal = equal && (this.customer_zipcode == null ? that.customer_zipcode == null : this.customer_zipcode.equals(that.customer_zipcode));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.customer_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.customer_fname = JdbcWritableBridge.readString(2, __dbResults);
    this.customer_lname = JdbcWritableBridge.readString(3, __dbResults);
    this.customer_email = JdbcWritableBridge.readString(4, __dbResults);
    this.customer_password = JdbcWritableBridge.readString(5, __dbResults);
    this.customer_street = JdbcWritableBridge.readString(6, __dbResults);
    this.customer_city = JdbcWritableBridge.readString(7, __dbResults);
    this.customer_state = JdbcWritableBridge.readString(8, __dbResults);
    this.customer_zipcode = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.customer_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.customer_fname = JdbcWritableBridge.readString(2, __dbResults);
    this.customer_lname = JdbcWritableBridge.readString(3, __dbResults);
    this.customer_email = JdbcWritableBridge.readString(4, __dbResults);
    this.customer_password = JdbcWritableBridge.readString(5, __dbResults);
    this.customer_street = JdbcWritableBridge.readString(6, __dbResults);
    this.customer_city = JdbcWritableBridge.readString(7, __dbResults);
    this.customer_state = JdbcWritableBridge.readString(8, __dbResults);
    this.customer_zipcode = JdbcWritableBridge.readString(9, __dbResults);
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
    JdbcWritableBridge.writeInteger(customer_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(customer_fname, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_lname, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_email, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_password, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_street, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_city, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_state, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_zipcode, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(customer_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(customer_fname, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_lname, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_email, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_password, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_street, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_city, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_state, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(customer_zipcode, 9 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.customer_id = null;
    } else {
    this.customer_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.customer_fname = null;
    } else {
    this.customer_fname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_lname = null;
    } else {
    this.customer_lname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_email = null;
    } else {
    this.customer_email = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_password = null;
    } else {
    this.customer_password = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_street = null;
    } else {
    this.customer_street = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_city = null;
    } else {
    this.customer_city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_state = null;
    } else {
    this.customer_state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.customer_zipcode = null;
    } else {
    this.customer_zipcode = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.customer_id);
    }
    if (null == this.customer_fname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_fname);
    }
    if (null == this.customer_lname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_lname);
    }
    if (null == this.customer_email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_email);
    }
    if (null == this.customer_password) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_password);
    }
    if (null == this.customer_street) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_street);
    }
    if (null == this.customer_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_city);
    }
    if (null == this.customer_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_state);
    }
    if (null == this.customer_zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_zipcode);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.customer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.customer_id);
    }
    if (null == this.customer_fname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_fname);
    }
    if (null == this.customer_lname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_lname);
    }
    if (null == this.customer_email) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_email);
    }
    if (null == this.customer_password) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_password);
    }
    if (null == this.customer_street) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_street);
    }
    if (null == this.customer_city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_city);
    }
    if (null == this.customer_state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_state);
    }
    if (null == this.customer_zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, customer_zipcode);
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
    __sb.append(FieldFormatter.escapeAndEnclose(customer_id==null?"null":"" + customer_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_fname==null?"null":customer_fname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_lname==null?"null":customer_lname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_email==null?"null":customer_email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_password==null?"null":customer_password, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_street==null?"null":customer_street, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_city==null?"null":customer_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_state==null?"null":customer_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_zipcode==null?"null":customer_zipcode, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(customer_id==null?"null":"" + customer_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_fname==null?"null":customer_fname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_lname==null?"null":customer_lname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_email==null?"null":customer_email, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_password==null?"null":customer_password, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_street==null?"null":customer_street, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_city==null?"null":customer_city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_state==null?"null":customer_state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(customer_zipcode==null?"null":customer_zipcode, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_id = null; } else {
      this.customer_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_fname = null; } else {
      this.customer_fname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_lname = null; } else {
      this.customer_lname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_email = null; } else {
      this.customer_email = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_password = null; } else {
      this.customer_password = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_street = null; } else {
      this.customer_street = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_city = null; } else {
      this.customer_city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_state = null; } else {
      this.customer_state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_zipcode = null; } else {
      this.customer_zipcode = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.customer_id = null; } else {
      this.customer_id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_fname = null; } else {
      this.customer_fname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_lname = null; } else {
      this.customer_lname = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_email = null; } else {
      this.customer_email = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_password = null; } else {
      this.customer_password = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_street = null; } else {
      this.customer_street = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_city = null; } else {
      this.customer_city = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_state = null; } else {
      this.customer_state = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.customer_zipcode = null; } else {
      this.customer_zipcode = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    customers o = (customers) super.clone();
    return o;
  }

  public void clone0(customers o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("customer_fname", this.customer_fname);
    __sqoop$field_map.put("customer_lname", this.customer_lname);
    __sqoop$field_map.put("customer_email", this.customer_email);
    __sqoop$field_map.put("customer_password", this.customer_password);
    __sqoop$field_map.put("customer_street", this.customer_street);
    __sqoop$field_map.put("customer_city", this.customer_city);
    __sqoop$field_map.put("customer_state", this.customer_state);
    __sqoop$field_map.put("customer_zipcode", this.customer_zipcode);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("customer_id", this.customer_id);
    __sqoop$field_map.put("customer_fname", this.customer_fname);
    __sqoop$field_map.put("customer_lname", this.customer_lname);
    __sqoop$field_map.put("customer_email", this.customer_email);
    __sqoop$field_map.put("customer_password", this.customer_password);
    __sqoop$field_map.put("customer_street", this.customer_street);
    __sqoop$field_map.put("customer_city", this.customer_city);
    __sqoop$field_map.put("customer_state", this.customer_state);
    __sqoop$field_map.put("customer_zipcode", this.customer_zipcode);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
