package test;

import static org.junit.Assert.*;

import org.junit.Test;

import singleton.EnumSingleton;
import singleton.EnumSingleton.SomeThing;

public class JavaFirst {

	@Test
	public void testHelloWrold() {
		

		System.out.println("HelloWorld!");


System.out.println(" ");
System.out.println("World!");


	}
	
	/**
	 * 测试枚举单例模式
	 * @throws Exception
	 */
	@Test
	public void testEnumSingleton() throws Exception {
		EnumSingleton enumSingleton = SomeThing.INSTANCE.getInstance();
		
		System.err.println(enumSingleton);
	}
}
