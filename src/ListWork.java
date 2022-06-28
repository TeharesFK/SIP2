import java.util.ArrayList;
import java.util.Scanner;
public class ListWork {

    public ArrayList<String> stuArr;

    public ListWork(ArrayList<String> arr){
        stuArr = arr;
    }

    public int getNextID(){
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

    public void writeStudent()
    {
        Scanner keyboard = new Scanner(System.in);
        stuArr.add(Integer.toString(getNextID()));
        String[] questions ={"Please enter the students name",
                "Please enter the students midterm grade",
                "Please enter the students finals grade",
                "Please enter the first homework grade",
                "Please enter the students second homework grade"};
        for(int i = 0;i<5;i++){
            System.out.println(questions[i]);
            stuArr.add(keyboard.nextLine().trim());
        }

    }

    public void printListOnConsole(){
        int q=5;

        for (int i =0; i < stuArr.size(); i++)
        {

            if(i<q)
            {
                System.out.print(stuArr.get(i)+"\t");
            }
            else
            {
                System.out.println(stuArr.get(i));
                q = q + 6;
            }

        }

    }

}
