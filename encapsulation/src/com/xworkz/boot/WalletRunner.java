package com.xworkz.boot;

import com.xworkz.things.Wallet;
import com.xworkz.things.WalletModify;

public class WalletRunner {

	public static void main(String[] args) {

		Wallet wallet = new Wallet();
		System.out.println(wallet.getName());
		WalletModify modify = new WalletModify();
		modify.useWallet(wallet);

	}

}
