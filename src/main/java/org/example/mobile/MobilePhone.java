package org.example.mobile;

import java.util.ArrayList;

public class MobilePhone {
    public String myNumber;
    public ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public String getMyNumber() {
        return myNumber;
    }

    public boolean addNewContact(Contact contact){

    }
    public boolean updateContact(){

    }
    public boolean removeContact(Contact contact){

    }
    public  int findContact(Contact contact){

    }
    public Contact findContact(String contact){

    }
    public String queryContact(String contatc){

    }

    public void printContact(){
        System.out.println(myContacts);
    }

}
