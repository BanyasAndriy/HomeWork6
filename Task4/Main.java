package HomeWork6.Task4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import HomeWork4.MyFileFilter;
import HomeWork6.SumElementsArrayThread;

public class Main {

	public static void main(String[] args) throws IOException {
	
		File oldCatalog = new File("C:\\Users\\User\\Desktop\\java course\\Java OOP\\Catalog");
        File newCatalog = new File("C:\\Users\\User\\Desktop\\java course\\Java OOP\\newCatalog");
   
        if( !(oldCatalog.exists())) {
		System.out.println("Такої папки не існує");
		}

        
		if( !(newCatalog.exists())) {
			System.out.println("Такої папки не існує");
			}

		 File[] listOfFiles = oldCatalog.listFiles();
			
			Scanner scan = new Scanner(System.in);
			int countOfThread=1;
			System.out.println("Введіть кількість потоків : ");
		   
			if(!scan.hasNextInt() && scan.nextInt()<=listOfFiles.length) {
		    	System.out.println("Error!You must input only integer number and this number shouldn't be greater then count of files ! ");
		    }else {
			countOfThread=scan.nextInt();
		    }
			

			
			MultyThreadCopyFile[] threadArray = new MultyThreadCopyFile[countOfThread]; 
			
			for (int i = 0; i < threadArray.length; i++){
				int size = listOfFiles.length / countOfThread; 
				int begin = size * i; 
				int end = ((i + 1) * size);
				if ((listOfFiles.length - end) < size) { 
					end = listOfFiles.length; 
					} 
				
				
				threadArray[i] = new MultyThreadCopyFile(listOfFiles,oldCatalog,newCatalog, begin, end); 

				
			}
		


	}

}
