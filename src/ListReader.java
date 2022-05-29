import java.util.ArrayList;
public class ListReader {
    public void printListOnConsole(ArrayList<String> stuArr){
        int q=5;

        System.out.println("ID"+"\tName"+"\tM"+"\tF"+"\tH1"+"\tH2");

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
