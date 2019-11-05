package HomeWork6.Task5;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File catalog = new File("C:\\Users\\User\\Desktop\\java course\\Java OOP\\Catalog");
      
        if( !(catalog.exists())) {
		System.out.println("Такої папки не існує");
		}

        UpgradeCatalog up = new UpgradeCatalog(catalog);
        try {
			up.check();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
