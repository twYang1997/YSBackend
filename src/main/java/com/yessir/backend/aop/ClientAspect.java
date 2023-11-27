package com.yessir.backend.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ClientAspect extends AspectAbstract{

	
	@Pointcut("execution(public * com.yessir.backend.controller.ClientController.*(..))")
	public void pointcut() {
	}
	

	@Override
	public void beforeArgsChecking(Object[] data) {
	}

	@Override
	public void afterChecking() {
	}
}
