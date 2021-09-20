package com.observerpattern;

public class Observer1<T> implements Observer<T>{

	@Override
	public void onUpdate(T data) {
		if(data instanceof Data) {
			System.out.println((Data(data)).getData());
		}
	}
}
