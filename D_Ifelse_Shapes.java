 import java.util.Scanner;
 import java.text.DecimalFormat;
 public class D_Ifelse_Shapes{
 public static void main(String args[]){
    
     String input;
     double radius,side,height,width,area;
     char ask;
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner x = new Scanner(System.in);
   
     do{
     System.out.print("Input shape:");
     input = x.next();
     if(input.equals("circle")){
     	System.out.print("Enter radius: ");
     	radius = x.nextDouble();
     	area = Math.PI*(radius*radius);
     	System.out.print("The area of the circle is:"+df.format(area));
     }else if(input.equals("square")){
     	System.out.print("Enter the value of side: ");
     	side = x.nextDouble();
     	area =side*2;
     	System.out.println("The area of the square is:"+df.format(area));
     }else if(input.equals("rectangle")){
     	System.out.print("Enter width: ");
     	width = x.nextDouble();
     	System.out.print("Enter height: ");
     	height = x.nextDouble();
     	area = height * width;
     	System.out.println("The area of the rectangle is:"+df.format(area));
     }else if(input.equals("trinangle")){
     	System.out.print("Enter width: ");
     	width = x.nextDouble();
     	System.out.print("Enter height: ");
     	height = x.nextDouble();
     	area = width * height / 2;
     	System.out.println("The area of the triangle is:"+df.format(area));
     }else{
     System.out.println("Invalid input");
     }
     System.out.print("try again?[y/n]:");
     ask = x.next().charAt(0);
     }while(ask=='y'||ask=='Y');
        }
        
      }
     
     
     
        
