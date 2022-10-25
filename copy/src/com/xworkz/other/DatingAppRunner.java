package com.xworkz.other;

import com.xworkz.boot.DatingApp;
import com.xworkz.constants.AppVersion;
import com.xworkz.constants.Description;
import com.xworkz.constants.SupportedIn;

public class DatingAppRunner {	

	public static void main(String[] args) {
		
		
		DatingApp dating=new DatingApp(AppVersion.THREE, SupportedIn.WINDOWS,Description.NAME_1);
		dating.display();
	}

}
