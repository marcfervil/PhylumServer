package com.fourteenfourhundredstudios.phylum.onepage;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class ServerPage {

	 Map<String,String> urlParams=new HashMap<String,String>();
	 OutputStream op;
	 String file;
	 
	 public ServerPage(String file,OutputStream op ){
		 this.file="FileSystem/"+file;
		 this.op=op;
	 }
	 
	 public String getHeader(){
		 return null;
	 }
	 
	 public String getData(){
		 return null;
	 }
	 
	 public void sendResponse(){
		 try{
			 OutputStreamWriter osw = new OutputStreamWriter(op);
			 osw.write(getHeader());
			 osw.flush();
			 osw.write(getData());
			 osw.flush();
			 osw.close();
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 
	 }
	
}
  