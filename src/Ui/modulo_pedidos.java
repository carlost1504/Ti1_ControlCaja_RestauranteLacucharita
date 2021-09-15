package Ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class modulo_pedidos extends Stage {
	
	
    private Button bt_addAmount;

    private TextField tx_amountPedidos;

    private Button bt_SingnOff;

    private Button bt_home;

    private TableView<?> Tabla_menusAvaliable;

    private TableView<?> Tabla_pedidosSelected;
    
    public modulo_pedidos() {
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("modulo_Pedidos.fxml"));
	        Parent parent = loader.load();
			
	        bt_addAmount=(Button)loader.getNamespace().get("bt_addAmount");
	        tx_amountPedidos=(TextField)loader.getNamespace().get("tx_amountPedidos");
	        bt_SingnOff=(Button)loader.getNamespace().get("bt_SingnOff");
	        bt_home=(Button)loader.getNamespace().get("bt_home");
	        Tabla_menusAvaliable=(TableView<?>)loader.getNamespace().get("Tabla_menusAvaliable");
	        Tabla_pedidosSelected=(TableView<?>)loader.getNamespace().get("Tabla_pedidosSelected");
	        
	        
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
