package com.xworkz.boot;

import com.xworkz.constants.AppVersion;
import com.xworkz.constants.Description;
import com.xworkz.constants.SupportedIn;

public class DatingApp {

	public static String company="Tinder";
	public AppVersion appVersion;
	public SupportedIn supportedIn;
	public Description description=Description.NAME_1;
	
	
	
	public DatingApp(AppVersion appVersion, SupportedIn supportedIn, Description description) {
		super();
		this.appVersion = appVersion;
		this.supportedIn = supportedIn;
		this.description = description;
	}
	
	public void display()
	{
		System.out.println(DatingApp.company);
		System.out.println(this.appVersion.value);
		System.out.println(this.appVersion.ONE.ordinal());
		System.out.println(this.supportedIn);
		System.out.println(this.description.sizes);
		System.out.println(this.description.developers);
	}
	
	
	
	
}
