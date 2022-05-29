import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> stuList =new ArrayList<String>();
        ListReader lr =new ListReader();
        ListWriter lw =new ListWriter();
        InfoSystem iSys =new InfoSystem(stuList);
        int choice1,
                choice2,
                choice3;
        String input;
        boolean isItOn= true;

        while (isItOn){
            System.out.println("[1]Enter Student\t[2]View Student List\n" +
                    "[3]Delete Student\t[4]Update Student Info\n" +
                    "[5]End The Process");
            choice1 = keyboard.nextInt();
            switch (choice1){
                case 1:
                    lw.writeStudent(stuList);
                    continue;
                case 2:
                    lr.printListOnConsole(stuList);
                    continue;
                case 3:
                    System.out.println("Enter the students number:");
                    choice2 = keyboard.nextInt();
                    iSys.deleteStudent(choice2);
                    continue;
                case 4:
                    System.out.println("Enter the students number:");
                    choice2 = keyboard.nextInt();
                    System.out.println("Enter the topics number\n"+"[1]Name\t[2]Midterms\t[3]Finals\n[4]First Homework\t[5]Second Homework");
                    choice3 = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Enter new info:");
                    input = keyboard.nextLine();
                    iSys.updateInfo(choice2,choice3,input);
                    continue;
                case 5:
                    System.out.println("Closing system. . .");
                    iSys.exitSystem();
                    isItOn = false;
                    continue;
                default:

            }
        }


    }


}
