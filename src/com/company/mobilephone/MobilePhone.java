package com.company.mobilephone;


import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if (findContact(contact.getName()) == -1){
            this.myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact.getName()) != -1 &&
                findContact(newContact.getName()) == -1){
            this.myContacts.set(findContact(oldContact.getName()),newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        if (findContact(contact.getName()) != -1 ){
            this.myContacts.remove(contact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact){
        return findContact(contact.getName());
    }

    private int findContact(String name){
        for (Contact contact : this.myContacts) {
            if (contact.getName().equals(name)){
                return this.myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        for (Contact contact : this.myContacts) {
            if (contact.getName().equals(name)){
                return contact;
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        int i = 1;
        for (Contact contact : this.myContacts) {
            System.out.println(i+". "+contact.getName()+" -> "+contact.getPhoneNumber());
            i++;
        }
    }
}
