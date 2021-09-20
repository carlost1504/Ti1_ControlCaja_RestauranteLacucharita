package Ui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class modulo_Menu_CreateCombo extends Stage {
	
	
    private Button Bt_createCombo;

    private TextField Tx_NameCombo;

    private SplitMenuButton Split_nameProduct;

    private TableView<?> tabla_ingredientCombo;

    private Button Bt_return;

    private Button Bt_home;

    private Button Bt_addIngrecienteTomenu;

    private TextField Tx_PriceComboToMenu;
	    
	    public modulo_Menu_CreateCombo() {
	    	try {
				FXMLLoader loader=new FXMLLoader(getClass().getResource("modulo_M.fxml"));
				Parent root=loader.load();
				
				Bt_createCombo=(Button)loader.getNamespace().get("Bt_createCombo");
				Tx_NameCombo=(TextField)loader.getNamespace().get("Tx_NameCombo");
				Bt_return=(Button)loader.getNamespace().get("Bt_return");
				Bt_home=(Button)loader.getNamespace().get("Bt_home");
				Bt_addIngrecienteTomenu=(Button)loader.getNamespace().get("Bt_addIngrecienteTomenu");
				Tx_PriceComboToMenu=(TextField)loader.getNamespace().get("Tx_PriceComboToMenu");
				
				
				
				Scene scene=new Scene(root,600,500);
				setScene(scene);
				action();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    public void action() {
	    	
	    	
	    }
	    
}
