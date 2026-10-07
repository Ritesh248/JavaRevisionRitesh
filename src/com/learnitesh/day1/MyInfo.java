package com.learnitesh.day1;

public class MyInfo
{
	    private final String name;
	    private final int age;

	    public MyInfo(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    @Override
	    public String toString() {
	        return "My name is " + name + " and age is " + age;
	    }

	    public static void main(String[] args) {
	    	
	        //  Ensuring correct number of arguments are passed
	        if (args.length < 2) {
	            System.err.println(" Usage: java MyDetails <name> <age> ");
	            return;
	        }

	        String inputName = args[0];
	        int inputAge;

	        // parsing & handling NumberFormatException
	        try {
	            inputAge = Integer.parseInt(args[1]);
	            
	        } catch (NumberFormatException e) {
	            System.err.println(" Error: Age must be a valid integer. Received input: " + args[1]);
	            return;
	        }

	        // Creating instance
	        MyInfo info = new MyInfo(inputName, inputAge);
	        System.out.println(info);
	    }
	}

