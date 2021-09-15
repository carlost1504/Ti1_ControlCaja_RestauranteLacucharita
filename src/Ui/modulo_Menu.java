package Ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class modulo_Menu extends Stage {

    private TableView<?> tabla_Menus;

    private Button Bt_AddCombo;

    private Button Bt_deleateCombo;
    
    public modulo_Menu() {
    	
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("modulo_Pedidos.fxml"));
	        Parent parent = loader.load();
			
	        tabla_Menus=(TableView<?>)loader.getNamespace().get("tabla_Menus");
	        Bt_AddCombo=(Button)loader.getNamespace().get("Bt_AddCombo");
	        Bt_deleateCombo=(Button)loader.getNamespace().get("Bt_deleateCombo");

			Scene scene=new Scene(parent,679,600);
			setScene(scene);
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void init() {
    	
    }
}
