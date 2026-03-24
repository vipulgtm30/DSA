package exceptionHandling;

public class ExceptionDemo {
	
	public static int Divide(int a, int b) throws DivideByZeroException{
		if(b == 0) {
//			throw new DivideByZeroException();
		}
		return a / b;
	}
	
	public static void main(String[] args) {
		try {
			Divide(4, 0);
			System.out.println("Within try block");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Within catch block");
		}
		
		finally {
			System.out.println("Finally will always work");
		}
		System.out.println("Main method");
		
	}

}
