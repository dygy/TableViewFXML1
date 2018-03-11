package fxmltableview;

import javafx.beans.property.SimpleStringProperty;

public class Person {

    private final SimpleStringProperty firstName = new SimpleStringProperty("");
    private final SimpleStringProperty lastName = new SimpleStringProperty("");
    private final SimpleStringProperty email = new SimpleStringProperty("");
    private final String status= new String("");

    public Person(String text, String lastNameFieldText, String emailFieldText) {
        this(" ", " ", " "," ");
    }

    public Person(String firstName, String lastName, String email,String Status) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setStatus(status);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String fName) {
        firstName.set(fName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String fName) {
        lastName.set(fName);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String fName) {
        email.set(fName);
    }
    public String getStatus() {
        return status;
    }
    public void setStatus (String fname){
       return;
    }
}