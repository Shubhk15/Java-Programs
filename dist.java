import java.util.Scanner;
import java.lang.Math;
class Point
{
    int x,y;
    double d;
    Point(int a,int b)
    {
        x=a;y=b;
    }
    void first(Point z)
    {
        int n,m;
        n=z.x-this.x;
        m=z.y-this.y;
        d=Math.sqrt((Math.pow(n,2))+(Math.pow(m,2)));
        System.out.print("distance between the points (" +z.x+ "," +z.y+") and ("+this.x+","+this.y+")"+"is:");     
    }
          public String toString()
    { 
         return Double.toString(d);
    }       }
public class dist {
    public static void main(String[] args) {
    int e,f,g,h;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter coordinates of the point p1 and p2");
    e=sc.nextInt();
    f=sc.nextInt();g=sc.nextInt();h=sc.nextInt();
    Point p=new Point(e,f);
    Point p1=new Point(g,h);
    p1.first(p);
    p1.toString();
    System.out.print(p1);
    } 
}
