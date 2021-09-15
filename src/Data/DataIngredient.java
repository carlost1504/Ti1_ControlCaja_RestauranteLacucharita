package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import model.Ingredient;

public class DataIngredient {

	public ArrayList<Ingredient> ingredients;
	
	public DataIngredient() {
		ingredients=new ArrayList<>();
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
