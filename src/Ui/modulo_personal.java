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
    
    private Button tb_singOff;

    private Button bt_home;
    
    public modulo_personal() {
    	try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("modulo_personal.fxml"));
	        Parent parent = loader.load();
			
	        tabla_employer=(TableView<?>)loader.getNamespace().get("tabla_employer");
	        bt_CreateEmployer=(Button)loader.getNamespace().get("bt_CreateEmployer");
	        tb_deleateEmployer=(Button)loader.getNamespace().get("tb_deleateEmployer");
	        Bt_chagePassword=(Button)loader.getNamespace().get("Bt_chagePassword");
	        tb_singOff=(Button)loader.getNamespace().get("tb_singOff");
	        bt_home=(Button)loader.getNamespace().get("bt_home");
	        
			Scene scene=new Scene(parent,679,600);
			setScene(scene);
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
    
    public void init() {
    	bt_CreateEmployer.setOnAction(Event->{
    		modulo_personal_CreateEmployer p= new modulo_personal_CreateEmployer();
    		p.show();
		});
    	tb_deleateEmployer.setOnAction(Event->{
    		modulo_personal_DeleateEmployer p= new modulo_personal_DeleateEmployer();
    		p.show();
		});
    	Bt_chagePassword.setOnAction(Event->{
    		modulo_personal_ChangeOfPassword p= new modulo_personal_ChangeOfPassword();
    		p.show();
		});
    	tb_singOff.setOnAction(Event->{
    		modulo_personal p= new modulo_personal();
    		p.close();
		});
    	bt_home.setOnAction(Event->{
    		Modulos p= new Modulos();
    		p.show();
		});
    }
}
