package test;

import javafx.beans.property.SimpleStringProperty;

public class Person {

	private SimpleStringProperty name = new SimpleStringProperty("");

	public Person(String name) {
		this.name.set(name);
	}

	public SimpleStringProperty getNameProp() {
		return name;
	}
	
	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}
	
	
	
	
	
	
	
}
