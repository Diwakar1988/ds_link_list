package com.github.diwakar1988.ll;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SingleLinkListTest {
	

	private SingleLinkList singleLinkList;
	@Before
	public void setup() {
		singleLinkList = new SingleLinkList();
		singleLinkList.add(11);
		singleLinkList.add(1);
		singleLinkList.add(5);
		singleLinkList.add(10);
		singleLinkList.add(7);
	}
	@Test
	public void testGetAll() {

		ArrayList<Integer> OUTPUT = new ArrayList<>();
		OUTPUT.add(11);
		OUTPUT.add(1);
		OUTPUT.add(5);
		OUTPUT.add(10);
		OUTPUT.add(7);
		
		assertTrue(singleLinkList.getAll().equals(OUTPUT));
		
	}
	@Test
	public void testSize() {
		
		assertTrue(singleLinkList.size()==5);
		assertFalse(singleLinkList.size()==15);
		
	}
	@Test
	public void shouldSearch() {
		assertTrue(singleLinkList.search(10)!=null);
		assertTrue(singleLinkList.search(101)==null);
	}

}
