
package com.veta;

public class Employees
{
	private String name;
	private String department;

	public Employees()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(String name, String department)
	{
		super();
		this.name = name;
		this.department = department;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department)
	{
		this.department = department;
	}

}
