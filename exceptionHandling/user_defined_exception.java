// Define the user-defined exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    } 
}

public class user_defined_exception {
    public static void main(String[] args) {
        try {
            checkAge(15);  // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is too young. Must be 18 or older.");
        }
        System.out.println("Age " + age + " is valid.");
    }
}



   
