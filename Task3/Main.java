package HomeWork6.Task3;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		int length=0;
		System.out.println("Input length of massive");
		length=scan.nextInt();
		int[] array = new int[length];
		
		
		Random rn = new Random();
		
		
		
		for (int i = 0; i < array.length; i++) { 
			array[i] = rn.nextInt(10);
			}
		
		System.out.println("Massive before sorting :");
		
		for (int i : array) {
			System.out.print(i+" ");
		}

		MultiThreadSorting.sort(array,3);
		
		System.out.println("\nMassive after sorting");
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
	
	
	
	
}

