package custom_exception;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            registerUser("admin");
        } catch (UserAlreadyExistsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void registerUser(String username) throws UserAlreadyExistsException {
        if ("admin".equalsIgnoreCase(username)) {
            throw new UserAlreadyExistsException("Username 'admin' is already taken.");
        }
        System.out.println("User registered: " + username);
    }
}
