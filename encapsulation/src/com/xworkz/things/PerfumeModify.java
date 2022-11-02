package com.xworkz.things;

public class PerfumeModify {

	public void usePerfume(Perfume perfume) {
		System.out.println("accessing perfume brand:" + perfume.getBrand());
		perfume.setBrand("K S");
		System.out.println("accessing modifying perfume brand:" + perfume.getBrand());
		System.out.println("perfume name:" + perfume.color);
		System.out.println("perfume expd:" + perfume.expd);
		System.out.println("perfume mfd:" + perfume.mfd);
		System.out.println("perfume fragrance:" + perfume.fragrance);
		System.out.println("perfume idealFor:" + perfume.idealFor);
		System.out.println("perfume manufactureCountry:" + perfume.manufactureCountry);
		System.out.println("perfume price:" + perfume.price);
		System.out.println("perfume rating:" + perfume.rating);
		System.out.println("perfume quality:" + perfume.quality);
		System.out.println("perfume quantity:" + perfume.quantity);
	}
}
