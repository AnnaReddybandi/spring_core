package com.jsp.applicationcontextVariableInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyDriver {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("company_employee.xml");
		Company company =(Company) applicationContext.getBean("company");
		   System.out.println(company.id);
		   System.out.println(company.cname);
		   System.out.println(company.turnover);
		             Employee employee=company.employee;
		             
		             System.out.println(employee.id);
		             System.out.println(employee.name);
		             System.out.println(employee.salary);
	}  
}


