package com.xworkz.other;

import com.xworkz.boot.Pen;

public class PenRunner {
	
	public static void main(String[] args) {

	String[] names= {"reynolds","nataraja","doms","cello"};
	String[] sizes= {"small","medium","long"};
	String[] colors= {"black","red","blue"};
	String[] types={"ball pen","smoooth writing pen","ball point pen","marker pen"};
	double[] price= {5.10,25,40.75};
	double[] weight= {1.7,1.8,1.45,0.75};
	
	Pen pen=new Pen(names,sizes,colors,types,price,weight,false,true,true,true,false);
	pen.torsu();

	}
}