import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class JamCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			//Scanner in = new Scanner(file);		
			int t = in.nextInt();  
			//System.out.println("output :" + t);
		    for (int test = 1; test <= t; test++) {
			int n = in.nextInt();
			int m = in.nextInt();
			System.out.println("n" + n + "m" + m);
			int [] Checker = new int[n];
			Checker[0] = 1;
			Checker[n-1] = 1;
			
			boolean Task = true;
			 //System.out.println("input : " + K);
			 ArrayList<Integer> checklist = new ArrayList<Integer>();
			 
			 for(int i=2;i<=10;i++){
				checklist.add(i);
				}
			System.out.println(checklist);
		  }
		}
		catch(Exception e){
				System.out.println(e);
			}	
		}

}
