import java.util.ArrayList;
import java.util.Scanner;
public class ListWriter {

    public int getNextID(ArrayList<String> stuArr){
        int counter1=0,nextID=1;
        if (stuArr.size()==0)
            return 1;
        else {
            for (int i = 0;i<stuArr.size();i++){
                if(counter1<5)
                    counter1++;
                else
                {
                    counter1=0;
                    nextID++;
                }
            }
        }
        return nextID;
    }

    public void writeStudent(ArrayList<String> stuArr)
    {
        Scanner keyboard = new Scanner(System.in);
        stuArr.add(Integer.toString(getNextID(stuArr)));

        System.out.println("Please enter the students name");
        stuArr.add(keyboard.nextLine());
        System.out.println("Please enter the students midterm grade ");
        stuArr.add(keyboard.nextLine());
        System.out.println("Please enter the students finals grade ");
        stuArr.add(keyboard.nextLine());
        System.out.println("Please enter the first homework grade");
        stuArr.add(keyboard.nextLine());
        System.out.println("Please enter the students second homework grade");
        stuArr.add(keyboard.nextLine());

    }


}
