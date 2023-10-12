package org.flowdy.services;

import com.flowdy.grpc.square.SquareRequest;
import com.flowdy.grpc.square.SquareServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class SquareService {
    @GrpcClient("grpc-client")
    private SquareServiceGrpc.SquareServiceBlockingStub squareServiceBlockingStub;

    public double calculateArea(double wide) {
        SquareRequest request = SquareRequest.newBuilder()
                .setWide(wide)
                .build();
        return squareServiceBlockingStub.area(request).getResult();
    }
    public double calculateCircumference(double wide) {
        SquareRequest request = SquareRequest.newBuilder()
                .setWide(wide)
                .build();
        return squareServiceBlockingStub.circumference(request).getResult();
    }
}
