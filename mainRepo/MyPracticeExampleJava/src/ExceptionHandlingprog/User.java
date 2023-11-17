package ExceptionHandlingprog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class UserValidator {
    private List<User> users;

    public UserValidator() {
        this.users = new ArrayList<>();
    }

    public void collectUserDetails(int numberOfUsers) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfUsers; i++) {
            System.out.println("Please enter user name:");
            String username = scanner.nextLine();

            System.out.println("Please give password:");
            String password = scanner.nextLine();

            User user = new User(username, password);
            users.add(user);
        }
    }

    public void validateUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your username:");
        String enteredUsername = scanner.nextLine();

        boolean usernameFound = false;
        for (User user : users) {
            if (user.getUsername().equals(enteredUsername)) {
                System.out.println("Hi " + enteredUsername);
                usernameFound = true;

                System.out.println("Please enter your password:");
                String enteredPassword = scanner.nextLine();

                if (user.getPassword().equals(enteredPassword)) {
                    System.out.println("User login successfully completed.");
                } else {
                    throw new InvalidPasswordException("Invalid Password!!");
                }
                break;
            }
        }

        if (!usernameFound) {
            throw new UsernameNotFoundException("Username not found");
        }
    }
}

class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

class UsernameNotFoundException extends RuntimeException {
    public UsernameNotFoundException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi Admin. How many User details you want to enter into your system:");
        int numberOfUsers = scanner.nextInt();

        UserValidator userValidator = new UserValidator();
        userValidator.collectUserDetails(numberOfUsers);

        try {
            userValidator.validateUser();
        } catch (UsernameNotFoundException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

}