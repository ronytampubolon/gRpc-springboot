// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: square.proto

package com.flowdy.grpc.square;

public final class Square {
  private Square() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_flowdy_grpc_square_SquareRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_flowdy_grpc_square_SquareRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_flowdy_grpc_square_SquareResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_flowdy_grpc_square_SquareResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014square.proto\022\026com.flowdy.grpc.square\"\035" +
      "\n\rSquareRequest\022\014\n\004wide\030\001 \001(\001\" \n\016SquareR" +
      "esponse\022\016\n\006result\030\001 \001(\0012\306\001\n\rSquareServic" +
      "e\022U\n\004area\022%.com.flowdy.grpc.square.Squar" +
      "eRequest\032&.com.flowdy.grpc.square.Square" +
      "Response\022^\n\rcircumference\022%.com.flowdy.g" +
      "rpc.square.SquareRequest\032&.com.flowdy.gr" +
      "pc.square.SquareResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_flowdy_grpc_square_SquareRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_flowdy_grpc_square_SquareRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_flowdy_grpc_square_SquareRequest_descriptor,
        new java.lang.String[] { "Wide", });
    internal_static_com_flowdy_grpc_square_SquareResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_flowdy_grpc_square_SquareResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_flowdy_grpc_square_SquareResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}