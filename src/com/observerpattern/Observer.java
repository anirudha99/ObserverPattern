package com.observerpattern;

public interface Observer<T> {
	public default void onUpdate(T data) {
	}
}
