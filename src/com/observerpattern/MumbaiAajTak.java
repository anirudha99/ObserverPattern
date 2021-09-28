package com.observerpattern;

import com.observerpattern.News.NewsType;

public class MumbaiAajTak<T> implements Observer<T>{

	@Override
	public void onUpdate(T news) {
		if(news instanceof News) {
			System.out.println(((News)news).getNews());
		}
	}

	@Override
	public NewsType getRequiredNewsType() {
		return News.NewsType.MUMBAI_NEWS;
	}
}
