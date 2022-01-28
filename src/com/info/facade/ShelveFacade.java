package com.info.facade;

import com.info.service.BookShelf;
import com.info.service.PlyWoodShelf;
import com.info.service.TeakWoodShelf;

public class ShelveFacade {
	
	public static void showBookshelfDesc(BookShelfType type) {
		
		switch (type) {
		case TEAKWOOD:
		    BookShelf teakwood = new TeakWoodShelf();
		    teakwood.getBookshelfModel();
		    System.out.println("Cost of teakwood shelfves -"+teakwood.getCost());
		    break;
		    
		case PLYWOOD:
			    BookShelf plyWood = new PlyWoodShelf();
			    plyWood.getBookshelfModel();
			    System.out.println("Cost of teakwood shelfves"+plyWood.getCost());
			    break;
		}
		
	}

}
