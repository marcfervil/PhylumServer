package com.fourteenfourhundredstudios.phylum.onepage;

import java.io.OutputStream;

import com.fourteenfourhundredstudios.phylum.Utilities;

public class HTMLPage extends ServerPage{

	public HTMLPage(String file,OutputStream op) {
		super(file,op);
	}

	public String getData(){
		return Utilities.readFile(file);
	}
	
	 public String getHeader(){
		return 		
			"HTTP/1.1 200 OK\r\n"+
			"Content-Type: text/html; charset=UTF-8\r\n"+
			"Content-Encoding: UTF-8\r\n"+
			"Server: OnePage\r\n"+
			"Accept-Ranges: bytes\r\n"+
			"\r\n";
	 }
	 
	 
	
}
