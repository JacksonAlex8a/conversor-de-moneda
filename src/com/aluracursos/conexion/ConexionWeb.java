package com.aluracursos.conexion;

import com.aluracursos.moneda.Moneda;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionWeb {

    public void conexionApi(String url) throws IOException, InterruptedException {

        try {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();

        Moneda cnx = gson.fromJson(json, Moneda.class);
         System.out.println(cnx);

        }catch(Exception e){

            System.out.println("Error: " + e);
        }
    }

     public String url(String pais1,String Pais2,int valor) {

        return "https://v6.exchangerate-api.com/v6/9ce9034a5fbf2a45de6e1d71/pair/"+pais1+"/"+Pais2+"/"+valor;
   }

}
