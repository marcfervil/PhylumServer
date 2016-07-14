package com.fourteenfourhundredstudios.phylum;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Utilities {

	private static BufferedReader br;
	
	public static String readFile(String fn){
		String f ="";
		try{
			br = new BufferedReader(new FileReader(new File(fn)));
			while(br.ready()){
				f+=br.readLine();
			}
		f=f.replace("\t", "");
		}catch(Exception e){
			e.printStackTrace();
		}
		return f;
	}
	
	public static String[] getSentences(String str){
		return str.split("\\.");
	}
	

	
	
}
