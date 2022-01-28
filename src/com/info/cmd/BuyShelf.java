package com.info.cmd;

public class BuyShelf implements Command {
	BookShelfDecider buyDecider;

	public BuyShelf(BookShelfDecider buyDecider) {
		super();
		this.buyDecider = buyDecider;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		buyDecider.buy();
	}
}
