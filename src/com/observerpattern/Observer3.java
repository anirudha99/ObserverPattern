package com.observerpattern;

public class Observer3<T> implements Observer<T> {

	@Override
	public void onUpdate(T data) {
		System.out.println(data);
	}
	
}
