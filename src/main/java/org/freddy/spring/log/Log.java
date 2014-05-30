package org.freddy.spring.log;

import org.springframework.stereotype.Component;

@Component
public class Log {
	
	public void logWorkerAssigned() {
		System.out.println("A worker has been assigned");
	}

}
