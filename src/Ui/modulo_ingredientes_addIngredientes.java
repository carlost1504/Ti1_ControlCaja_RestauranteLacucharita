package Ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class modulo_ingredientes_addIngredientes extends Stage {
	
	
    private TextField tx_NameINgredient;

    private SplitMenuButton Split_type_Unit;

    private Button bt_addProduct;

    private Button tb_return;

    private Button bt_home;
    
    public modulo_ingredientes_addIngredientes() {
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("modulo_ingredientes_addIngredientes.fxml"));
	        Parent parent = loader.load();
			
	        tx_NameINgredient=(TextField)loader.getNamespace().get("tx_NameINgredient");
	        Split_type_Unit=(SplitMenuButton)loader.getNamespace().get("Split_type_Unit");
	        bt_addProduct=(Button)loader.getNamespace().get("bt_addProduct");
	        tb_return=(Button)loader.getNamespace().get("tb_return");
	        bt_home=(Button)loader.getNamespace().get("bt_home");
	        
	        
			Scene scene=new Scene(parent,750,600);
			setScene(scene);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
