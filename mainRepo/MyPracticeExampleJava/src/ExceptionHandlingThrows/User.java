package ExceptionHandlingThrows;

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

    public void collectUserDetails(int numberOfUsers, Scanner scanner) {
        for (int i = 0; i < numberOfUsers; i++) {
            String username;

            do {
                System.out.println("Please enter user name (must be exactly 10 characters):");
                username = scanner.nextLine();

                if (username.length() < 10) { // in this prog  in if condition statement  != means exactly take 10 character only

                    // < means take 10 more character both are possible
                    System.out.println("Username must be exactly 10 characters. Please enter again.");
                }
            } while (username.length() < 10);

            System.out.println("Please give password:");
            String password = scanner.nextLine();

            User user = new User(username, password);
            users.add(user);
        }
    }

    public void validateUser(Scanner scanner) {
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

        System.out.println("Hi Admin. How many User details do you want to enter into your system:");
        int numberOfUsers;

        while (true) {
            try {
                numberOfUsers = Integer.parseInt(scanner.nextLine());
                if (numberOfUsers > 0) {
                    break;
                } else {
                    System.out.println("Please enter a valid positive number of users.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        UserValidator userValidator = new UserValidator();
        userValidator.collectUserDetails(numberOfUsers, scanner);

        try {
            userValidator.validateUser(scanner);
        } catch (UsernameNotFoundException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}
