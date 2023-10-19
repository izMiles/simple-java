import java.util.*;

public class practiceproj{

    

    public static void main (String args[]){
      Scanner scan = new Scanner (System.in);
        
        Database operate = new Database();
        operate.mainMenu();
    
        System.out.print("Enter your Choice: ");
        int choice = scan.nextInt();

        switch (choice){

            case 1: 
                System.out.print("Quiz Start!");
                break;
            
            case 2:
                adminMode();
                break;
            
            case 3:
                System.out.println("Thank you for using QUIZLET SYSTEM");
                break;
        }

        
    }
    public static void adminMode(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Passcode: ");
        String passcode = scan.nextLine();
        
        String codeExit = new String("exit");

        if(passcode.equals("admin1")){
            System.out.println("Login Successful!");
        }
        else if (passcode.equals("exit")){
            main(null);
        }
            else{
            System.out.println("Incorrect Passcode!");
            adminMode();
        }

    }
    
}

 
class Database{
    String questions;


    void mainMenu(){

        System.out.println("---------------------");
        System.out.println("|  QUIZLET SYSTEM   |");
        System.out.println("---------------------");
        System.out.println("| [1] START QUIZ    |");
        System.out.println("| [2] ADMIN MODE    |");
        System.out.println("| [3] EXIT          |");
        System.out.println("---------------------");
    }

    void questionOne(){
        
    }

}

