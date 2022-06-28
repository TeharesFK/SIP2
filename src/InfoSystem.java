import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InfoSystem {

    public  ArrayList<String> stuArr;

    public InfoSystem(ArrayList<String> arr) {
        stuArr = arr;

        try {
            FileWork fw =new FileWork();
            fw.fileToArr(stuArr);
        }
        catch (IOException e){
            System.out.println("Filework1>InfoSystem Error");
            e.printStackTrace();
        }


    }

    public void exitSystem(){
        try {
            FileWork fw =new FileWork();
            fw.arrToFile(stuArr);
        }catch (IOException e){
            System.out.println("Filework2>InfoSystem Error");
            e.printStackTrace();
        }
    }

    public ArrayList<String> getStuArr() {
        return stuArr;
    }

    public void setStuArr(ArrayList<String> stuArr) {
        this.stuArr = stuArr;
    }


    public void resetID(){
        int count=0,newID=1;
        while(count<stuArr.size()){
            String replace = stuArr.set((newID-1)*6,Integer.toString(newID));
            newID++;
            count = (newID)*5;

        }
    }
    public void updateInfo(int studentID,int choice,String input){
        String oldinfo = stuArr.set((studentID - 1)*6+choice,input);
    }

    public void deleteStudent(int studentID){
        for(int i =0; i<6;i++)
            stuArr.remove((studentID - 1)*6);
        resetID();
    }

    public void addStudent(){
        ListWork lw  =new ListWork(stuArr);
        lw.writeStudent();
    }

    public void viewList(){
        ListWork lw =new ListWork(stuArr);
        System.out.println("ID"+"\tName"+"\tM"+"\tF"+"\tH1"+"\tH2");
        lw.printListOnConsole();
    }

}
