import java.io.*;
public class Read {
    public static void main(String[] args) {
        try{
       BufferedReader br = new BufferedReader(new FileReader("input.txt"));
int a = Integer.parseInt(br.readLine());
int b = Integer.parseInt(br.readLine());
br.close();
  System.out.println("Sum:"+(a+b));
    }}
    catch(Exception e){System.out.println("Error:"+e.getMessage();}
}
