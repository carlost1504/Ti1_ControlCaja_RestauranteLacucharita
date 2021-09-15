package Ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class modulo_ingredientes extends Stage {
	
	  
	    private TableView<?> tabla_Ingredients;

	    private Button Bt_addProduct;

	    private Button Bt_deleateProduct;

	    private TextField tx_Amount;

	    private SplitMenuButton Bt_typeUnit;

	    private Button Bt_addAmount;
	    
	    public modulo_ingredientes() {
	    	try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("modulo_ingredientes.fxml"));
		        Parent parent = loader.load();
				
		        tabla_Ingredients=(TableView<?>)loader.getNamespace().get("tabla_Ingredients");
		        Bt_addProduct=(Button)loader.getNamespace().get("Bt_addProduct");
		        Bt_deleateProduct=(Button)loader.getNamespace().get("Bt_deleateProduct");
		        tx_Amount=(TextField)loader.getNamespace().get("tx_Amount");
		        Bt_typeUnit=(SplitMenuButton)loader.getNamespace().get("Bt_typeUnit");
		        Bt_addAmount=(Button)loader.getNamespace().get("Bt_addAmount");
		        
		        
				Scene scene=new Scene(parent,750,600);
				setScene(scene);
				init();
			} catch (Exception e) {
				e.printStackTrace();
			}
	    }
	    
	    public void init() {
	    	
	    }
	    
	    public void addProduct() {
	    	Bt_addProduct.setOnAction(Event->{
	    		Modulos p=new Modulos();
				modulo_personal m=new modulo_personal();
				m.show();
				p.close();
			});
	    }
	    
	    public void deleateProduct() {
	    	Bt_deleateProduct.setOnAction(Event->{
	    		Modulos p=new Modulos();
				modulo_personal m=new modulo_personal();
				m.show();
				p.close();
			});
	    }
	    
	    public void addAmount() {
	    	Bt_addAmount.setOnAction(Event->{
	    		Modulos p=new Modulos();
				modulo_personal m=new modulo_personal();
				m.show();
				p.close();
			});
	    }
}
