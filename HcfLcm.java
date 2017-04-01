import java.util.Scanner;
public class HcfLcm {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b,l=0;
    System.out.print("Enter two numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    l=a*b;
    while(a!=b)
    {
        if(a>b)
        a=a-b;
        else
        b=b-a;
    }
    System.out.println("HCF of the numbers is: "+a);
    l=l/a;
    System.out.print("LCM of the numbers is: "+l);
    }  }
