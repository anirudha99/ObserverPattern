package com.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> {
	
	List<Observer<T>> observeList = new ArrayList<>();
	
	public void register(Observer<T> observer) {
		observeList.add(observer);
	}
	
	public void update(T data) {
		for (Observer<T> observer : observeList) {
			observer.onUpdate(data);
		}
	}
}
