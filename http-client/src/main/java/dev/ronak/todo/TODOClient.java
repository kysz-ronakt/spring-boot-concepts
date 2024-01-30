package dev.ronak.todo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class TODOClient {

    private static final String URL = "https://jsonplaceholder.typicode.com/todos";
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public TODOClient() {
        httpClient = HttpClient.newHttpClient();
        objectMapper = new ObjectMapper();
    }


    public JsonNode findAll() throws IOException, InterruptedException {

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .GET()
                .build();

        HttpResponse<String> getAllResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());


        return objectMapper.readTree(getAllResponse.body());
    }

}
