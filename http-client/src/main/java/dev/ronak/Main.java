package dev.ronak;

import dev.ronak.todo.TODOClient;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello world!");

        TODOClient todoClient = new TODOClient();
        var list = todoClient.findAll();

        System.out.println("list = " + list);


        JSONArray jsonArray = new JSONArray(list);

        //Below given code has some issue

        // Iterate through the JSON array
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            System.out.println("jsonObject = " + jsonObject.get("integralNumber"));
            // Access individual elements
//            int userId = jsonObject.getInt("userId");
//            int id = jsonObject.getInt("id");
//            String title = jsonObject.getString("title");
//            boolean completed = jsonObject.getBoolean("completed");

            // Print or process individual elements
//            System.out.println("User ID: " + userId);
//            System.out.println("ID: " + id);
//            System.out.println("Title: " + title);
//            System.out.println("Completed: " + completed);
            System.out.println();
        }


    }
}