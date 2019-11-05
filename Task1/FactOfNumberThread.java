package HomeWork6;

import java.math.BigDecimal;
import java.math.BigInteger;

public class FactOfNumberThread extends Thread{
	
	private int numOfThread;
	private String nameOfThread;
	
	public FactOfNumberThread( String nameOfThread  ,int numOfThread){
		this.nameOfThread=nameOfThread;
		this.numOfThread=numOfThread;
	}
	
	
	public String getNameOfThread() {
		return nameOfThread;
	}
	
	
	
	@Override
	public void run() {
		int i;
		Long fac=new Long(1);
		
		BigInteger  fact = BigInteger.valueOf(1);
		
		
		i=1;
	for ( i = 1; i <= this.numOfThread; i++) {
		 fact = fact.multiply(BigInteger.valueOf(i));
	
	}	

	
	
		System.out.println("Факторіал номера потоку "+ getNameOfThread() + " = " + fact);
		
	}

}
