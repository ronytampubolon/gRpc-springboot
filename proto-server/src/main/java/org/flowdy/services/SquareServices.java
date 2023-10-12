package org.flowdy.services;

import com.flowdy.grpc.square.SquareRequest;
import com.flowdy.grpc.square.SquareResponse;
import com.flowdy.grpc.square.SquareServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SquareServices extends SquareServiceGrpc.SquareServiceImplBase {
    @Override
    public void area(SquareRequest request, StreamObserver<SquareResponse> responseObserver) {
        SquareResponse reply = SquareResponse.newBuilder()
                .setResult(Math.pow(request.getWide(),2))
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    @Override
    public void circumference(SquareRequest request, StreamObserver<SquareResponse> responseObserver) {
        SquareResponse reply = SquareResponse.newBuilder()
                .setResult(4 * request.getWide())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
