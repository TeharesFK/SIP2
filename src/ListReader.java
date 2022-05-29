import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    public void printListOnBox(ArrayList<String> stuArr){

        int q=5;
        String combineArr ="ID  Name    M   F   H1  H2  \n";
        for (int i =0; i < stuArr.size(); i++)
        {

            if(i<q)
            {
                combineArr+=(stuArr.get(i)+"    ");
            }
            else
            {
                combineArr+=(stuArr.get(i)+"\n");
                q = q + 6;
            }

        }
        JOptionPane.showMessageDialog(null,combineArr,"boxtest",JOptionPane.INFORMATION_MESSAGE);

    }

}
