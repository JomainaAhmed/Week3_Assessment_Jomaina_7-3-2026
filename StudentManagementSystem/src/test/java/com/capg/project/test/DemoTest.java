package com.capg.project.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.capg.project.entity.Student;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;



	public class DemoTest {
		
		@BeforeAll
	    static void beforeAll() {
	        System.out.println("Before All - Runs once before all tests");
	    }

	    @BeforeEach
	    void beforeEach() {
	        System.out.println("Before Each - Runs before every test");
	    }

	    @Test
	    public void demo1() {
	    		//checks equal or not
	        Assertions.assertEquals("xyz", "xyz");

	    }
	    
	    @Test
	    public void demo2() {
	    		//expected value is not null
	        Assertions.assertNotNull(99);

	    }
	    
	    @Test
	    public void demo3() {
	        Assertions.assertThrows(ArithmeticException.class, () -> {
	            int res = 10 / 0;
	        });
	    }
	    
	    @Test
	    public void demo4() {
	    	//Checks whether it is not getting Exception
	    	Assertions.assertDoesNotThrow(() -> {
	    		int res = 9/9;
	    	});
	    
	    }
	    
	    @Test
	    public void demo5() {
	        Student s1 = new Student();
	        Student s2 = new Student();
	            //compares the reference or object
	        Assertions.assertSame(s1, s2);
	        
	    }
	    
	   
	    @Test
	    void demo6() {
	        int age = 4;

	        if (age < 0) {
	            fail("Age cannot be negative");
	        }
	    }
	       
	    @Test
	    void demo7() {
	        int[] expected = {1, 2, 3};
	        int[] actual   = {1, 2, 3};

	        assertArrayEquals(expected, actual);
	    }
	    
	    @Test
	    public void demo8() {
	    	boolean res = false;
	    	Assertions.assertFalse(res);
	    }
	    
	    @Test
	    public void demo9() {
	    	boolean res = false;
	    	Assertions.assertFalse(res);
	    }
	    
	    @ParameterizedTest
	    @CsvSource({
	        "10, 2, 5",
	        "9, 3, 3",
	        "20, 4, 5"
	    })
	    void testDivide(int a, int b, int expected) {
	        assertEquals(expected, a / b);
	    }
	    
	    @AfterEach
	    void afterEach() {
	        System.out.println("After Each - Runs after every test");
	    }

	    @AfterAll
	    static void afterAll() {
	        System.out.println("After All - Runs once after all tests");
	    }
	    
	}
