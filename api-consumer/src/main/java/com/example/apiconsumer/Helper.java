package com.example.apiconsumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.HashMap;
import java.util.Map;

public class Helper {

  public static String send(String id, String phone) throws Exception{
    Map m = new HashMap();
    if (id != null)
      m.put("id", id);
    if (phone != null)
      m.put("phone", phone);

    String json = new ObjectMapper().writeValueAsString(m);

    HttpRequest request = HttpRequest.newBuilder()
        .uri(new URI("http://localhost:8080/contacts"))
        .POST(HttpRequest.BodyPublishers.ofString(json))
        .header("content-type","application/json")
        .build();

    HttpResponse<String> response = HttpClient.newHttpClient()
        .send(request, BodyHandlers.ofString());

    if(response.statusCode() != 200)
      throw new Exception("Error");
    return response.body();
  }

}
