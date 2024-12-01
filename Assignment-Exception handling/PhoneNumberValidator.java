// 3. Create a program to get phone number from the user and throw InputMismatchException if the user enters non-number input
import java.util.InputMismatchException;

public class PhoneNumberValidator {

    public static void main(String[] args) {
        try {
            long mobileNumber = 5789123456L; 
            if (isValidPhoneNumber(mobileNumber)) {
                System.out.println("Phone number is valid.");
            } else {
                System.out.println("Phone number is invalid.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static boolean isValidPhoneNumber(long mobileNumber) throws InputMismatchException {
       
        String numberStr = String.valueOf(mobileNumber);
        if (!numberStr.matches("^6789\\d{6}$")) {
            throw new InputMismatchException("Phone number must start with 6|7|8|9 and be exactly 10 digits.");
        }

        return true; 
    }
}
