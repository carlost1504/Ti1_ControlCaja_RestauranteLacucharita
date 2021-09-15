package Ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.passwords;

public class validation_User extends Stage {

	
	
    private Button bt_EnterValidity;

    private TextField tx_user;

    private PasswordField tx_password;
    
    public validation_User() {
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("validation_User.fxml"));
	        Parent parent = loader.load();
			
	        bt_EnterValidity=(Button)loader.getNamespace().get("bt_EnterValidity");
	        tx_user=(TextField)loader.getNamespace().get("tx_user");
	        tx_password=(PasswordField)loader.getNamespace().get("tx_password");
	        
			Scene scene=new Scene(parent,679,600);
			setScene(scene);
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public void init() {
		
		
    	bt_EnterValidity.setOnAction(Event->{
			boolean validaPassword=validation(tx_password.getText());
			boolean validaUser=validation(tx_user.getText());
			if (validaUser==true&&validaPassword==true ) {
				Modulos ct=new Modulos();
				ct.show();
			}else System.out.println("error");
		});
	}
	public boolean validation(String validar) {
		
		passwords ps=new passwords();
		
		boolean valido=false;
		if(validar.equalsIgnoreCase(ps.getPassword())|validar.equalsIgnoreCase(ps.getUser())) {
			valido=true;
		}else System.out.println("error no existe");
		
		return valido;
	}
    
}
