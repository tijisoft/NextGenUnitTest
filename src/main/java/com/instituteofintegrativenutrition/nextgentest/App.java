package com.instituteofintegrativenutrition.nextgentest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;


import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;

public class App 
{
    public static void main( String[] args ) throws URISyntaxException, NoSuchAlgorithmException
    {
        
            
        Client client = Client.create();
        WebResource resource = client.resource(new URI("http://iinlmsstg.prod.acquia-sites.com"));
        resource.addFilter(new HTTPBasicAuthFilter("webdev","webdev"));
        
        resource.path("/services/session/token");
        
        String token = resource.get(String.class);
        
        System.out.println(token);
        
        
    }
}
