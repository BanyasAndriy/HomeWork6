package HomeWork6;

public class SumElementsArrayThread extends Thread {
	
	
	
	private int[] vector;
	private int start;
	private int end;
	private Thread thr;
	private   int sum;
	private static  int  rez=0; 

	SumElementsArrayThread(int[]vector , int start , int end) {
		super();
		this.vector=vector;
	int rez[]=new int[vector.length];
		this.start=start;
		this.end=end;
		thr = new Thread(this);
		thr.start(); 
		
	}

	public void run() {
 int tmp;

	for(int i =start; i<end; i++) {
		sum=sum+vector[i];
		
	}
	rez=rez+sum;
	tmp=rez;
	if(tmp==Main.sum(vector))
		System.out.println("Загальна сума масиву вирахувана потоками  " + tmp);
		
	}
	
	


	

}
