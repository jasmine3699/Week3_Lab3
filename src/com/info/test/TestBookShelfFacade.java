package com.info.test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.Test;

import com.info.facade.BookShelfType;
import com.info.facade.ShelveFacade;

public class TestBookShelfFacade {

	ShelveFacade shelfFacade = new ShelveFacade();
	BookShelfType type;

	@Test
	public void testOrderShelfWithValidType() {

		assertNotNull(shelfFacade.showBookshelfDesc(BookShelfType.TEAKWOOD));
	}

	@Test
	public void testOrderShelfWithInValidType() {
		try {
			assertNull(shelfFacade.showBookshelfDesc(null));
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
	}

}
