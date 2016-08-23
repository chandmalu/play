package com.chand.spring;

import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import groovy.transform.Undefined.CLASS;

public class Greeting {
	
	private Log log=LogFactory.getLog(CLASS.class);
	
	private final long id;
	
	private static final String output_template1="Hello, %s!";
	
	private static final String output_template2="Hello, Dear %s!";
	
	private static int template=0;
	
	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	private final String content;
	
	public Greeting(long id, String content, String template) {
		super();
		this.id = id;
		if(NumberUtils.isNumber(template))
		{
			log.info("template is a number");
			this.template=NumberUtils.toInt(template);
		}else
		{
			this.template=0;
			log.warn("template is not an number");
		}
		if(this.template == 0)
			this.content = String.format(output_template1,content);
		else
			this.content=String.format(output_template2,content);
	}
	

}
