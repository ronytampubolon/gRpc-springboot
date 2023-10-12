package com.flowdy.grpc.square;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: square.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SquareServiceGrpc {

  private SquareServiceGrpc() {}

  public static final String SERVICE_NAME = "com.flowdy.grpc.square.SquareService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.flowdy.grpc.square.SquareRequest,
      com.flowdy.grpc.square.SquareResponse> getAreaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "area",
      requestType = com.flowdy.grpc.square.SquareRequest.class,
      responseType = com.flowdy.grpc.square.SquareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.flowdy.grpc.square.SquareRequest,
      com.flowdy.grpc.square.SquareResponse> getAreaMethod() {
    io.grpc.MethodDescriptor<com.flowdy.grpc.square.SquareRequest, com.flowdy.grpc.square.SquareResponse> getAreaMethod;
    if ((getAreaMethod = SquareServiceGrpc.getAreaMethod) == null) {
      synchronized (SquareServiceGrpc.class) {
        if ((getAreaMethod = SquareServiceGrpc.getAreaMethod) == null) {
          SquareServiceGrpc.getAreaMethod = getAreaMethod =
              io.grpc.MethodDescriptor.<com.flowdy.grpc.square.SquareRequest, com.flowdy.grpc.square.SquareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "area"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flowdy.grpc.square.SquareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flowdy.grpc.square.SquareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SquareServiceMethodDescriptorSupplier("area"))
              .build();
        }
      }
    }
    return getAreaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.flowdy.grpc.square.SquareRequest,
      com.flowdy.grpc.square.SquareResponse> getCircumferenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "circumference",
      requestType = com.flowdy.grpc.square.SquareRequest.class,
      responseType = com.flowdy.grpc.square.SquareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.flowdy.grpc.square.SquareRequest,
      com.flowdy.grpc.square.SquareResponse> getCircumferenceMethod() {
    io.grpc.MethodDescriptor<com.flowdy.grpc.square.SquareRequest, com.flowdy.grpc.square.SquareResponse> getCircumferenceMethod;
    if ((getCircumferenceMethod = SquareServiceGrpc.getCircumferenceMethod) == null) {
      synchronized (SquareServiceGrpc.class) {
        if ((getCircumferenceMethod = SquareServiceGrpc.getCircumferenceMethod) == null) {
          SquareServiceGrpc.getCircumferenceMethod = getCircumferenceMethod =
              io.grpc.MethodDescriptor.<com.flowdy.grpc.square.SquareRequest, com.flowdy.grpc.square.SquareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "circumference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flowdy.grpc.square.SquareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flowdy.grpc.square.SquareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SquareServiceMethodDescriptorSupplier("circumference"))
              .build();
        }
      }
    }
    return getCircumferenceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SquareServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SquareServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SquareServiceStub>() {
        @java.lang.Override
        public SquareServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SquareServiceStub(channel, callOptions);
        }
      };
    return SquareServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SquareServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SquareServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SquareServiceBlockingStub>() {
        @java.lang.Override
        public SquareServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SquareServiceBlockingStub(channel, callOptions);
        }
      };
    return SquareServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SquareServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SquareServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SquareServiceFutureStub>() {
        @java.lang.Override
        public SquareServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SquareServiceFutureStub(channel, callOptions);
        }
      };
    return SquareServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SquareServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void area(com.flowdy.grpc.square.SquareRequest request,
        io.grpc.stub.StreamObserver<com.flowdy.grpc.square.SquareResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAreaMethod(), responseObserver);
    }

    /**
     */
    public void circumference(com.flowdy.grpc.square.SquareRequest request,
        io.grpc.stub.StreamObserver<com.flowdy.grpc.square.SquareResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCircumferenceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAreaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.flowdy.grpc.square.SquareRequest,
                com.flowdy.grpc.square.SquareResponse>(
                  this, METHODID_AREA)))
          .addMethod(
            getCircumferenceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.flowdy.grpc.square.SquareRequest,
                com.flowdy.grpc.square.SquareResponse>(
                  this, METHODID_CIRCUMFERENCE)))
          .build();
    }
  }

  /**
   */
  public static final class SquareServiceStub extends io.grpc.stub.AbstractAsyncStub<SquareServiceStub> {
    private SquareServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SquareServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SquareServiceStub(channel, callOptions);
    }

    /**
     */
    public void area(com.flowdy.grpc.square.SquareRequest request,
        io.grpc.stub.StreamObserver<com.flowdy.grpc.square.SquareResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAreaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void circumference(com.flowdy.grpc.square.SquareRequest request,
        io.grpc.stub.StreamObserver<com.flowdy.grpc.square.SquareResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCircumferenceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SquareServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SquareServiceBlockingStub> {
    private SquareServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SquareServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SquareServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.flowdy.grpc.square.SquareResponse area(com.flowdy.grpc.square.SquareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAreaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.flowdy.grpc.square.SquareResponse circumference(com.flowdy.grpc.square.SquareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCircumferenceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SquareServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SquareServiceFutureStub> {
    private SquareServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SquareServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SquareServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.flowdy.grpc.square.SquareResponse> area(
        com.flowdy.grpc.square.SquareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAreaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.flowdy.grpc.square.SquareResponse> circumference(
        com.flowdy.grpc.square.SquareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCircumferenceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AREA = 0;
  private static final int METHODID_CIRCUMFERENCE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SquareServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SquareServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AREA:
          serviceImpl.area((com.flowdy.grpc.square.SquareRequest) request,
              (io.grpc.stub.StreamObserver<com.flowdy.grpc.square.SquareResponse>) responseObserver);
          break;
        case METHODID_CIRCUMFERENCE:
          serviceImpl.circumference((com.flowdy.grpc.square.SquareRequest) request,
              (io.grpc.stub.StreamObserver<com.flowdy.grpc.square.SquareResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SquareServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SquareServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.flowdy.grpc.square.Square.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SquareService");
    }
  }

  private static final class SquareServiceFileDescriptorSupplier
      extends SquareServiceBaseDescriptorSupplier {
    SquareServiceFileDescriptorSupplier() {}
  }

  private static final class SquareServiceMethodDescriptorSupplier
      extends SquareServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SquareServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SquareServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SquareServiceFileDescriptorSupplier())
              .addMethod(getAreaMethod())
              .addMethod(getCircumferenceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
