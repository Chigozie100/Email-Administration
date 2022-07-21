package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to recieve the firstname and lastname

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(this.firstName + " " + this.lastName);

        // call a method asking for the department - return department
        this.department = setDepartment();
        System.out.println("Department " + this.department);
    }


    //Ask for the department
    private String setDepartment(){
        System.out.println("Department Code\n1 for sale \n2 for Development \n3 Accounting\n0 for none\n Enter Department code: ");
        Scanner input = new Scanner(System.in);
        int depChoice = input.nextInt();
        if (depChoice == 1) return "sale";
        else if (depChoice == 2) return "dev";
        else if (depChoice == 3) return "acct";
        else {
            return "";
        }
    }

    //Generate a random password

    //Set the mailbox capacity

    //set the alternate mailbox

    //Change the password
}
