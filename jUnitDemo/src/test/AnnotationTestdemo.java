package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTestdemo {
     private ArrayList<String> list;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Usinh @beforeclass,Executed before all test caese");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Usinh @Afterclass,Executed before all test caese");
	}

	@Before
	public void setUp() throws Exception {
		list=new ArrayList<String>();
		System.out.println("Using @before annotation,executed before each test case");
	}

	@After
	public void tearDown() throws Exception {
		
		list.clear();
		System.out.println("Using @ater annotation,executed before each test case");
		
	}

	@Test
	public void test() {
		list.add("junit");
		//fail("Not yet implemented");
		assertFalse(list.isEmpty());
		assertEquals(1,list.size());
		System.out.println("In test method");
		
	}
	@Test
	public void test2() {
		list.add("junit");
		//fail("Not yet implemented");
		assertFalse(list.isEmpty());
		assertEquals(1,list.size());
		System.out.println("In test method 2");
		
	}
	@Ignore
	public void m6() {
		System.out.println("Using @ignour,this execution is ignoure");
		
	}
	 @Test(timeout = 10)           
     public void m7() {                   
         System.out.println("Using @Test(timeout),it can be used to enforce timeout in JUnit4 test case");                   
     }   
	 @Test(expected = NoSuchMethodException.class)                public void m8() {                   
         System.out.println("Using @Test(expected) ,it will check for specified exception during its execution");
     }

}
