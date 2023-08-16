package com.tran.services;

import java.io.IOException;


import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.ResponseEntity;
// import com.azure.ai.translation.text.TranslationDocumentClient;
import org.springframework.stereotype.Service;
// import com.azure.ai.translation.document.TranslationDocumentClient;
import org.springframework.web.client.RestTemplate;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;



@Service
public class TranslateService {

   // @Value("${azure.cognitive.subscription-key}")
   private static final String key = "bbdcab5ec356434ea01275fc162e9910";

   // @Value("${azure.cognitive.endpoint}")
   private static final String location = "centralus";

   OkHttpClient client = new OkHttpClient();
   
  public String translateText(String sourceLang, String targetLang, String text) throws IOException {
        MediaType mediaType = MediaType.parse("application/json");
        String jsonBody = "[{\"Text\":\""+ text +"\"}]";
        RequestBody body = RequestBody.create(jsonBody, mediaType);
        Request request = new Request.Builder()
                .url("https://api.cognitive.microsofttranslator.com/translate?api-version=3.0&from=" + sourceLang + "&to=" + targetLang)
                .post(body)
                .addHeader("Ocp-Apim-Subscription-Key", key)
                // location required if you're using a multi-service or regional (not global) resource. 
                .addHeader("Ocp-Apim-Subscription-Region", location) 
                .addHeader("Content-type", "application/json")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
    
    }



    

