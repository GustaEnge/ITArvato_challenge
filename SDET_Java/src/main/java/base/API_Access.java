package base;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.*;
import org.apache.http.client.methods.*;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


public class API_Access {

//    public String post(String url) throws Exception {
//        return this.post(url, null);
//    }
//
//    public String post(String url, HashMap<String, String> fields_in) throws Exception {
//        return this.request("POST", url, fields_in, null);
//    }
//
//    private String request(String method, String url, HashMap<String, String> fields_in, HashMap<String, String> headers_in) throws Exception {
//        CloseableHttpClient httpClient = HttpClients.createDefault();
//
//        HttpRequest request;
//        request = new HttpRequest(url);
//
//        if (headers_in != null && headers_in.size() > 0)
//            for(Map.Entry<String,String> par : headers_in.entrySet())
//                request.addHeader(par.getKey(),par.getKey());
//
//        if (fields_in != null && fields_in.size() > 0) {
//            List<NameValuePair> urlParameters = new ArrayList<>();
//            for(Map.Entry<String,String> par : headers_in.entrySet())
//                urlParameters.add(new BasicNameValuePair(par.getKey(), par.getValue()));
//        }
//
//        try (CloseableHttpResponse response = httpClient.execute((HttpUriRequest) request)) {
//
//            HttpEntity entity = response.getEntity();
//
//            if (entity != null) {
//                String result = EntityUtils.toString(entity);
//                return result;
//            } else {
//                return response.getEntity().toString();
//            }
//        }
//    }
}
