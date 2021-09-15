package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import model.Dish;

public class DishData {

	public ArrayList<Dish>dish;
	
	public DishData() {
		try {
			String DataOder_txt="";
			File file=new File(DataOder_txt);
			
			FileInputStream fis=new FileInputStream(file);
			BufferedReader reader=new BufferedReader(new InputStreamReader(fis));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
