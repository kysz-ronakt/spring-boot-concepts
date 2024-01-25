package dev.ronak.multipledatastoredemo.restClient;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RestService {

    private final RestClient restClient;

    public RestService(RestClient.Builder builder){
    this.restClient = builder
            .baseUrl("https://jsonplaceholder.typicode.com")
            .build();
    }



    public String findAll(){

        return restClient.get()
                .uri("/users")
                .retrieve()
                .body(String.class);

    }





}
