public class CustomExceptionDemo {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is strictly under 18. Access denied.");
        }
        System.out.println("Access granted.");
    }

    public static void main(String[] args) {
        try {
            // Passing 15 will trigger the custom exception
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}
