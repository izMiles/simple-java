package booksystem.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;

public class LoginController {
    
    public LoginController(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String username = scanner.nextLine();

        System.out.println("Enter Password");
        String password = scanner.nextLine();

        UsersController usersController = new UsersController();
        System.out.println( usersController.accountCheckpoint(username, password) ? "Successfully Login!" : "User not found!");
        

    }

        
    }

