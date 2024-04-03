package com.krakedev.ejemploMaven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {

	private static Logger logger= LogManager.getLogger(Admin.class);
	
	
	public void agregar() {
		logger.info("mensage de info");
		logger.warn("mensage de warn");
		logger.trace("mensage de trace");
		logger.error("mensage de error");
		logger.debug("mensage de debug");
	}

}
