import java.util.*;

public class PhoneBook {

    private Map<String,String> contactBook = new TreeMap<String, String>();

    public String lookupPhoneNumberFromName(String bookName){
        return contactBook.get(bookName);
    }

    public void addPhoneNumberToPhoneBook(String name, String number){
        contactBook.put(name,number);
    }

    public String getListOfNamesAndPhoneNumbers(){
        String listOfNamesAndNumbers = "";
        for(Map.Entry<String,String> entry : contactBook.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            listOfNamesAndNumbers += key+"\n";
            listOfNamesAndNumbers += value+"\n";
        }
        return listOfNamesAndNumbers;

    }

    public String getListOfPhoneNumbers(){
        String listOfNamesAndNumbers = "";
        for(Map.Entry<String,String> entry : contactBook.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            listOfNamesAndNumbers += value+"\n";
        }
        return listOfNamesAndNumbers;
    }

    public void removeEntry(String name){
        contactBook.remove(name);
    }
}
