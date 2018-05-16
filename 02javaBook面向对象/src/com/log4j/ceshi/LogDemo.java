package com.log4j.ceshi;

import org.apache.log4j.Logger;
public class LogDemo {

	public static void main(String[] args) {
		Logger log = Logger.getLogger(LogDemo.class);
		log.fatal("fatal   msg");
		log.error("error   msg");
		log.warn("warn   msg");
		log.info("info   msg");
		log.debug("debug   msg");
		log.trace("trace   msg");
		
	}

}
