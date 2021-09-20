package com.observerpattern;

public class Observer2<T> implements Observer<T> {

	@Override
	public void onUpdate(T data) {
		System.out.println(data);
	}

}
