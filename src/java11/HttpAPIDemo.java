package java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpAPIDemo {
    public static void main(String[] args) {
        String uri = "https://postman-echo.com/get?uname=mahesh&pwd=12131";
        HttpRequest req = HttpRequest.newBuilder()
                          .uri(URI.create(uri)).GET().version(HttpClient.Version.HTTP_2).build();

        HttpClient client = HttpClient.newBuilder().build();

        HttpResponse<String> resp = null;
        try {
            resp = client.send(req, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(resp.statusCode());
        System.out.println(resp.body());


    }
}
