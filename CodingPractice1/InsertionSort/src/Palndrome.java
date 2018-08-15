
public class Palndrome {

	
	public static void main(String[] args) {
		// Palendrome
		int count =0;
		String Check1 = "madam";
		for(int i = 0,j = Check1.length()-1; i <= Check1.length()/2 && j >=Check1.length()/2;i++,j--){
				count++;
				if( Check1.charAt(i) == Check1.charAt(j))
				{
				  System.out.println( Check1.charAt(i) + " " + Check1.charAt(j));
				}
			}
		System.out.println(count);
		}
	}
