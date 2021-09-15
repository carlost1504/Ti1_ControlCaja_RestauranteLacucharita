package Ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Modulos extends Stage {

	private Button bt_model_person;

    private Button bt_model_pedido;

    private Button bt_model_inventario;

    private Button bt_model_carta;

    private Button bt_sing_off;
    
    
    public Modulos() {
    	try {
			 FXMLLoader loader = new FXMLLoader(getClass().getResource("Modulos.fxml"));
	         Parent parent = loader.load();
			
	        bt_model_person=(Button)loader.getNamespace().get("bt_model_person");
	        bt_model_pedido=(Button)loader.getNamespace().get("bt_model_pedido");
	        bt_model_inventario=(Button)loader.getNamespace().get("bt_model_inventario");
	        bt_model_carta=(Button)loader.getNamespace().get("bt_model_carta");
	        bt_sing_off=(Button)loader.getNamespace().get("bt_sing_off");
	        
			Scene scene=new Scene(parent,569,525);
			setScene(scene);
			person();
			pedido();
			inventario();
			carta();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void person() {
    	bt_model_person.setOnAction(Event->{
    		Modulos p=new Modulos();
			modulo_personal m=new modulo_personal();
			m.show();
			p.close();
		});
    }
    public void pedido() {
    	bt_model_pedido.setOnAction(Event->{
    		Modulos p=new Modulos();
			modulo_pedidos m=new modulo_pedidos();
			m.show();
			p.close();
		});
    }
    public void inventario() {
    	bt_model_inventario.setOnAction(Event->{
    		Modulos p=new Modulos();
			modulo_ingredientes m=new modulo_ingredientes();
			m.show();
			p.close();
		});
    }
    public void carta() {
    	bt_model_carta.setOnAction(Event->{
    		Modulos p=new Modulos();
			modulo_ingredientes m=new modulo_ingredientes();
			m.show();
			p.close();
		});
    }
    
}
