//package com.lenovo.junit;
//
//import static org.junit.Assert.assertEquals;
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//import org.hamcrest.Matcher;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
////@RunWith(SpringJUnit4ClassRunner.class)
////@ContextConfiguration
////(locations={"spring-bean.xml","spring-mvc.xml","spring-db.xml"})
//public class CalcuateTest {
//	
//	Calcuate cal ;
//	
//	@Before
//	public void setUp(){
//		cal = new Calcuate();
//	}
//	
//	
//	@Test
//	 public void testAdd(){
//		int result = cal.add(12, 22);
////		 Assert.assertEquals("加法有问题", result,32);
//		//import static org.junit.Assert.*;
//		//当进行了静态导入之后，Assert 中的所有静态方法就不用再添加类名之后调用了
//		 assertEquals("加法有问题", result,34);
//	}
//	
//	@Test
//	public void testMinus(){
//		int result = cal.minus(20, 10);
//		assertEquals("减法有问题", result, 10);
//	}
//	@Test
//	public void testDivide(){
//		int result = cal.divide(20, 10);
//		assertEquals("除法有问题", result, 2);
//	}
//	@Test(expected=ArithmeticException.class)
//	public void testDivideException(){
//		int result = cal.divide(20, 0);
//		assertEquals("除法有问题", result, 2);
//	}
//	@Test(timeout=300)
//	public void testDivideTime(){
//		try {
//			Thread.sleep(1);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void testNul(){
//		int result = cal.nul(20, 10);
//		assertEquals("乘法有问题", result, 200);
//	}
//	
//	@Test
//	public void testhamcrest(){
////		assertThat(50, allOf(greaterThan(20),lessThan(60)));
////		assertThat("abc.txt",endsWith("txt"));
//		assertThat("abc.txt",endsWith("txt"));
////		assertThat("abc.txt",startsWith("a"));
//		
//	}
//	
//	
//
//
//	@After
//	public void tearDown(){
//		cal=null;
//	}
//	
//}
