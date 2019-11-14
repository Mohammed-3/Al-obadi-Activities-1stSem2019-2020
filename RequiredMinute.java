import java.util.Scanner;
public class RequiredMinute{
  public static void main (String args[]){
  
  
  	Scanner x = new Scanner (System.in);
  	int hours, minutes;
  	int mins;
  	char ask;
  
  	do{
      	System.out.print("Enter minutes: ");
      	minutes = x.nextInt();
      	hours = minutes/60;
      	mins = minutes%60;
      	System.out.println("There are " + hours + " hours and " + mins +" minutes :)");
     
     	System.out.print("Do you want to try again? [y/n]: ");
     	ask=x.next().charAt(0);
     }while(ask=='y'||ask=='Y');
    }
   }  