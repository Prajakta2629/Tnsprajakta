package org.tnsindia.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface Custom
{
  String print();
  int speed();
  float salary();
}
class CustomAnnotationClass
{
	@Custom(print="Hello guys",speed=50,salary=756.12f)
	public void display()
	{
		System.out.println("Hurrrrrh its sunday and its fuuunnnnnnday");
	}
}

public class CustomAnnotationDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		CustomAnnotationClass c=new CustomAnnotationClass();
		c.display();
		Method m=c.getClass().getMethod("display");
		Custom obj=m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		System.out.println(obj.speed());
		System.out.println(obj.salary());
	}

}
