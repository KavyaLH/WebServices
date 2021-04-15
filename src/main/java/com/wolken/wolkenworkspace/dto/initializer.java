package com.wolken.wolkenworkspace.dto;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] { AppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
	
		return new String[] {"/"};
	}

}
