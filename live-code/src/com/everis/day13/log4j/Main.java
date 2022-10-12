package com.everis.day13.log4j;

import org.apache.log4j.Logger;

public class Main {

	private static Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) {

		log.fatal("fatal log");
		log.error("error log");
		log.warn("warn log");
		log.info("info log");
		log.debug("debug log");
		log.trace("trace log");

	}

}
