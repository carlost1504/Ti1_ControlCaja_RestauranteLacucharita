package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import model.Employer;

public class DataEmployer {

	public ArrayList<Employer>employer;
	
	public DataEmployer() {
		employer=new ArrayList<>();
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
