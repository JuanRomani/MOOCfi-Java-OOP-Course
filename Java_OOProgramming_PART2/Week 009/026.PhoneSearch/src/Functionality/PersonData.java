package Functionality;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonData {

    private String personName;
    private String address;
    private Set<String> phoneNumbers;

    public PersonData(String personName){
        this.personName = personName;
        this.address = "";
        this.phoneNumbers = new HashSet<>();
    }

    public String getPersonName(){
        return this.personName;
    }

    public String getAddress(){
        return this.address;
    }

    public List<String> getPhoneNumbers(){
        List<String> phones = new ArrayList<>();

        for(String phone : this.phoneNumbers){
            phones.add(phone);
        }

        return phones;
    }

    public void addPhoneNumber(String phoneNumber){
        this.phoneNumbers.add(phoneNumber);
    }

    public void addAddress(String street, String city){
        this.address = street + " " + city;
    }

    public void clearAll(){
        this.address = "";
        this.phoneNumbers.clear();
    }



}
