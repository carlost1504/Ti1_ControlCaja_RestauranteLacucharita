package Ui;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Employer;

public class modulo_personal_CreateEmployer extends Stage {
	
	
	 
    private TextField tx_nameEmployer;

    private TextField tx_IdEmployer;

    private PasswordField tx_passwordEmployer;

    private Button Bt_return;

    private Button Bt_home;

    private Button bt_addEmployer;

    private ChoiceBox<?> List_typeEmployer;
    
    private DatePicker DateBox;
	    
	    public modulo_personal_CreateEmployer() {
	    	try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("modulo_personal_CreateEmployer.fxml"));
		        Parent parent = loader.load();
				
		        
		        
		        tx_nameEmployer=(TextField)loader.getNamespace().get("tx_nameEmployer");
		        tx_IdEmployer=(TextField)loader.getNamespace().get("tx_IdEmployer");
		        tx_passwordEmployer=(PasswordField)loader.getNamespace().get("tx_passwordEmployer");
		        Bt_return=(Button)loader.getNamespace().get("Bt_return");
		        Bt_home=(Button)loader.getNamespace().get("Bt_home");
		        bt_addEmployer=(Button)loader.getNamespace().get("bt_addEmployer");
		        bt_addEmployer=(Button)loader.getNamespace().get("bt_addEmployer");
		        DateBox=(DatePicker)loader.getNamespace().get("DateBox");
		        
		        
		        
		        List_typeEmployer = new ChoiceBox (FXCollections.observableArrayList ("", "Lb", "units", "L", "lm"));
		        
		        Employer=new Employer(getFullScreenExitHint(), getFullScreenExitHint(), getTitle(), getFullScreenExitHint());

				Scene scene=new Scene(parent,679,600);
				setScene(scene);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	    
	    }
	    
	    public void returnnFX() {
	    	Bt_home.setOnAction(Event->{
	    		modulo_personal_CreateEmployer p=new modulo_personal_CreateEmployer();
				modulo_Menu m=new modulo_Menu();
				m.show();
				p.close();
			});
	    }
	    public void homeFX() {
	    	Bt_return.setOnAction(Event->{
	    		modulo_personal_CreateEmployer p=new modulo_personal_CreateEmployer();
				Modulos m=new Modulos();
				m.show();
				p.close();
			});
	    }
	    public void addEmployerr() {
	    	bt_addEmployer.setOnAction(Event->{
	    		
			});
	    }
	    
	    private void SaveJavaByteCode() {
	    	try {
	        	File ref = new File("Inventary.temp");
				FileOutputStream fos = new FileOutputStream(ref);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(inventary);
				oos.close();	
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	
		}
    
}
