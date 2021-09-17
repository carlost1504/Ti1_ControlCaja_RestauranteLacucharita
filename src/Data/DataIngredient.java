package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import model.Employer;
import model.Ingredient;

public class DataIngredient {

	public ArrayList<Ingredient> ingredients;
	
	public DataIngredient() {
		ingredients=new ArrayList<>();
		try {

			String DataOder_txt="C:\\Users\\carlo\\eclipse-workspace\\seguimiento_3\\RestauranteLacucharita\\src\\Data\\DataIngredient.tvt";
			File file=new File(DataOder_txt);
			
			FileInputStream fis=new FileInputStream(file);
			BufferedReader reader=new BufferedReader(new InputStreamReader(fis));
			
			
			
			boolean exit=true;
			String line = reader.readLine();
			Ingredient p;
			boolean valido=true;
			int n1=1;
			
			while (!(line==null)){
				String [] array;
				
				line = reader.readLine();
				System.out.println(line);
				if(line==null) {
					System.out.println("efe");
				}
				if(line!=null) {
					array=line.split("-");
					System.out.println(array[2].toString());
					System.out.println(n1++);
					if(array[2].getBytes().equals("false")) {
						valido=false;
						p=new Ingredient(array[0],Integer.valueOf(array[1]));
						ingredients.add(p);
					}else if(array[2].equals("true")) {
						
						p=new Ingredient(array[0],Integer.valueOf(array[1]));
						ingredients.add(p);
					}
					
					System.out.println(Arrays.toString(array));
					array=null;
				}else if(line==null) {
					exit=false;
					break;
				}
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
