package com.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class searchallTest {
	searchall sa=new searchall();
	@Test
	public void testSa() {
		assertEquals("success", sa.sa());
	}

}
