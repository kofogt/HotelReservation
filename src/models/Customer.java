package models;

import javax.management.StringValueExp;
import java.util.*;
import java.util.regex.Pattern;

public class Customer implements ICustomer {
 public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    private   String firstName;
    private  String lastName;
    private String emailAddress;
    String email = "^(.+)@(.+).(.+)$";
    Pattern pattern = Pattern.compile(email);

public Customer(){
    System.out.println("Customer class");
}
    public Customer(String firstName, String lastName, String emailAddress) {
        if (!pattern.matcher(emailAddress).matches()) {
            throw new IllegalArgumentException("Error, invalid email");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;

    }



    Map <String, String> userAccount = new HashMap<>();
    public void addUser() {
        userAccount.putAll()
        System.out.println(userAccount);
    }
public  String  findUser(String emailAddress){
        if(userAccount.containsKey(emailAddress)){
            System.out.println(userAccount.get(emailAddress));
        }
        else{
            System.out.println("User not found");
        }
        return firstName + " " + lastName + " " + emailAddress;
    }

    public void printAllCustomers(){
 System.out.println(Arrays.asList(userAccount));
//    System.out.println(Collections.singletonList(userAccount));
    }

    @Override
    public String toString() {
        return "First Name: '" + firstName + '\'' +"Last Name: '" + lastName + '\''
                +", emailAddress: '" + emailAddress + '\'';
    }


}
