package day6_arrays;

public class ForEachexample {

	public static void main(String[] args) {
		
		int x[]= {22,33,44,55,24};
		//for each
		//read data from array and store it in r variable
		int y;
		//for(y:x)// compilation error 
		for(int r:x)
		{
			System.out.print("  "+r);
		}
		

	}

}
