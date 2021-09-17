package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import model.Dish;
import model.Ingredient;
import model.Oder;

public class DataOrder {

	ArrayList<Oder>oder;
	
	public DataOrder() {
		oder=new ArrayList<>();
		try {
			
			String DataOder_txt="C:\\Users\\carlo\\eclipse-workspace\\seguimiento_3\\RestauranteLacucharita\\src\\Data\\DataOrder.txt";
			File file=new File(DataOder_txt);
			
			FileInputStream fis=new FileInputStream(file);
			BufferedReader reader=new BufferedReader(new InputStreamReader(fis));
			
			
			
			boolean exit=true;
			String line = reader.readLine();
			Oder p;
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
						Dish[] dish ;
						
						for (int i=0;i<dish.length;i++) {
							String[] tre=array[1].split("-");
							Dish t=new Dish(line, i, null);
							dish[i]=tre[i];
						}
						
						valido=false;
						p=new Oder(Integer.valueOf(array[0])],array[1],array[2],array[3]);
						oder.add(p);
					}else if(array[2].equals("true")) {
						
						p=new Oder(Integer.valueOf(array[0])],array[1],array[2],array[3]);
						oder.add(p);
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
