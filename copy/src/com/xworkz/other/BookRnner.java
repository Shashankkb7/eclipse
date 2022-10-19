package com.xworkz.other;

import com.xworkz.boot.Book;

public class BookRnner {

	public static void main(String[] args) {
	
		String[] names= {"classmate","vidya","bhaskar","arun"};
		String[] sizes= {"long size","king size","A4 size","Small size"};
		String[] colors= {"black","red","blue","white"};
		int[] pages={100,200,500,700};
		double[] price= {20.50,35.25,100.25,200.75};
		double[] weight= {1.7,1.8,1.45,0.75};
		
		Book book=new Book(names,sizes,colors,pages,price,weight,false,true,true,true,false);
		book.show();
	}

}
