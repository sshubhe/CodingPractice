import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PanCake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			//Scanner in = new Scanner(file);		
			int t = in.nextInt();  
			//System.out.println("output :" + t);
		    for (int test = 1; test <= t; test++) {
			String K = in.nextLine();
			System.out.println(K);
		    }
		    
		    
		    
		}
		catch(Exception e){
			System.out.println(e);
			}
		}
	}
