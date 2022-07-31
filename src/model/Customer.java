package model;

import java.util.regex.Pattern;

public class Customer {
    private   String firstName;
    private  String lastName;
    private String emailAddress;
    String email = "^(.+)@(.+).(.+)$";
    Pattern pattern = Pattern.compile(email);
    public Customer(String firstName, String lastName, String emailAddress) {
        if (!pattern.matcher(emailAddress).matches()) {
            throw new IllegalArgumentException("Error, invalid email");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;

    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
