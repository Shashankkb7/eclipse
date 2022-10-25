package com.xworkz.constants;

public enum SupportedIn {

	ANDROID("android"),IOS("ios"),WINDOWS("windows");
	
	public String name;
	
	private SupportedIn(String name)
	{
		this.name=name;
	}
}
