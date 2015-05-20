import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


public class HttpClientFormAuthentication {
    public static void main(String[] agrs) {
        String host = "fumec.bv3.digitalpages.com.br";
        int port = 8080;
        String protocol = "http";
 
        DefaultHttpClient client = new DefaultHttpClient();
 
        try {
            HttpHost httpHost = new HttpHost(host, port, protocol);
            client.getParams().setParameter(ClientPNames.DEFAULT_HOST, httpHost);
 
            HttpGet securedResource = new HttpGet("/users/sign_in");            
            HttpResponse httpResponse = client.execute(securedResource);
            HttpEntity responseEntity = httpResponse.getEntity();
            String strResponse = EntityUtils.toString(responseEntity);
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            EntityUtils.consume(responseEntity);
 
            System.out.println("Http status code for Unauthenticated Request: " + statusCode);// Statue code should be 200
            System.out.println("Response for Unauthenticated Request: \n" + strResponse); // Should be login page
            System.out.println("================================================================\n");
 
            HttpPost authpost = new HttpPost("/j_security_check");
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("login", "224731971"));
            nameValuePairs.add(new BasicNameValuePair("password", "220718"));
            authpost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
 
            httpResponse = client.execute(authpost);
            responseEntity = httpResponse.getEntity();
            strResponse = EntityUtils.toString(responseEntity);
            statusCode = httpResponse.getStatusLine().getStatusCode();
            EntityUtils.consume(responseEntity);
 
            System.out.println("Http status code for Authenticattion Request: " + statusCode);// Status code should be 302
            System.out.println("Response for Authenticattion Request: \n" + strResponse); // Should be blank string
            System.out.println("================================================================\n");
 
            httpResponse = client.execute(securedResource);
            responseEntity = httpResponse.getEntity();
            strResponse = EntityUtils.toString(responseEntity);
            statusCode = httpResponse.getStatusLine().getStatusCode();
            EntityUtils.consume(responseEntity);
 
            System.out.println("Http status code for Authenticated Request: " + statusCode);// Status code should be 200
            System.out.println("Response for Authenticated Request: \n" + strResponse);// Should be actual page
            System.out.println("================================================================\n");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}