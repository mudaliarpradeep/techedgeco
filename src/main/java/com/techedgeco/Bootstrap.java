package com.techedgeco;

import static spark.Spark.get;

import spark.Spark;

public class Bootstrap {
	 	private static final String IP_ADDRESS = System.getenv("OPENSHIFT_DIY_IP") != null ? System.getenv("OPENSHIFT_DIY_IP") : "localhost";
	    private static final int PORT = System.getenv("OPENSHIFT_DIY_PORT") != null ? Integer.parseInt(System.getenv("OPENSHIFT_DIY_PORT")) : 8080;
	 
	    public static void main(String[] args) throws Exception {
	    	Spark.ipAddress(IP_ADDRESS);
	        Spark.port(PORT);
	        Spark.staticFileLocation("/public");
	    	
	    	get("/", (request, response) -> "Hello World");
	    }
	 
	    
}
