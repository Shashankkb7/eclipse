package com.xworkz.boot;

public class Textile {

	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long   ownerDaughterNum;
	public int    ownersNoOfWifes;
	public int    shopNo;
	public long   contactNo;
	
	
	public Textile()
	{
		System.out.println("///////////////////////////////////");
	}
	
	public Textile(String ownerName,String ownerWifeName, String ownerDaughterName,long ownerDaughterNum,int   ownersNoOfWifes,int shopNo, long contactNo)
	{
		this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNum,ownersNoOfWifes,shopNo);
		this.contactNo = contactNo;
		
	}
	
	public Textile(String ownerName,String ownerWifeName, String ownerDaughterName,long ownerDaughterNum,int ownersNoOfWifes,int shopNo)
	{
		this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNum,ownersNoOfWifes);
		this.shopNo = shopNo;
		
	}
	
	
	public Textile(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNum,int ownersNoOfWifes)
	{
		this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNum);
		this.ownersNoOfWifes = ownersNoOfWifes;	
	}
	
	
	public Textile(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNum)
	{
		this(ownerName,ownerWifeName,ownerDaughterName);
		this.ownerDaughterNum = ownerDaughterNum;
		
	}
	
    public Textile(String ownerName,String ownerWifeName,String ownerDaughterName)
    {
    	this(ownerName,ownerWifeName);
    	this.ownerDaughterName = ownerDaughterName;
    }
	
    public Textile(String ownerName,String ownerWifeName)
    {
       this(ownerName);
       this.ownerWifeName = ownerWifeName;
    	
    }
    
	public Textile(String ownerName)
	{
		this();
		this.ownerName = ownerName;
		
	}
	
	
}
