// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProtoBuff.proto

package BuffProto;

/**
 * Protobuf type {@code protoBuff.MensagemPong2}
 */
public  final class MensagemPong2 extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protoBuff.MensagemPong2)
    MensagemPong2OrBuilder {
private static final long serialVersionUID = 0L;
  // Use MensagemPong2.newBuilder() to construct.
  private MensagemPong2(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MensagemPong2() {
    mensagemPong2_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MensagemPong2();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MensagemPong2(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            mensagemPong2_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BuffProto.ProtoBuff.internal_static_protoBuff_MensagemPong2_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BuffProto.ProtoBuff.internal_static_protoBuff_MensagemPong2_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BuffProto.MensagemPong2.class, BuffProto.MensagemPong2.Builder.class);
  }

  public static final int MENSAGEMPONG2_FIELD_NUMBER = 1;
  private volatile java.lang.Object mensagemPong2_;
  /**
   * <code>string mensagemPong2 = 1;</code>
   * @return The mensagemPong2.
   */
  public java.lang.String getMensagemPong2() {
    java.lang.Object ref = mensagemPong2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mensagemPong2_ = s;
      return s;
    }
  }
  /**
   * <code>string mensagemPong2 = 1;</code>
   * @return The bytes for mensagemPong2.
   */
  public com.google.protobuf.ByteString
      getMensagemPong2Bytes() {
    java.lang.Object ref = mensagemPong2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mensagemPong2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMensagemPong2Bytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mensagemPong2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMensagemPong2Bytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mensagemPong2_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof BuffProto.MensagemPong2)) {
      return super.equals(obj);
    }
    BuffProto.MensagemPong2 other = (BuffProto.MensagemPong2) obj;

    if (!getMensagemPong2()
        .equals(other.getMensagemPong2())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MENSAGEMPONG2_FIELD_NUMBER;
    hash = (53 * hash) + getMensagemPong2().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BuffProto.MensagemPong2 parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BuffProto.MensagemPong2 parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BuffProto.MensagemPong2 parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BuffProto.MensagemPong2 parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BuffProto.MensagemPong2 parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BuffProto.MensagemPong2 parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BuffProto.MensagemPong2 parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BuffProto.MensagemPong2 parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static BuffProto.MensagemPong2 parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static BuffProto.MensagemPong2 parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BuffProto.MensagemPong2 parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BuffProto.MensagemPong2 parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(BuffProto.MensagemPong2 prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code protoBuff.MensagemPong2}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protoBuff.MensagemPong2)
      BuffProto.MensagemPong2OrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BuffProto.ProtoBuff.internal_static_protoBuff_MensagemPong2_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BuffProto.ProtoBuff.internal_static_protoBuff_MensagemPong2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BuffProto.MensagemPong2.class, BuffProto.MensagemPong2.Builder.class);
    }

    // Construct using BuffProto.MensagemPong2.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      mensagemPong2_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BuffProto.ProtoBuff.internal_static_protoBuff_MensagemPong2_descriptor;
    }

    @java.lang.Override
    public BuffProto.MensagemPong2 getDefaultInstanceForType() {
      return BuffProto.MensagemPong2.getDefaultInstance();
    }

    @java.lang.Override
    public BuffProto.MensagemPong2 build() {
      BuffProto.MensagemPong2 result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public BuffProto.MensagemPong2 buildPartial() {
      BuffProto.MensagemPong2 result = new BuffProto.MensagemPong2(this);
      result.mensagemPong2_ = mensagemPong2_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof BuffProto.MensagemPong2) {
        return mergeFrom((BuffProto.MensagemPong2)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BuffProto.MensagemPong2 other) {
      if (other == BuffProto.MensagemPong2.getDefaultInstance()) return this;
      if (!other.getMensagemPong2().isEmpty()) {
        mensagemPong2_ = other.mensagemPong2_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      BuffProto.MensagemPong2 parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (BuffProto.MensagemPong2) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mensagemPong2_ = "";
    /**
     * <code>string mensagemPong2 = 1;</code>
     * @return The mensagemPong2.
     */
    public java.lang.String getMensagemPong2() {
      java.lang.Object ref = mensagemPong2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mensagemPong2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string mensagemPong2 = 1;</code>
     * @return The bytes for mensagemPong2.
     */
    public com.google.protobuf.ByteString
        getMensagemPong2Bytes() {
      java.lang.Object ref = mensagemPong2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mensagemPong2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string mensagemPong2 = 1;</code>
     * @param value The mensagemPong2 to set.
     * @return This builder for chaining.
     */
    public Builder setMensagemPong2(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mensagemPong2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string mensagemPong2 = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMensagemPong2() {
      
      mensagemPong2_ = getDefaultInstance().getMensagemPong2();
      onChanged();
      return this;
    }
    /**
     * <code>string mensagemPong2 = 1;</code>
     * @param value The bytes for mensagemPong2 to set.
     * @return This builder for chaining.
     */
    public Builder setMensagemPong2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mensagemPong2_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:protoBuff.MensagemPong2)
  }

  // @@protoc_insertion_point(class_scope:protoBuff.MensagemPong2)
  private static final BuffProto.MensagemPong2 DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BuffProto.MensagemPong2();
  }

  public static BuffProto.MensagemPong2 getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MensagemPong2>
      PARSER = new com.google.protobuf.AbstractParser<MensagemPong2>() {
    @java.lang.Override
    public MensagemPong2 parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MensagemPong2(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MensagemPong2> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MensagemPong2> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public BuffProto.MensagemPong2 getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

