/* Sanjeev Makesh
Period 2, AP Computer Science A
September 2, 2020*/

public class Numerical{
  public static void main(String[] args){

    //Challenge 1
    double d1 = 37.9;
    double d2 = 1004.128;
    int i1 = 12;
    int i2 = 18;

    System.out.println(57.2 *( i1 / i2) + 1);
    System.out.println(57.2 *((double)i1 / i2) + 1);
    System.out.println(15 - i1 * (d1 * 3)+ 4);
    System.out.println(15 - i1*((int)d1 * 3)+ 4);
    System.out.println(15 - i1*(int)(d1 * 3)+ 4);

    //Challenge 2
    int n1 = 6042;
    int reverse = 0;

    int first = n1 % 10;
    n1 /= 10;
    reverse += first;
    int second = n1 % 10;
    n1 /= 10;
    reverse = reverse * 10 + second;
    int third = n1 % 10;
    n1 /= 10;
    reverse = reverse * 10 + third;
    int fourth = n1 % 10;
    reverse = reverse * 10 + fourth;
    System.out.println("\n Challenge 2: \n " + reverse);
 }
}