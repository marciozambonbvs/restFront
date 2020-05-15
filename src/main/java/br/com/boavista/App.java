package br.com.boavista;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class App{
    public static void main( String[] args ){
        RestTemplate client = new RestTemplate();
        String url = "http://localhost:8080/cliente/1";
        ResponseEntity<String> response = client.getForEntity(url, String.class);
        System.out.println(response.getBody());
    }
}
