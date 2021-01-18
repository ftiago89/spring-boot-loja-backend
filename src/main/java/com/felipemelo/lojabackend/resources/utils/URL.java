package com.felipemelo.lojabackend.resources.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class URL {
	
	public static String decodeParam(String s) {
		try {
			return URLDecoder.decode(s, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
	public static List<Integer> decodeIntList(String s){
		String [] vet = s.split(",");
		List<Integer> ids = new ArrayList<>();
		
		for (String i: vet) {
			ids.add(Integer.parseInt(i));
		}
		
		return ids;
	}

}
