package com.info.service;

public class TeakWoodShelf implements BookShelf {

	@Override
	public void getBookshelfModel() {
		// TODO Auto-generated method stub
		System.out.println("TeakWood bookshelf with 10years of warranty");
	}

	@Override
	public Integer getCost() {
		// TODO Auto-generated method stub
		return 20000;
	}

}
