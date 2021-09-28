package com.observerpattern;

import com.observerpattern.News.NewsType;

public class DelhiAajTak<T> implements Observer<T> {

	@Override
	public void onUpdate(T news) {
		if(news instanceof News) {
			System.out.println(((News)news).getNews());
		}
	}

	@Override
	public NewsType getRequiredNewsType() {
		return News.NewsType.DELHI_NEWS;
	}
}
