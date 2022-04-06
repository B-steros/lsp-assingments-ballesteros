package org.howard.edu.lsp.assignment6.junit; 


import org.howard.edu.lsp.assignment6.IntegerSet.IntegerSet; 

import org.howard.edu.lsp.assignment6.IntegerSet.IntegerSetException; 


import static org.junit.Assert.*; 

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import org.junit.jupiter.api.DisplayName;


/**

 * Class of JUnit test cases to test IntegerSet class and implementation file.

 */

public class IntegerSetTest {

	IntegerSet set1 = new IntegerSet(); 

	IntegerSet set2 = new IntegerSet();

	IntegerSet set3 = new IntegerSet();


	/**

	 * Main method, used to print the purpose of the IntegerSet class.


	 */

	public static void main(String[] args) {

		System.out.println("IntegerSet Class Test File using JUnit testing\n");

	}

	/**

	 * Constructor for the IntegerSetTest class.

	 * Initializes all values placed in IntegerSets Set1, Set2, and Set3.

	 * @throws Exception is not used.

	 */

	@Before

	public void setUp() throws Exception {

		set1.add(1);

		set1.add(2);

		set1.add(3);

		set1.add(4);

		set1.add(5);

		set2.add(1);

		set2.add(2);

		set2.add(3);

		set2.add(4);

		set2.add(5);

		set3.add(-4);

		set3.add(-2);

		set3.add(0);

		set3.add(2);

		set3.add(4);

		set3.add(6);

		set3.add(8);

	}

	
	/**

	 * De-constructor for the IntegerSetTest class. 

	 * Used after all JUnit tests finish execution.

	 * @throws Exception is not used.

	 */

	@After

	public void tearDown() throws Exception {

		System.out.println("Tests executed successfully!");

	}


	/**

	 * Clear() is a void method so ArrayList is cleared

	 * length() method is called to see that clear() method works

	 * by comparing cleared ArrayList to zero

	 */

	@Test

	@DisplayName("\nTest cases for Clear method: ")

	public void testClear() {

		System.out.println("\nTest cases for Clear method: ");

		set1.clear();

		assertEquals(set1.length(), 0);

		System.out.println("The length of a cleared ArrayList is zero. So the clear() method works");

		set2.clear();

		assertEquals(set2.length(), 0);

		System.out.println("The length of a cleared ArrayList is zero. So the clear() method works");

	}

	
	/**

	 * Uses assertEquals to test the length() method, 

	 * that determines the number of integers in a given ArrayList.

	 */

	@Test 

	@DisplayName("\nTest cases for Length method: ")

	public void testLength() {

		System.out.println("\nTest cases for Length method: ");

		assertEquals(set1.length(), 5);

		set2.clear();

		assertEquals(set2.length(), 0);

		System.out.println("Since Set2 has been cleared, it has no length.");

		set1.remove(1);

		assertEquals(set1.length(), 4);

		System.out.println("Since an element was removed from Set1, its length was reduced from 5 to 4");

		set3.add(3);

		assertEquals(set3.length(), 8);

		System.out.println("Since an element was added to Set3, its length was increased from 7 to 8.");

	}


	/**

	 * Uses assertTrue and assertFalse to determine whether two

     * ArrayLists contain the exact same elements in any order.

	 */

	@Test

	@DisplayName("\nTest cases for Equals method: ")

	public void testEquals () {

		System.out.println("\nTest cases for Equals method: ");

		assertTrue(set1.equals(set2));

		assertFalse(set1.equals(set3));

		System.out.println("Set1 and Set3 do not contain the same integers or have the same length. So two sets are unequal.");

		set1.add(6);

		set2.add(6);

		assertTrue(set1.equals(set2));

		set1.add(0);

		set2.add(-1);

		assertFalse(set1.equals(set2));

		System.out.println("Set1 contains the integer 0 and Set2 contains the integer -1. So two sets are unequal.");

		set1.clear();

		System.out.println("Set1 has been cleared but Set2 still contains values. So two sets are unequal.");

		assertFalse(set2.equals(set3));

		System.out.println("Set2 and Set3 do not contain the same integers or have the same length. So two sets are unequal.");

		set3.clear();

		assertTrue(set1.equals(set3));
