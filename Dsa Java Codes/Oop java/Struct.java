import java.util.*;
public class example
{
    public  static class student{  // java struct
         int roll_no;  
         String name;
    }

    public static void main(String[] args)
    {  
         student obj = new student(); // obj creation
        obj.roll_no=10;
        obj.name="atharv";
        System.out.println(obj.name+" "+ obj.roll_no);
    }
}