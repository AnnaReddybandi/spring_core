package com.jsp.applicationcontextVariableInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Value("1")
	int id;
	@Value("TCS")
	String cname;
	@Value("655078")
	double turnover;
	@Autowired
	Employee employee;
	

	  
}
