import java.util.ArrayList;
import java.util.Scanner;

public class InfoMenu extends InfoSystem {


    public InfoMenu(ArrayList<String> arr) {
        super(arr);
    }

    public void start(){
        Scanner keyboard = new Scanner(System.in);
        int choice1,
                choice2,
                choice3;
        String input;
        boolean isItOn= true;

        while (isItOn){
            System.out.println("""
                    [1]Enter Student\t[2]View Student List
                    [3]Delete Student\t[4]Update Student Info
                    [5]End The Process""");
            choice1 = keyboard.nextInt();
            switch (choice1){
                case 1:
                    addStudent();
                    continue;
                case 2:
                    viewList();
                    continue;
                case 3:
                    System.out.println("Enter the students number:");
                    choice2 = keyboard.nextInt();
                    deleteStudent(choice2);
                    continue;
                case 4:
                    System.out.println("Enter the students number:");
                    choice2 = keyboard.nextInt();
                    System.out.println("""
                            Enter the topics number
                            [1]Name\t[2]Midterms\t[3]Finals
                            [4]First Homework\t[5]Second Homework""");
                    choice3 = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Enter new info:");
                    input = keyboard.nextLine();
                    updateInfo(choice2,choice3,input);
                    continue;
                case 5:
                    System.out.println("Closing system. . .");
                    exitSystem();
                    isItOn = false;
                    continue;
                default:

            }
        }
    }
}
