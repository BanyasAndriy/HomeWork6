package HomeWork6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	

		Scanner scan = new Scanner(System.in);
		int length=0;
		int countOfThread=1;
		
		
		System.out.println("Введіть довжину масива : ");
		if(!scan.hasNextInt()) {
	    	System.out.println("Error!Input integer number!!");
	    }else {
		length=scan.nextInt();
	    }

		
		int[] vector =new int[length];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]=(int)(Math.random()*10);
		}

System.out.println("Cформований масив :");

for (int i : vector) {
	System.out.print(i+ " ");
}

System.out.println();
		
		System.out.println("Введіть кількість потоків : ");
	   
		if(!scan.hasNextInt()) {
	    	System.out.println("Error!Input integer number!!");
	    }else {
		countOfThread=scan.nextInt();
	    }
		

	
	
		long tstart1=0;
		long tend1 = 0 ;
		SumElementsArrayThread[] threadarray = new SumElementsArrayThread[countOfThread]; 
		
		for (int i = 0; i < threadarray.length; i++){
			int size = vector.length / countOfThread; 
			int begin = size * i; 
			int end = ((i + 1) * size);
			if ((vector.length - end) < size) { 
				end = vector.length; 
				} 
			 tstart1 = System.nanoTime();
			
					
			threadarray[i] = new SumElementsArrayThread(vector, begin, end); 

			 tend1 = System.nanoTime();
		}
		
		
		
		
		
		long tstart = System.nanoTime();
		System.out.println("Cума масиву з статичного метода Main : " + sum(vector)); 
		long tend=System.nanoTime();
		
		
		System.out.println((tend - tstart) + "  nanosec" + "- Static method sort");
		System.out.println((tend1 - tstart1) + "  nanosec" + "- Thread  sort");
		
		
		
	}
	
	
	static int sum(int[]vector) {
		int sum=0;
		for (int i = 0; i < vector.length; i++) {
			sum=sum+vector[i];
		}
		return sum;
	}
	
	
}
