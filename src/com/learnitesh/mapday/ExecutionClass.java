
package com.veta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ExecutionClass
{

	public static void main(String[] args)
	{
		Employees e1 = new Employees("Ritesh", "Production");
		Employees e2 = new Employees("Amar", "IT");
		Employees e3 = new Employees("Asif", "Materials");
		Employees e4 = new Employees("Wazid", "Quality");
		Employees e5 = new Employees("Durga", "Production");
		Employees e6 = new Employees("Shakir", "Production");
		Employees e7 = new Employees("Rohit", "IT");
		Employees e8 = new Employees("Karan", "Materials");
		Employees e9 = new Employees("Suraj", "Quality");
		Employees e10 = new Employees("Bibek", "Quality");

		List<Employees> emp = new ArrayList<Employees>();

		emp.addAll(List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10));

		Map<String, String> map = new HashMap<>();

		for (int i = 0; i < emp.size(); i++)
		{
			map.put(emp.get(i).getDepartment(),
					map.getOrDefault(emp.get(i).getDepartment(), "") + " " + String.valueOf(emp.get(i).getName()));
		}

		for (String s : map.keySet())
		{
			System.out.println(s + " -> " + "[ " + map.get(s) + " ]");
		}

//		int arr[] = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5 };
//
//		Map<Integer, Integer> ans = new HashMap<>();
//
//		for (int i = 0; i < arr.length; i++)
//		{
//			ans.put(arr[i], ans.getOrDefault(arr[i], 0) + 1);
//		}
//
//		for (int a : ans.keySet())
//		{
//			System.out.println(a + " : " + ans.get(a));
//		}
	}

}
