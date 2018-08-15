import java.util.ArrayList;

public class ReverseWordinString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "A B C";
		String Delimit = " ";
		int s =90;
		char [] ch = input.toCharArray();
		String [] TestResult = input.split(Delimit);
		ArrayList<String> Check = new ArrayList<String>();
		System.out.println(reverseprint(TestResult));
		
		char ch1 = (char) s;
		System.out.println(ch1);
		
		for(int i = 0; i < ch.length;i++){
		
			System.out.println(0 + ch[i]);
		}
		System.out.println(ch.length);
		//System.out.println(input.length());
	}
	
	public static String reverseprint(String []Result ){
		
		String ResultReverse = Result[Result.length-1];
		for(int i = Result.length-2; i >=0;i--){
			
			ResultReverse = ResultReverse + " " + (Result[i]);
		
			
		}
		
		return ResultReverse;
		
	}
	
	public static int [] CopyArray(int [] a)
	{
		
		return a;
	}
}
