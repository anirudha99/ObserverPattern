package com.observerpattern;

import com.observerpattern.News.NewsType;

public class Main {

	public static void main(String[] args) {
		AajTak<News> subject = new AajTak<>();
		News data = new News("Some Data");
		
		NewsChannelFactory newsChannelFactory = new NewsChannelFactory();
		
		Observer observer1 = newsChannelFactory.getNewsChannel(NewsType.BUSINESS_NEWS);
		Observer observer2 = newsChannelFactory.getNewsChannel(NewsType.DELHI_NEWS);
		Observer observer3 = newsChannelFactory.getNewsChannel(NewsType.MUMBAI_NEWS);
		
//		MumbaiAajTak<News> mumbaiAajTak = new MumbaiAajTak<News>();
//		DelhiAajTak<News> delhiAajTak = new DelhiAajTak<News>();
//		BusinessAajTak<News> businessAajTak = new BusinessAajTak<News>();
		
		String news = "Its raining";
		data.setNews(news);
		data.setNewsType(News.NewsType.MUMBAI_NEWS);
		
		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);
		
		subject.update(data);
	}

}
