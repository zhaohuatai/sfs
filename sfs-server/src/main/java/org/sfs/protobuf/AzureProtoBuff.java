/*
 *
 * Copyright (C) 2009 The Simple File Server Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS-IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/AzureProtoBuff.proto

package org.sfs.protobuf;

public final class AzureProtoBuff {
  private AzureProtoBuff() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CipherTextOrBuilder extends
      // @@protoc_insertion_point(interface_extends:org.sfs.protobuf.CipherText)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional bytes data = 1;</code>
     */
    com.google.protobuf.ByteString getData();

    /**
     * <code>optional string keyIdentifier = 2;</code>
     */
    java.lang.String getKeyIdentifier();
    /**
     * <code>optional string keyIdentifier = 2;</code>
     */
    com.google.protobuf.ByteString
        getKeyIdentifierBytes();

    /**
     * <code>optional string algorithm = 3;</code>
     */
    java.lang.String getAlgorithm();
    /**
     * <code>optional string algorithm = 3;</code>
     */
    com.google.protobuf.ByteString
        getAlgorithmBytes();
  }
  /**
   * Protobuf type {@code org.sfs.protobuf.CipherText}
   */
  public  static final class CipherText extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:org.sfs.protobuf.CipherText)
      CipherTextOrBuilder {
    // Use CipherText.newBuilder() to construct.
    private CipherText(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CipherText() {
      data_ = com.google.protobuf.ByteString.EMPTY;
      keyIdentifier_ = "";
      algorithm_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private CipherText(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {

              data_ = input.readBytes();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              keyIdentifier_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              algorithm_ = s;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sfs.protobuf.AzureProtoBuff.internal_static_org_sfs_protobuf_CipherText_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sfs.protobuf.AzureProtoBuff.internal_static_org_sfs_protobuf_CipherText_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sfs.protobuf.AzureProtoBuff.CipherText.class, org.sfs.protobuf.AzureProtoBuff.CipherText.Builder.class);
    }

    public static final int DATA_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>optional bytes data = 1;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    public static final int KEYIDENTIFIER_FIELD_NUMBER = 2;
    private volatile java.lang.Object keyIdentifier_;
    /**
     * <code>optional string keyIdentifier = 2;</code>
     */
    public java.lang.String getKeyIdentifier() {
      java.lang.Object ref = keyIdentifier_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyIdentifier_ = s;
        return s;
      }
    }
    /**
     * <code>optional string keyIdentifier = 2;</code>
     */
    public com.google.protobuf.ByteString
        getKeyIdentifierBytes() {
      java.lang.Object ref = keyIdentifier_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyIdentifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALGORITHM_FIELD_NUMBER = 3;
    private volatile java.lang.Object algorithm_;
    /**
     * <code>optional string algorithm = 3;</code>
     */
    public java.lang.String getAlgorithm() {
      java.lang.Object ref = algorithm_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        algorithm_ = s;
        return s;
      }
    }
    /**
     * <code>optional string algorithm = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAlgorithmBytes() {
      java.lang.Object ref = algorithm_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        algorithm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!data_.isEmpty()) {
        output.writeBytes(1, data_);
      }
      if (!getKeyIdentifierBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyIdentifier_);
      }
      if (!getAlgorithmBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, algorithm_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!data_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, data_);
      }
      if (!getKeyIdentifierBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keyIdentifier_);
      }
      if (!getAlgorithmBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, algorithm_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.sfs.protobuf.AzureProtoBuff.CipherText)) {
        return super.equals(obj);
      }
      org.sfs.protobuf.AzureProtoBuff.CipherText other = (org.sfs.protobuf.AzureProtoBuff.CipherText) obj;

      boolean result = true;
      result = result && getData()
          .equals(other.getData());
      result = result && getKeyIdentifier()
          .equals(other.getKeyIdentifier());
      result = result && getAlgorithm()
          .equals(other.getAlgorithm());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (37 * hash) + KEYIDENTIFIER_FIELD_NUMBER;
      hash = (53 * hash) + getKeyIdentifier().hashCode();
      hash = (37 * hash) + ALGORITHM_FIELD_NUMBER;
      hash = (53 * hash) + getAlgorithm().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.sfs.protobuf.AzureProtoBuff.CipherText parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sfs.protobuf.AzureProtoBuff.CipherText parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sfs.protobuf.AzureProtoBuff.CipherText parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.sfs.protobuf.AzureProtoBuff.CipherText parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.sfs.protobuf.AzureProtoBuff.CipherText parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sfs.protobuf.AzureProtoBuff.CipherText parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sfs.protobuf.AzureProtoBuff.CipherText parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.sfs.protobuf.AzureProtoBuff.CipherText parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.sfs.protobuf.AzureProtoBuff.CipherText parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.sfs.protobuf.AzureProtoBuff.CipherText parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.sfs.protobuf.AzureProtoBuff.CipherText prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code org.sfs.protobuf.CipherText}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:org.sfs.protobuf.CipherText)
        org.sfs.protobuf.AzureProtoBuff.CipherTextOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.sfs.protobuf.AzureProtoBuff.internal_static_org_sfs_protobuf_CipherText_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.sfs.protobuf.AzureProtoBuff.internal_static_org_sfs_protobuf_CipherText_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.sfs.protobuf.AzureProtoBuff.CipherText.class, org.sfs.protobuf.AzureProtoBuff.CipherText.Builder.class);
      }

      // Construct using org.sfs.protobuf.AzureProtoBuff.CipherText.newBuilder()
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
      public Builder clear() {
        super.clear();
        data_ = com.google.protobuf.ByteString.EMPTY;

        keyIdentifier_ = "";

        algorithm_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.sfs.protobuf.AzureProtoBuff.internal_static_org_sfs_protobuf_CipherText_descriptor;
      }

      public org.sfs.protobuf.AzureProtoBuff.CipherText getDefaultInstanceForType() {
        return org.sfs.protobuf.AzureProtoBuff.CipherText.getDefaultInstance();
      }

      public org.sfs.protobuf.AzureProtoBuff.CipherText build() {
        org.sfs.protobuf.AzureProtoBuff.CipherText result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.sfs.protobuf.AzureProtoBuff.CipherText buildPartial() {
        org.sfs.protobuf.AzureProtoBuff.CipherText result = new org.sfs.protobuf.AzureProtoBuff.CipherText(this);
        result.data_ = data_;
        result.keyIdentifier_ = keyIdentifier_;
        result.algorithm_ = algorithm_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.sfs.protobuf.AzureProtoBuff.CipherText) {
          return mergeFrom((org.sfs.protobuf.AzureProtoBuff.CipherText)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.sfs.protobuf.AzureProtoBuff.CipherText other) {
        if (other == org.sfs.protobuf.AzureProtoBuff.CipherText.getDefaultInstance()) return this;
        if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
          setData(other.getData());
        }
        if (!other.getKeyIdentifier().isEmpty()) {
          keyIdentifier_ = other.keyIdentifier_;
          onChanged();
        }
        if (!other.getAlgorithm().isEmpty()) {
          algorithm_ = other.algorithm_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.sfs.protobuf.AzureProtoBuff.CipherText parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.sfs.protobuf.AzureProtoBuff.CipherText) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes data = 1;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>optional bytes data = 1;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes data = 1;</code>
       */
      public Builder clearData() {
        
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      private java.lang.Object keyIdentifier_ = "";
      /**
       * <code>optional string keyIdentifier = 2;</code>
       */
      public java.lang.String getKeyIdentifier() {
        java.lang.Object ref = keyIdentifier_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          keyIdentifier_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string keyIdentifier = 2;</code>
       */
      public com.google.protobuf.ByteString
          getKeyIdentifierBytes() {
        java.lang.Object ref = keyIdentifier_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          keyIdentifier_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string keyIdentifier = 2;</code>
       */
      public Builder setKeyIdentifier(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        keyIdentifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string keyIdentifier = 2;</code>
       */
      public Builder clearKeyIdentifier() {
        
        keyIdentifier_ = getDefaultInstance().getKeyIdentifier();
        onChanged();
        return this;
      }
      /**
       * <code>optional string keyIdentifier = 2;</code>
       */
      public Builder setKeyIdentifierBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        keyIdentifier_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object algorithm_ = "";
      /**
       * <code>optional string algorithm = 3;</code>
       */
      public java.lang.String getAlgorithm() {
        java.lang.Object ref = algorithm_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          algorithm_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string algorithm = 3;</code>
       */
      public com.google.protobuf.ByteString
          getAlgorithmBytes() {
        java.lang.Object ref = algorithm_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          algorithm_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string algorithm = 3;</code>
       */
      public Builder setAlgorithm(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        algorithm_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string algorithm = 3;</code>
       */
      public Builder clearAlgorithm() {
        
        algorithm_ = getDefaultInstance().getAlgorithm();
        onChanged();
        return this;
      }
      /**
       * <code>optional string algorithm = 3;</code>
       */
      public Builder setAlgorithmBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        algorithm_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:org.sfs.protobuf.CipherText)
    }

    // @@protoc_insertion_point(class_scope:org.sfs.protobuf.CipherText)
    private static final org.sfs.protobuf.AzureProtoBuff.CipherText DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.sfs.protobuf.AzureProtoBuff.CipherText();
    }

    public static org.sfs.protobuf.AzureProtoBuff.CipherText getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CipherText>
        PARSER = new com.google.protobuf.AbstractParser<CipherText>() {
      public CipherText parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CipherText(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CipherText> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CipherText> getParserForType() {
      return PARSER;
    }

    public org.sfs.protobuf.AzureProtoBuff.CipherText getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_sfs_protobuf_CipherText_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_sfs_protobuf_CipherText_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'src/main/resources/AzureProtoBuff.prot" +
      "o\022\020org.sfs.protobuf\"D\n\nCipherText\022\014\n\004dat" +
      "a\030\001 \001(\014\022\025\n\rkeyIdentifier\030\002 \001(\t\022\021\n\talgori" +
      "thm\030\003 \001(\tb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_sfs_protobuf_CipherText_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_sfs_protobuf_CipherText_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_sfs_protobuf_CipherText_descriptor,
        new java.lang.String[] { "Data", "KeyIdentifier", "Algorithm", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}