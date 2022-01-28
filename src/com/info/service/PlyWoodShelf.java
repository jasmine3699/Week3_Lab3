package com.info.service;

public class PlyWoodShelf implements BookShelf {
	
	@Override
	public void getBookshelfModel() {
		// TODO Auto-generated method stub
		System.out.println("Plywood bookshelf with 2years of warranty");
	}

	@Override
	public Integer getCost() {
		// TODO Auto-generated method stub
		return 10000;
	}

}
