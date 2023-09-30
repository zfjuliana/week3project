package api;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;

import java.io.IOException;

public class InstagramApiCall {
    public static void main(String[] args) {
        getUserName();
    }
    public static void getUserName() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        Request request = new Request.Builder()
                .url("https://graph.instagram.com/6837159636347893?fields=id,username&access_token=IGQWRNSDBfV0J3ZA0puZA0oxa0ltTlB2YkJSR3Y0VnFwQUlhY2NWaXZAqbldqQTdab3B0ZATl5UXVqNVo1bXVKMTlOZAFY1ZAHR3VVhPZAFRlZA1FydmtnN1BPQ2psdzlmVG9FamV1LTZAYUk9OWXZAQVWU3UExzMEszUGZAzOFVPWng2djFrcUFUZAwZDZD")
                .addHeader("Cookie", "csrftoken=h6BReBKgcwn9JMhsZde0VYWRmzVz6G3p; ig_did=7FC36690-209E-41E1-95BC-FA2359F828F8; ig_nrcb=1; mid=ZReT8AAEAAHA-ipEzvMnxQRqDBWa")
                .build();

        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);
        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
