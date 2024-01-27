package Aula13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContactManager implements ContactManagerInterface {
    private List<Contact> contacts;

    public ContactManager(){
        contacts = new ArrayList<>();
    }

    @Override
    public void addContact(Contact contact) {
        contacts.add(contact);
        
    }

    @Override
    public void removeContact(Contact contact) {
        contacts.remove(contact);
       
    }

    @Override
    public void upgradeContact(Contact contact) {
       //
    }

    @Override
    public Contact searchContact(String nome) {
        for(Contact contact : contacts ){
            if(contact.getNome().equals(nome)){
                return contact;
            }
        }
        return null;

        
    }

    @Override
    public void listContact() {
        for(Contact contact : contacts){
            System.out.println(contact);
        }

       
    }

    @Override
    public void listContactOrderedByname() {
        contacts.sort((a, b) -> a.getNome().compareTo(b.getNome()));
       for(Contact contact : contacts){
        System.out.println(contact);
        }
        
    }

    @Override
    public void listContactOrderedByEmail() {
        contacts.sort((a, b) -> a.getEmail().compareTo(b.getEmail()));
        for(Contact contact : contacts){
            System.out.println(contact);
            }
    }

    @Override
    public void listContactOrderedByNumber() {
        List<Contact> sortedContacts = new ArrayList<>(contacts);
        Collections.sort(sortedContacts, Comparator.comparingDouble(Contact::getTelemovel));
        for (Contact contacto : sortedContacts) {
            System.out.println(contacto);
        }
        
    }

    @Override
    public void listContactOrderedByBirthday() {
        List<Contact> sortedContacts = new ArrayList<>(contacts);
        Collections.sort(sortedContacts, Comparator.comparing(Contact::getDataNascimento));
        for (Contact contacto : sortedContacts) {
            System.out.println(contacto);
        }
        
    }

    

    
}
