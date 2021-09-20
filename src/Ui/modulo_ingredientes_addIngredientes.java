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
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Inventary;

public class modulo_ingredientes_addIngredientes extends Stage {
	
	
    private TextField tx_NameINgredient;

    private Button bt_addProduct;

    private Button tb_return;

    private Button bt_home;
    
    private ChoiceBox<?> List_typeUniditi;
    
    private Inventary inventary;
    
    public modulo_ingredientes_addIngredientes() {
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("modulo_ingredientes_addIngredientes.fxml"));
	        Parent parent = loader.load();
			
	        tx_NameINgredient=(TextField)loader.getNamespace().get("tx_NameINgredient");
	        bt_addProduct=(Button)loader.getNamespace().get("bt_addProduct");
	        tb_return=(Button)loader.getNamespace().get("tb_return");
	        bt_home=(Button)loader.getNamespace().get("bt_home");
	        List_typeUniditi=(ChoiceBox<?>)loader.getNamespace().get("List_typeUniditi");
	        
	        
	        List_typeUniditi = new ChoiceBox (FXCollections.observableArrayList ("Km", "Lb", "units", "L", "lm"));
	        inventary=new Inventary( tx_NameINgredient.getText(), List_typeUniditi.getValue().toString(), 0);
	        
	    
			Scene scene=new Scene(parent,750,600);
			setScene(scene);
			
			BtAddProduct();
			BtAddProduct();
			BtHome();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void BtAddProduct() {
    	bt_home.setOnAction(Event->{
    		SaveJavaByteCode();
		});
    }
    
    public void BtHome() {
    	bt_addProduct.setOnAction(Event->{
    		Modulos p= new Modulos();
    		p.show();
		});
    }
    
    public void Btreturn() {
    	tb_return.setOnAction(Event->{
    		modulo_ingredientes m_ing=new modulo_ingredientes();
    		m_ing.show();
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
