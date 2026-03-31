import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserInfoToFile{
    public static void main(String[] args){

        BufferedReader br = null;
        FileWriter fw = null;

        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            fw = new FileWriter("C:\\Users\\Dipanshu\\OneDrive\\Documents\\MIC_QUEST.txt");

            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            fw.write("Name: " + name);
            fw.write("Age: " + age );
            fw.write("Favorite Language: " + language);

            System.out.println("User data saved successfully");

        }catch(IOException e){
            System.out.println("Input or file error occurred");

        }finally{
            try{
                if(br != null){
                    br.close();
                }
                if(fw != null){
                    fw.close();
                }
            }catch(IOException e){
                System.out.println("Error while closing resources");
            }
        }
    }
}
