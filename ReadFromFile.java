import java.io.*;
public class ReadFromFiile {
    public static void main(String[] args) {
       BufferedReader br = new BufferedReader(new FileReader("input.txt"));
int a = Integer.parseInt(br.readLine());
int b = Integer.parseInt(br.readLine());
br.close()
  System.out.println("Sum:"+(a+b));
    }
}
