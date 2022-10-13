package org.tnsindia.customexception;
   
class SimpleCustomExceptionDemo extends Exception
{
	public String str;
	public SimpleCustomExceptionDemo(String str) {
		super();
		this.str = str;
	}
	public String toString() {
		return "SimpleCustomExceptionDemo [str=" + str + "]";
	}
	
	
}
public class SimpleCustomException {

	public static void main(String[] args)  {
		try {
			throw new SimpleCustomExceptionDemo("User-Defined Exception Demo");
			
			
		}
		catch(SimpleCustomExceptionDemo e)
		{
			System.out.println(e);
			
		}

	}

}

