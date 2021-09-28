package com.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class AajTak<T> {

	List <Observer<T>> observeList = new ArrayList<>();

	public void register(Observer observer) {
		observeList.add(observer);
	}
	
	public void unRegister(Observer observer) {
		observeList.remove(observer);
	}

	public void update(T news) {
		for (Observer<T> observer : observeList) {
			if(observer.getRequiredNewsType() == ((News)news).getNewsType()){
				observer.onUpdate(news);
			}
		}
	}
}
