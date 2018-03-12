package fxmltableview;

import javafx.beans.property.SimpleStringProperty;

public class Person {

    private final SimpleStringProperty firstName = new SimpleStringProperty("");
    private final SimpleStringProperty lastName = new SimpleStringProperty("");
    private final SimpleStringProperty email = new SimpleStringProperty("");
    private final SimpleStringProperty status= new SimpleStringProperty("");

    public Person() {
        this(" ", " ", " "," ");
    }

    public Person(String firstName, String lastName, String email,String status) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setStatus(status);
    }

    public String getFirstName() {
        return firstName.get();
    }

    private void setFirstName(String fName) {
        firstName.set(fName);
    }

    public String getLastName() {
        return lastName.get();
    }

    private void setLastName(String fName) {
        lastName.set(fName);
    }

    public String getEmail() {
        return email.get();
    }

    private void setEmail(String fName) {
        email.set(fName);
    }
    public String getStatus() {
        return status.get();
    }
    private void setStatus(String fname){
    status.set(fname);
    }

}