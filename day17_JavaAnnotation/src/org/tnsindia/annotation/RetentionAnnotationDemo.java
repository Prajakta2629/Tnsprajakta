package org.tnsindia.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeateAnnotation.class)
@interface CustomAnnotation
{
	String print()default "Welcome to M25 batch";
	int value() default 0;
	
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeateAnnotation
{
	CustomAnnotation[] value();
}

public class RetentionAnnotationDemo {
	
	@CustomAnnotation(print="Retention Annotation Test",value=1)
	@CustomAnnotation(print="Testing Annotation ",value=2)

	/*public static void main(String[] args) {
		
		RetentionAnnotationDemo r=new RetentionAnnotationDemo ();*/
		
		public static  void testMethod()
		{
		RetentionAnnotationDemo  d=new RetentionAnnotationDemo ();
		try
		{
			
			Class<?>c=d.getClass();
			Method m=c.getMethod("testMethod");
			Annotation a=m.getAnnotation(CustomAnnotation.class);
			System.out.println(a);
	    }

		catch(NoSuchMethodException e)
		{
			System.out.println(e);
		}
        }		
		
		public static void main(String[] args) {
			
			testMethod();
		
		}

}