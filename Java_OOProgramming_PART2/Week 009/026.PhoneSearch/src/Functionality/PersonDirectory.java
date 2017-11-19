package Functionality;

import java.util.*;

public class PersonDirectory {

    private List<PersonData> personList;
    private Map<String, String> personAddress;
    private Map<PersonData, List<String>> personPhone;

    public PersonDirectory(){
        this.personList = new ArrayList<>();
        this.personAddress = new HashMap<>();
        this.personPhone = new HashMap<>();
    }

    public void addPersonToList(PersonData person){
        if(!checkPersonExistence(person.getPersonName())){
            this.personList.add(person);
        }
    }

    public void addPersonByPhone(PersonData person, String phone){
        if(!this.personPhone.containsKey(person)){
            this.personPhone.put(person, new ArrayList<>());
        }

        addPersonToList(person);
        if(!phone.equals("")){
            person.addPhoneNumber(phone);
            this.personPhone.get(person).add(phone);
        }

    } // 1

    public List<String> getPhoneByName(String personName){
        for(PersonData p : this.personPhone.keySet()){
            if(p.getPersonName().equals(personName)){
                return p.getPhoneNumbers();
            }
        }

        return null;
    } // 2

    public String getPersonByPhone(String phone){
        String result = "";

        for(PersonData p : this.personPhone.keySet()){
            if(p.getPhoneNumbers().contains(phone)){
                result = p.getPersonName();
            }
        }

        return result;
    } // 3

    public void addAddressToPerson(PersonData person, String street, String city){
        if(!this.personAddress.containsKey(person.getPersonName())){
            this.personAddress.put(person.getPersonName(), "");
        }

        person.addAddress(street, city);
        addPersonToList(person);
        this.personAddress.put(person.getPersonName(), person.getAddress());
    } // 4

    public List<PersonData> getPersonList(){
        return this.personList;
    }

    public boolean checkPersonExistence(String person){
        for (PersonData p : this.personList){
            if(p.getPersonName().equals(person)){
                return true;
            }
        }
        return false;
    }

    public void removePersonFromDirectory(String name){
        if(checkPersonExistence(name)){
            for(PersonData p : this.getPersonList()){
                if(p.getPersonName().equals(name)){
                    this.getPersonList().remove(p);
                    this.personPhone.remove(p);
                    this.personAddress.remove(name);
                    p.clearAll();
                    break;
                }
            }
        }
    }

}
