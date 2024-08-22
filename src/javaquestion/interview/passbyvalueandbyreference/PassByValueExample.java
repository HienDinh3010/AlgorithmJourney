package javaquestion.interview.passbyvalueandbyreference;

public class PassByValueExample {
    public static void main(String[] args) {
        Person person = new Person("John");
        modifyPerson(person);// Java does not support Pass by reference, here we pass person to parameters
        //The field String of name changes to "Jane" because String is a reference object from person, it does change person
        //But it is still call "Pass by Value"
        System.out.println("Person name after modifyPerson: " + person.getName()); // Name is changed to "Jane"
    }

    public static void modifyPerson(Person person) {
        person.setName("Jane"); // Modifies the state of the object that the reference points to
    }
}
