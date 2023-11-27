package com.yessir.backend.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yessir.backend.repository.LogMessageRepository;

@Service
public class LogService {
	
	private static final Logger logger = LogManager.getLogger();
	
	@Autowired
	private LogMessageRepository lRepository;
	
	public static void info(String message) {
		logger.info(message);
	}
	
	public static void debug(String message) {
		logger.debug(message);
	}
	
	public static void error(String message) {
		logger.error(message);
	}
}
