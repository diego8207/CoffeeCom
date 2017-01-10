package com.ut.seguridad.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;

public class SecurityInterceptor implements com.opensymphony.xwork2.interceptor.Interceptor{
	
	private static final long serialVersionUID = 1L;

	public void destroy(){
		System.out.println("******** destroy **********");
	}

    public void init(){
    	System.out.println("::::::::::::::::::::::::: Iniciando Sistema CoffeeCom.co :::::::::::::::::::::::::");
    }

    public String intercept(ActionInvocation invocation) throws Exception{    	
    	@SuppressWarnings("rawtypes")
		Map session = invocation.getInvocationContext().getSession();
        if (session.get("usuario") == null) {
        	//return Action.ERROR;
        	System.out.println("Error usuario no esta en la sesion");
        	return invocation.invoke();
        } else {
        	return invocation.invoke();
        }

    }
}
