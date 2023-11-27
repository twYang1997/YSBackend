package com.yessir.backend.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.yessir.backend.service.LogService;

@Component
public abstract class AspectAbstract {
	
	public abstract void pointcut();
	
	/**
	 *   need to add @before(value = "") annotation
	 */
	@Before(value = "pointcut()")
    public void beforeMethodLog(JoinPoint joinPoint) {
        
        Object[] args = joinPoint.getArgs();
        
        StringBuilder message = new StringBuilder();
        
        for (Object arg: args) {
        	message.append(arg);
        }
        
        LogService.info("Simple_Class_Method: " + joinPoint.getSignature().getDeclaringType().getSimpleName() + "." + joinPoint.getSignature().getName());
        LogService.info("Args: " + message);
        
        beforeArgsChecking(args);
    }
    
    /**
     *  to check arguments
     */
    public abstract void beforeArgsChecking(Object[] data);
    
    
    public void afterMethodLog(JoinPoint joinPoint) {
    	
    };
    
    public abstract void afterChecking();
    
}
