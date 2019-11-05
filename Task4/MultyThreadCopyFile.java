package HomeWork6.Task4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MultyThreadCopyFile implements Runnable {

	private File[] listOfFiles;
	private File oldCatalog;
	private File newCatalog;
	private int begin;
	private int end;
	private Thread thr;
	public MultyThreadCopyFile(File[]listOfFiles,File oldCatalog,File newCatalog, int begin , int end) {
	
		this.listOfFiles = listOfFiles;
		this.oldCatalog=oldCatalog;
		this.newCatalog=newCatalog;
		this.begin=begin;
		this.end=end;
		thr = new Thread(this);
		thr.start(); 
		
	}
	
	@Override
	public void run() {

		    Path newDirect = Paths.get(newCatalog.getAbsolutePath());
		    
		   
		    
		    for(int i = begin ; i <end;i++) {
		    	if(listOfFiles[i]!=null) {
		    		
		    		try {
						Files.copy(newCatalog.toPath(), newDirect.resolve(listOfFiles[i].getName()),StandardCopyOption.REPLACE_EXISTING);
						System.out.println("Файл " + listOfFiles[i].getName() + " переміщений у нову папку потоком " + Thread.currentThread().getName());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		    	}
		    }
		    }
		
	}

	
	
	
	
	

