package viikko6teht1;
import java.util.Scanner;
public class Viikko6teht1 {
    public static void main(String[] args) {
       
        MyThread saie1 = new MyThread('*');
        MyThread saie2 = new MyThread('+');
        
        saie1.start();
        saie2.start();
               
    }}