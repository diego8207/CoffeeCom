package com.ut.cafe.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.ut.cafe.facade.IGestionFacade;

public class CafeAction extends ActionSupport implements ServletRequestAware, ServletResponseAware{

	
	private static final long serialVersionUID = 1L;
	private IGestionFacade gestionFacade;    
    private String id;
	private HttpServletRequest request;
	private HttpServletResponse response;
	private boolean login;


	
	public CafeAction(IGestionFacade gestionFacade) {
        this.gestionFacade = gestionFacade;
    }

	@SkipValidation
    public String execute() {
    	try {
    		
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return Action.SUCCESS;
    }
    
    @SkipValidation
    public String edit() {
    	try {
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return Action.SUCCESS;
    }
    
    @SkipValidation
    public String view() {
    	return Action.SUCCESS;
    }
    
    public String persist() {
    	try {
    		
		} catch (Exception e) {
			e.printStackTrace();
			return Action.INPUT;
		}
    	return execute();
    }
    	    
    @SkipValidation
    public String remove(){
    	try {
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return execute();
    }
    
    @SkipValidation
    public String add(){
    	try {
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return Action.SUCCESS;
    }
     
    public IGestionFacade getGestionFacade() {
		return gestionFacade;
	}

	public void setGestionFacade(IGestionFacade gestionFacade) {
		this.gestionFacade = gestionFacade;
	}


	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		
	}	
}

