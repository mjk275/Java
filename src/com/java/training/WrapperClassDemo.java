package com.java.training;

public class WrapperClassDemo {
	
	public static void main(String[] args) {


//		Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

//		Primitive Data Type	    Wrapper Class
//		byte	                   Byte
//		short	                   Short
//		int	                       Integer
//		long	                   Long
//		float	                   Float
//		double	                   Double
//		boolean	                   Boolean
//		char	                   Character
		
		
		Integer id = 100;
		Float salary = 7.99999F;
		Character gender = 'M';
		
		System.out.println(id);
		System.out.println(salary);
		System.out.println(gender);
		
		
		System.out.println(id.intValue());
		System.out.println(salary.floatValue());
		System.out.println(gender.charValue());
		
		//Compare and CompareTo
		float f1 = 3.14f;
		float f2 = 3.14f;
		System.out.println(Float.compare(f1, f2));//0
		
		Float f3 = 3.14f;
		Float f4 = 3.14f;
		System.out.println(f3.compareTo(f4));//0
		
		//is Infinite
		float f5 = (float) (1/0.);
		System.out.println(Float.isInfinite(f5));//true
		
	    //Not a Number
		float f6 = (float)Math.sqrt(-4);
		System.out.println(Float.isNaN(f6));//true
		
		//Convert String into Float
		String s = "3.14";
		float f7 = Float.parseFloat(s);
		System.out.println(f7);//3.14
		
		//valueof Method
		Float f8 = Float.valueOf(s);
		System.out.println(f8);//3.14
		
		float f9 = f8.floatValue();
		System.out.println(f9);
		
		int i = f8.intValue();
		System.out.println(i);
		
		System.out.println("-------------------------");
		//Constants
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.NaN);
		System.out.println(Float.POSITIVE_INFINITY);
		System.out.println(Float.NEGATIVE_INFINITY);
		System.out.println(Float.TYPE);
		
		int i1 = Integer.parseInt("42");
		System.out.println(i1);//42
		
		int j = Integer.parseInt("42", 5);
//		2* Math.pow(5, 0) = 2   and 4 * Math.pow(5, 1) = 20
		System.out.println(j);//22
		
		System.out.println(Integer.toBinaryString(8));
		System.out.println(Integer.toOctalString(9));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.TYPE);
		
		
	}

}
