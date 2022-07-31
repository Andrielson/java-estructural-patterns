package com.github.andrielson.bridge.converter.converters;

import java.util.Locale;

import com.github.andrielson.bridge.converter.employees.Employee;

public class CSVConverter implements Converter {

	@Override
	public String getEmployeeFormated(Employee emp) {
		return String.format(Locale.US, "%s,%d,%.2f", 
				emp.getName(),
				emp.getAge(),
				emp.getSalary());
	}

}
