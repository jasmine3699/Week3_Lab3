package com.info.client;

import com.info.cmd.BookShelfDecider;
import com.info.cmd.BuyShelf;
import com.info.cmd.DontBuy;
import com.info.cmd.RemoteControl;
import com.info.facade.BookShelfType;
import com.info.facade.ShelveFacade;

public class OrderBookShelf {
	
	public static void main(String[] args) {
		
		//Facade pattern to get the details 
		ShelveFacade.showBookshelfDesc(BookShelfType.PLYWOOD);
		ShelveFacade.showBookshelfDesc(BookShelfType.TEAKWOOD);
		
		//Command pattern to Buy/Ignore the decision Maker 
		
		RemoteControl control = new RemoteControl();
		BookShelfDecider cakeOven = new BookShelfDecider();
		control.setCommand(new BuyShelf(cakeOven));
		control.pressButton();
		
		control.setCommand(new DontBuy(cakeOven));
		control.pressButton();
		
	}

}
