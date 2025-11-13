package com.app.auth;
import com.app.dto.Customer;
import com.app.exceptions.InvalidCredentialsException;
import java.util.Scanner;

public class UserSignIn {
    private static final String USERNAME = "saiteja";
    private static final String PASSWORD = "1234";

    public static Customer login() throws InvalidCredentialsException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if(USERNAME.equals(user) && PASSWORD.equals(pass)) {
            System.out.println("Login successful");
            return new Customer("Saiteja", "saiteja@gmail.com", "11111", 100000);
        } else {
            throw new InvalidCredentialsException("Invalid credentials provided.");
        }
    }
}
