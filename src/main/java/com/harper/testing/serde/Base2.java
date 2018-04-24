/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.harper.testing.serde;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Base2 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4607496774408346774L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Base2\",\"namespace\":\"com.harper.testing.serde\",\"fields\":[{\"name\":\"f1\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"f1_2\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"f2\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"f3\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"f4\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Base2> ENCODER =
      new BinaryMessageEncoder<Base2>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Base2> DECODER =
      new BinaryMessageDecoder<Base2>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Base2> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Base2> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Base2>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Base2 to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Base2 from a ByteBuffer. */
  public static Base2 fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.Integer f1;
  @Deprecated public java.lang.CharSequence f1_2;
  @Deprecated public java.lang.Long f2;
  @Deprecated public java.lang.CharSequence f3;
  @Deprecated public java.lang.CharSequence f4;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Base2() {}

  /**
   * All-args constructor.
   * @param f1 The new value for f1
   * @param f1_2 The new value for f1_2
   * @param f2 The new value for f2
   * @param f3 The new value for f3
   * @param f4 The new value for f4
   */
  public Base2(java.lang.Integer f1, java.lang.CharSequence f1_2, java.lang.Long f2, java.lang.CharSequence f3, java.lang.CharSequence f4) {
    this.f1 = f1;
    this.f1_2 = f1_2;
    this.f2 = f2;
    this.f3 = f3;
    this.f4 = f4;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return f1;
    case 1: return f1_2;
    case 2: return f2;
    case 3: return f3;
    case 4: return f4;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: f1 = (java.lang.Integer)value$; break;
    case 1: f1_2 = (java.lang.CharSequence)value$; break;
    case 2: f2 = (java.lang.Long)value$; break;
    case 3: f3 = (java.lang.CharSequence)value$; break;
    case 4: f4 = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'f1' field.
   * @return The value of the 'f1' field.
   */
  public java.lang.Integer getF1() {
    return f1;
  }

  /**
   * Sets the value of the 'f1' field.
   * @param value the value to set.
   */
  public void setF1(java.lang.Integer value) {
    this.f1 = value;
  }

  /**
   * Gets the value of the 'f1_2' field.
   * @return The value of the 'f1_2' field.
   */
  public java.lang.CharSequence getF12() {
    return f1_2;
  }

  /**
   * Sets the value of the 'f1_2' field.
   * @param value the value to set.
   */
  public void setF12(java.lang.CharSequence value) {
    this.f1_2 = value;
  }

  /**
   * Gets the value of the 'f2' field.
   * @return The value of the 'f2' field.
   */
  public java.lang.Long getF2() {
    return f2;
  }

  /**
   * Sets the value of the 'f2' field.
   * @param value the value to set.
   */
  public void setF2(java.lang.Long value) {
    this.f2 = value;
  }

  /**
   * Gets the value of the 'f3' field.
   * @return The value of the 'f3' field.
   */
  public java.lang.CharSequence getF3() {
    return f3;
  }

  /**
   * Sets the value of the 'f3' field.
   * @param value the value to set.
   */
  public void setF3(java.lang.CharSequence value) {
    this.f3 = value;
  }

  /**
   * Gets the value of the 'f4' field.
   * @return The value of the 'f4' field.
   */
  public java.lang.CharSequence getF4() {
    return f4;
  }

  /**
   * Sets the value of the 'f4' field.
   * @param value the value to set.
   */
  public void setF4(java.lang.CharSequence value) {
    this.f4 = value;
  }

  /**
   * Creates a new Base2 RecordBuilder.
   * @return A new Base2 RecordBuilder
   */
  public static com.harper.testing.serde.Base2.Builder newBuilder() {
    return new com.harper.testing.serde.Base2.Builder();
  }

  /**
   * Creates a new Base2 RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Base2 RecordBuilder
   */
  public static com.harper.testing.serde.Base2.Builder newBuilder(com.harper.testing.serde.Base2.Builder other) {
    return new com.harper.testing.serde.Base2.Builder(other);
  }

  /**
   * Creates a new Base2 RecordBuilder by copying an existing Base2 instance.
   * @param other The existing instance to copy.
   * @return A new Base2 RecordBuilder
   */
  public static com.harper.testing.serde.Base2.Builder newBuilder(com.harper.testing.serde.Base2 other) {
    return new com.harper.testing.serde.Base2.Builder(other);
  }

  /**
   * RecordBuilder for Base2 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Base2>
    implements org.apache.avro.data.RecordBuilder<Base2> {

    private java.lang.Integer f1;
    private java.lang.CharSequence f1_2;
    private java.lang.Long f2;
    private java.lang.CharSequence f3;
    private java.lang.CharSequence f4;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.harper.testing.serde.Base2.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.f1)) {
        this.f1 = data().deepCopy(fields()[0].schema(), other.f1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.f1_2)) {
        this.f1_2 = data().deepCopy(fields()[1].schema(), other.f1_2);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.f2)) {
        this.f2 = data().deepCopy(fields()[2].schema(), other.f2);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.f3)) {
        this.f3 = data().deepCopy(fields()[3].schema(), other.f3);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.f4)) {
        this.f4 = data().deepCopy(fields()[4].schema(), other.f4);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Base2 instance
     * @param other The existing instance to copy.
     */
    private Builder(com.harper.testing.serde.Base2 other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.f1)) {
        this.f1 = data().deepCopy(fields()[0].schema(), other.f1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.f1_2)) {
        this.f1_2 = data().deepCopy(fields()[1].schema(), other.f1_2);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.f2)) {
        this.f2 = data().deepCopy(fields()[2].schema(), other.f2);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.f3)) {
        this.f3 = data().deepCopy(fields()[3].schema(), other.f3);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.f4)) {
        this.f4 = data().deepCopy(fields()[4].schema(), other.f4);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'f1' field.
      * @return The value.
      */
    public java.lang.Integer getF1() {
      return f1;
    }

    /**
      * Sets the value of the 'f1' field.
      * @param value The value of 'f1'.
      * @return This builder.
      */
    public com.harper.testing.serde.Base2.Builder setF1(java.lang.Integer value) {
      validate(fields()[0], value);
      this.f1 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'f1' field has been set.
      * @return True if the 'f1' field has been set, false otherwise.
      */
    public boolean hasF1() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'f1' field.
      * @return This builder.
      */
    public com.harper.testing.serde.Base2.Builder clearF1() {
      f1 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'f1_2' field.
      * @return The value.
      */
    public java.lang.CharSequence getF12() {
      return f1_2;
    }

    /**
      * Sets the value of the 'f1_2' field.
      * @param value The value of 'f1_2'.
      * @return This builder.
      */
    public com.harper.testing.serde.Base2.Builder setF12(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.f1_2 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'f1_2' field has been set.
      * @return True if the 'f1_2' field has been set, false otherwise.
      */
    public boolean hasF12() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'f1_2' field.
      * @return This builder.
      */
    public com.harper.testing.serde.Base2.Builder clearF12() {
      f1_2 = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'f2' field.
      * @return The value.
      */
    public java.lang.Long getF2() {
      return f2;
    }

    /**
      * Sets the value of the 'f2' field.
      * @param value The value of 'f2'.
      * @return This builder.
      */
    public com.harper.testing.serde.Base2.Builder setF2(java.lang.Long value) {
      validate(fields()[2], value);
      this.f2 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'f2' field has been set.
      * @return True if the 'f2' field has been set, false otherwise.
      */
    public boolean hasF2() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'f2' field.
      * @return This builder.
      */
    public com.harper.testing.serde.Base2.Builder clearF2() {
      f2 = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'f3' field.
      * @return The value.
      */
    public java.lang.CharSequence getF3() {
      return f3;
    }

    /**
      * Sets the value of the 'f3' field.
      * @param value The value of 'f3'.
      * @return This builder.
      */
    public com.harper.testing.serde.Base2.Builder setF3(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.f3 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'f3' field has been set.
      * @return True if the 'f3' field has been set, false otherwise.
      */
    public boolean hasF3() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'f3' field.
      * @return This builder.
      */
    public com.harper.testing.serde.Base2.Builder clearF3() {
      f3 = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'f4' field.
      * @return The value.
      */
    public java.lang.CharSequence getF4() {
      return f4;
    }

    /**
      * Sets the value of the 'f4' field.
      * @param value The value of 'f4'.
      * @return This builder.
      */
    public com.harper.testing.serde.Base2.Builder setF4(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.f4 = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'f4' field has been set.
      * @return True if the 'f4' field has been set, false otherwise.
      */
    public boolean hasF4() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'f4' field.
      * @return This builder.
      */
    public com.harper.testing.serde.Base2.Builder clearF4() {
      f4 = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Base2 build() {
      try {
        Base2 record = new Base2();
        record.f1 = fieldSetFlags()[0] ? this.f1 : (java.lang.Integer) defaultValue(fields()[0]);
        record.f1_2 = fieldSetFlags()[1] ? this.f1_2 : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.f2 = fieldSetFlags()[2] ? this.f2 : (java.lang.Long) defaultValue(fields()[2]);
        record.f3 = fieldSetFlags()[3] ? this.f3 : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.f4 = fieldSetFlags()[4] ? this.f4 : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Base2>
    WRITER$ = (org.apache.avro.io.DatumWriter<Base2>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Base2>
    READER$ = (org.apache.avro.io.DatumReader<Base2>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}