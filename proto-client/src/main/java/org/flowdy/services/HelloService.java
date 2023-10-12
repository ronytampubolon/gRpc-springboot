package org.flowdy.services;

import com.flowdy.grpc.HelloRequest;
import com.flowdy.grpc.HelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
@Service
public class HelloService {
    @GrpcClient("grpc-client")
    private HelloServiceGrpc.HelloServiceBlockingStub helloServiceStub;

    public String receiveGreeting(String name) {
        HelloRequest request = HelloRequest.newBuilder()
                .setName(name)
                .build();
        return helloServiceStub.hello(request).getGreeting();
    }
}
