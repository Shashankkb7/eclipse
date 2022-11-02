package com.xworkz.things;

public class WalletModify {

	public void useWallet(Wallet wallet) {
		System.out.println("accessing Wallet Name:" + wallet.getName());
		wallet.setName("Urban Forest");
		System.out.println("accessing modfying Wallet Name:" + wallet.getName());
		System.out.println("Wallet cardSlots:" + wallet.cardSlots);
		System.out.println("Wallet color:" + wallet.color);
		System.out.println("Wallet countryOrigin:" + wallet.countryOrigin);
		System.out.println("Wallet discount:" + wallet.discount);
		System.out.println("Wallet idealFor:" + wallet.idealFor);
		System.out.println("Wallet height:" + wallet.height);
		System.out.println("Wallet material:" + wallet.material);
		System.out.println("Wallet price:" + wallet.price);
		System.out.println("Wallet size:" + wallet.size);
		System.out.println("Wallet quality:" + wallet.quality);
	}
}
