package com.chand.spring;

public class Greeting {
	
	private final long id;
	private static final String template="Hello, %s!";
	
	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	private final String content;
	
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = String.format(template,content);
	}
	

}
