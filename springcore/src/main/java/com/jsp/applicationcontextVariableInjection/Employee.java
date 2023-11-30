package com.jsp.applicationcontextVariableInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("1")
	int id;
	@Value("haritha")
	String name;
	@Value("50000")
	double salary;
}
