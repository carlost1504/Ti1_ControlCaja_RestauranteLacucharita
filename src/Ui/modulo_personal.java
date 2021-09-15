package Ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class modulo_personal extends Stage {
	
    private TableView<?> tabla_employer;

    private Button bt_CreateEmployer;

    private Button tb_deleateEmployer;

    private Button Bt_chagePassword;
    
    public modulo_personal() {
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("modulo_personal.fxml"));
	        Parent parent = loader.load();
			
	        tabla_employer=(TableView<?>)loader.getNamespace().get("tabla_employer");
	        bt_CreateEmployer=(Button)loader.getNamespace().get("bt_CreateEmployer");
	        tb_deleateEmployer=(Button)loader.getNamespace().get("tb_deleateEmployer");
	        Bt_chagePassword=(Button)loader.getNamespace().get("Bt_chagePassword");
	        
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
