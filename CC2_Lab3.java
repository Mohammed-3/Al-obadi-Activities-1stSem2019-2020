public class CC2_Lab3 {
 public static void main (String[] args) {
 
  char a = 'A' , b= 'L' , c = 'O' , d = 'B' , e = 'A' , f = 'D' , g = 'I' , h = '!';
  long A = a, B = b , C = c , D = d , E = e , F = f , G = g , H = h;
  
   System.out.println ("A = " + A +
                       "\nL = " + B +
                       "\nO = " + C +
                       "\nB = " + D +
                       "\nA = " + E +
                       "\nD = " + F +
                       "\nI = " + G +
                       "\n! = " + H + "\n" +
                       a + b + c + d + e + f + g + h);
                       
  long sum, ave, rem, prod;
  sum = A + B + C + D + E + F + G;
  ave = (A+B+C+D+E+F+G)/7;
  prod = A + B + C + D + E + F + G + H;
  rem = prod%ave;
  
  
  System.out.println ("sum: " + sum +
                        "\nAverage: " + ave +
                        "\nRemainder: " + rem +
                        "\nProduct: " + prod );
       }
       }
 
                       