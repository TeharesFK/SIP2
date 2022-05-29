import java.io.*;
import java.util.ArrayList;

public class FileWork {
    public File fileName = new File("SIP2CONTENT.txt");

    public void fileToArr(ArrayList<String> stuArr)throws IOException{

        BufferedReader br =new BufferedReader(new FileReader(fileName));
        String line;

        while((line=br.readLine())!=null)
        {
            stuArr.add(line);
            }

    }

    public void arrToFile(ArrayList<String> stuArr)throws IOException{

        BufferedWriter bw =new BufferedWriter(new FileWriter(fileName));
        int counter = 0;

        while (counter < stuArr.size()){
            bw.write(stuArr.get(counter)+"\n");
            counter++;
        }
        bw.flush();
    }
}
