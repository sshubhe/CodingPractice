
public class fibonacci {
	private static int count =0;
	
	public static void main(String args[]){
		
		int i=0;
	
		try{
			i = fib(123);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println(i);
		System.out.println(count);
		
		
	}
	
	public static int fib(int n ){
		count++;
		if(n <= 1 ){
			return n;
		}
		return fib(n-1) + fib(n-2);
	}

}
