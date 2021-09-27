package Ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Dish;
import model.Inventary;

public class modulo_Menu_CreateCombo extends Stage {
	
	
    private Button Bt_createCombo;

    private TextField Tx_NameCombo;

    private TableView<?> tabla_ingredientCombo;

    private Button Bt_return;

    private Button Bt_home;

    private Button Bt_addIngrecienteTomenu;

    private TextField Tx_PriceComboToMenu;
    
    private ChoiceBox<String> Split_nameProduct;
    
    public ArrayList<Dish>platos;
	    
	    public modulo_Menu_CreateCombo() {
	    	platos =new ArrayList<>();
	    	try {
				FXMLLoader loader=new FXMLLoader(getClass().getResource("modulo_M.fxml"));
				Parent root=loader.load();
				
				Bt_createCombo=(Button)loader.getNamespace().get("Bt_createCombo");
				Tx_NameCombo=(TextField)loader.getNamespace().get("Tx_NameCombo");
				Bt_return=(Button)loader.getNamespace().get("Bt_return");
				Bt_home=(Button)loader.getNamespace().get("Bt_home");
				Bt_addIngrecienteTomenu=(Button)loader.getNamespace().get("Bt_addIngrecienteTomenu");
				Tx_PriceComboToMenu=(TextField)loader.getNamespace().get("Tx_PriceComboToMenu");
				String namePorduct="";
				ArrayList<Inventary>  DataInventary;
				modulo_ingredientes_addIngredientes p=new modulo_ingredientes_addIngredientes();
				DataInventary=p.getDataInventary();
				for(int i=0;i<DataInventary.size();i++) {
					namePorduct=(namePorduct + DataInventary.get(i).getName()+",");
				}
				Split_nameProduct = new ChoiceBox (FXCollections.observableArrayList (namePorduct));
				
				ArrayList<Inventary> ingredient=BtAddProduct();
				Dish dish=new Dish(Tx_NameCombo.getText(),Double.parseDouble(Tx_PriceComboToMenu.getText()),ingredient );
				platos.add(dish);
				
				Scene scene=new Scene(root,600,400);
				setScene(scene);
				
				BtAddDish();
				BtHome();
				Btreturn();
				SaveJavaByteCode();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    
	    public ArrayList<Inventary> BtAddProduct() {
	    	 ArrayList<Inventary> ingredient=new ArrayList<>();
	    	Bt_addIngrecienteTomenu.setOnAction(Event->{
	    		ingredient.addAll((Collection<? extends Inventary>) Split_nameProduct);
			});
			return ingredient;
	    }
	    
	    public void BtAddDish() {
	    	Bt_createCombo.setOnAction(Event->{
	    		SaveJavaByteCode();
			});
	    }
	    
	    public void BtHome() {
	    	Bt_home.setOnAction(Event->{
	    		Modulos p= new Modulos();
	    		p.show();
			});
	    }
	    
	    public void Btreturn() {
	    	Bt_return.setOnAction(Event->{
	    		modulo_ingredientes m_ing=new modulo_ingredientes();
	    		m_ing.show();
			});
	    }
	    
	    private void SaveJavaByteCode() {
	    	try {
	        	File ref = new File("Dish.temp");
				FileOutputStream fos = new FileOutputStream(ref);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(platos);
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

		public ArrayList<Dish> getPlatos() {
			return platos;
		}

		public void setPlatos(ArrayList<Dish> platos) {
			this.platos = platos;
		}
	    
	    
}
