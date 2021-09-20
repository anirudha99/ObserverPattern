package com.observerpattern;

public class Data {
	String data;
	
	Data(String data){
		this.data = data;
	}

	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Data [data = " + data + "]";
	}

}
