package com.observerpattern;

import com.observerpattern.News.NewsType;

public interface Observer<T> {
	public void onUpdate(T data);
	
	public NewsType getRequiredNewsType();
}
