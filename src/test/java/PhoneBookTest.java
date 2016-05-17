import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PhoneBookTest {

    PhoneBook phoneBook;

    @Before
    public void initialize(){
        phoneBook = new PhoneBook();
        String number = "5552345";
        String name = "Derek";
        phoneBook.addPhoneNumberToPhoneBook(name,number);
    }

    @Test
    public void lookupPhoneNumberFromNameTest(){
        String expected = "5552345";
        String actual = phoneBook.lookupPhoneNumberFromName("Derek");
        assertEquals(expected,actual);

    }

    @Test
    public void addPhoneNumberToPhoneBookTest(){
        String number = "5552346";
        String name = "Sonny";
        phoneBook.addPhoneNumberToPhoneBook(name,number);
        String expectedNumber = "5552346";
        String actualNumber = phoneBook.lookupPhoneNumberFromName(name);
        assertEquals(expectedNumber,actualNumber);
    }

    @Test
    public void getListOfNamesAndPhoneNumbersTest(){
        String number = "5552346";
        String name = "Sonny";
        phoneBook.addPhoneNumberToPhoneBook(name,number);
        String expected = "Derek\n5552345\nSonny\n5552346\n";
        String actual = phoneBook.getListOfNamesAndPhoneNumbers();
        assertEquals(expected,actual);
    }

    @Test
    public void getListOfPhoneNumbersTest(){
        String number = "5552346";
        String name = "Sonny";
        phoneBook.addPhoneNumberToPhoneBook(name,number);
        String expected = "5552345\n5552346\n";
        String actual = phoneBook.getListOfPhoneNumbers();
        assertEquals(expected,actual);
    }

    @Test
    public void removeEntryTest(){
        phoneBook.removeEntry("Derek");
        assertNull(phoneBook.lookupPhoneNumberFromName("Derek"));
    }
}
