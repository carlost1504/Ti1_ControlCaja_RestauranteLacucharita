package Ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.UUID;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Dish;
import model.Oder;

public class modulo_pedidos extends Stage {
	
	
    private Button bt_addAmount;

    private TextField tx_amountPedidos;

    private Button bt_SingnOff;

    private Button bt_home;

    private TableView<?> Tabla_menusAvaliable;

    private TableView<?> Tabla_pedidosSelected;
    
    public ArrayList<Oder>oder;
    
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
	        
	      
	        
			Scene scene=new Scene(parent,693,611);
			setScene(scene);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void BtHome() {
    	bt_home.setOnAction(Event->{
    		Modulos p= new Modulos();
    		p.show();
		});
    }
    
    public void Btreturn() {
        bt_SingnOff.setOnAction(Event->{
        	modulo_pedidos p= new modulo_pedidos();
        	p.close();
		});
    }
    
    private void SaveJavaByteCode() {
    	try {
        	File ref = new File("Dish.temp");
			FileOutputStream fos = new FileOutputStream(ref);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(oder);
			oos.close();	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
	}
    
    public ArrayList<Dish> loadData() {
    	try {
    		File f =  new File("Inventary.temp");
    		FileInputStream fis = new FileInputStream(f);
    		ObjectInputStream ois = new ObjectInputStream(fis);
    		ArrayList<Dish> post = (ArrayList<Dish>) ois.readObject();
    		
    		return post;
    		
    	} catch (IOException ex) {
    		ex.printStackTrace();
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
    	
    }
}
