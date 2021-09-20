package com.observerpattern;

public class Main {

	public static void main(String[] args) {
		Subject subject = new Subject();
		Data data = new Data("Some Data");
		
		Observer1 observer1 = new Observer1();
		Observer2 observer2 = new Observer2();
		Observer3 observer3 = new Observer3();
		
		
		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);
		
		subject.update(data);
	}

}
