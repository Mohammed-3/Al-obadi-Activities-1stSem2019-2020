import java.util.Scanner;
public class Age{
	public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int age;
    do{
      System.out.println("Type ypur age:");
      age = s.nextlnt();
        if (age >= 0 && age <= 3)
          System.out.println("Baby");
          else if (age >= 4 && age =< 12)
            System.out.println("child");
          else if (age >=13 && age =< 19)
            System.out.prinln("Teen");
          else if (age >=20 && age <= 32)
            System.out.println("Young Adult");
          else if (age >= 33 && age =< 45)
            System.out.prinln("Middle age");
          else if (age >= 46 && age =< 59)
            System.out.println("Adult");
          else if (age >= 60 && age =< 122)
            System.out.println("Senior");
         else 
            System.out.println("Invalid Output");
   } while(age<0||age>=122);
  }
}
 