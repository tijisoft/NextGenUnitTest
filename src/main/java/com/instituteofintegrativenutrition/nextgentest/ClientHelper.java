/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.instituteofintegrativenutrition.nextgentest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.net.URI;

public class ClientHelper {
   
Client client;
WebResource resource;
URI baseURL;
String servicePath;
kindOfRequest kind;

    public ClientHelper(URI baseURL) {
    }


        
}
