package org.jsp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontendController extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		Class [] config= {HotelConfig.class};
		
		return config;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String [] mapping= {"/"};
		return mapping;
	}

}
