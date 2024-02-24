package com.dev.avro;

import com.dev.avro.serialize.DataSerialize;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ApacheAvroLatestApplication {


    public static void main(String[] args) {
        SpringApplication.run(ApacheAvroLatestApplication.class, args);

        try {
            DataSerialize.generateAvroFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
