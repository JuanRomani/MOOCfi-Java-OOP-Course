package Functionality;

public class UI {

    private ScannerReader reader;
    private PersonDirectory directory;
    private SortPersonsByName sorter;

    public UI(){
        this.reader = new ScannerReader();
        this.directory = new PersonDirectory();
        this.sorter = new SortPersonsByName();
    }

    public void mainUI(){
        System.out.println("phone search\n" +
                "available operations:\n" +
                " 1 add a number\n" +
                " 2 search for a number\n" +
                " 3 search for a person by phone number\n" +
                " 4 add an address\n" +
                " 5 search for personal information\n" +
                " 6 delete personal information\n" +
                " 7 filtered listing\n" +
                " x quit");

        while(true){
            System.out.print("\ncommand: ");
            String command = this.reader.stringReader();

            if(command.equals("1")){
                System.out.print("whose number: ");
                String name = this.reader.stringReader();
                System.out.print("number: ");
                String number = this.reader.stringReader();

                if(!this.directory.checkPersonExistence(name)){
                    PersonData person = new PersonData(name);
                    this.directory.addPersonByPhone(person, number);
                }

                for(PersonData p : this.directory.getPersonList()){
                    if(p.getPersonName().equals(name)){
                        this.directory.addPersonByPhone(p, number);
                    }
                }

            } else if(command.equals("2")){
                System.out.print("whose number: ");
                String name = this.reader.stringReader();

                for(PersonData p : this.directory.getPersonList()){
                    if(p.getPersonName().equals(name)){
                        for(String phone : this.directory.getPhoneByName(name)){
                            System.out.println(" " + phone);
                        }
                    }
                }

                System.out.println("  not found");

            } else if (command.equals("3")){
                System.out.print("number: ");
                String number = this.reader.stringReader();

                if(this.directory.getPersonByPhone(number).equals("")){
                    System.out.print(" not found");
                }

                System.out.println(" " + this.directory.getPersonByPhone(number));

            } else if(command.equals("4")){
                System.out.print("whose address: ");
                String name = this.reader.stringReader();
                System.out.print("street: ");
                String street = this.reader.stringReader();
                System.out.print("city: ");
                String city = this.reader.stringReader();

                if(!this.directory.checkPersonExistence(name)){
                    PersonData person = new PersonData(name);
                    this.directory.addAddressToPerson(person, street, city);
                }

                for(PersonData p : this.directory.getPersonList()){
                    if(p.getPersonName().equals(name)){
                        this.directory.addAddressToPerson(p, street, city);
                    }
                }

            } else if(command.equals("5")){
                System.out.print("whose information: ");
                String name = this.reader.stringReader();

                printPersonInfo(name);

            } else if(command.equals("6")){
                System.out.print("whose information: ");
                String name = this.reader.stringReader();

                this.directory.removePersonFromDirectory(name);

            } else if(command.equals("7")){
                System.out.print("keyword (if empty, all listed): ");
                String k = this.reader.stringReader();

                int results = 0;
                this.directory.getPersonList().sort(this.sorter);

                for(PersonData p : this.directory.getPersonList()){
                    if(p.getPersonName().contains(k) || p.getAddress().contains(k) || p.getPhoneNumbers().contains(k)
                            || k.equals("")){
                        System.out.println("\n " + p.getPersonName());
                        printPersonInfo(p.getPersonName());
                        results++;
                    }
                }
                if(results == 0){
                    System.out.println(" keyword not found");
                }

            } else if(command.equals("x")){
                break;
            }
        }
    }

    public void printPersonInfo(String name){
        if(this.directory.checkPersonExistence(name)){
            for(PersonData p : this.directory.getPersonList()){
                if(p.getPersonName().equals(name)){
                    if(p.getAddress().isEmpty()){
                        System.out.println("  address unknown");
                    } else {
                        System.out.println("  address: " + p.getAddress());
                    }
                    if(p.getPhoneNumbers().isEmpty()){
                        System.out.println("  phone number not found");
                    } else {
                        System.out.println("  phone numbers:");
                        for(String phone : p.getPhoneNumbers()){
                            System.out.println("   " + phone);
                        }
                    }
                }
            }
        } else {
            System.out.println("  not found");
        }
    }
}
