package org.flowdy;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.flowdy.services.HelloServices;

import java.io.IOException;

//@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) throws IOException, InterruptedException{
        Server server = ServerBuilder.forPort(9090)
                .addService(new HelloServices()).build();
        System.out.println("Starting server...");
        server.start();
        System.out.println("Server started!");
        server.awaitTermination();
    }
}