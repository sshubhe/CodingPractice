package HeapProblems;

import java.util.ArrayList;

public class MaxHeap {
	
	public static void main(String[] args) {
		//In max heap the higher elements in hierarchy have higher values
		
		int[] input = new int[10];
		int MaxValue;
		int[] test = {1,22,23,4,15,6,227};
		ArrayList<String> TestStringArray = new ArrayList<String>();
		boolean[]  check = new boolean[10];
		
		for(int j = 0; j < check.length;j++){
			check[j] = true;
			if(j%2 !=0){ 
				check[j] = false;
			}
			
			System.out.println("Details : " + j);
			
			System.out.println("Display check : " + check[j]);
			
		}
		
		for(int i = 0;i<input.length;i++){
			input[i] = i++;
			System.out.println("input :" + input[i]);
		}

		//creating heap :
		node root = new node(2);
	
		for(int i = 0; i < input.length ; i++){
			for(int j = 1; j < input.length-1; j++){
				
			
			//root is max
			//2*i are left nodes
			//2i+1 are right nodes
			//later half of the array are leaf nodes
			if(input[i] >= input[j]){
				int temp = input[j];
				input[j] = input[i];
				input[i] = temp;
				
			}
			}
		}
	
	for(int i = 0;i < test.length ; i++){
		
		System.out.println("Checking solution : " + input[i]);
		
		//root.left = new node(6);
		System.out.println("Check solution : " + root.data);
		
	}
	

	
	
	
	}
	
	
	
public void display(node root){
		
		if(root.left != null){
			System.out.println("display node : " + root.left.data);
		}
		if(root.right != null){
			System.out.println("Display node right : " + root.right.data);
		}
	}
	
	

}

class node{
	int data;
	node left;
	node right;
	
	public node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public node(node left, node right, int data){
		this.right = right;
		this.left = left;
		this.data = data;
	}
}
