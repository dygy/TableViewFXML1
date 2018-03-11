package test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class TestController implements Initializable {
	
	@FXML
	TableView<Person> tabel;
		
	
	@FXML
	TableColumn<Person, String> colName;
	
	@FXML 
	Button btnQuit;
	
	@FXML 
	Button btnAdd;	
	
	@FXML 
	TextField txtName;

	private ObservableList<Person> items;
	
	
			

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		items = tabel.getItems();
				
		colName.setCellValueFactory(cellValue -> cellValue.getValue().getNameProp());
		
//		
//		Person p1 = new Person("");
//		Person p2 = new Person("");
//		Person p3 = new Person("");
//		
//		items.addAll(p1, p2, p3);

		
		btnQuit.setOnAction(quit -> {
			Platform.exit();
		});
		
		
		btnAdd.setOnAction(add -> {			
			items.add( new Person( txtName.getText() ) );
		});
					
		tabel.setOnKeyReleased(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				
				if ( (event.getCode().equals(KeyCode.DOWN)) || (event.getCode().equals(KeyCode.UP)) ){
					int i = tabel.getSelectionModel().getSelectedIndex();
					Person p = tabel.getItems().get(i);
					System.out.println(p.getName());
				}
				
			}
			
		});
		
			
		tabel.setOnMouseClicked(t -> {
			
			int i = tabel.getSelectionModel().getSelectedIndex();
			Person p = tabel.getItems().get(i);
			System.out.println(p.getName());
			
		});
		
	}


	public ObservableList<Person> getItems() {
		return items;
	}




	public void setItems(ObservableList<Person> items) {
		this.items = items;
	}

}
