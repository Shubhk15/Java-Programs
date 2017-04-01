/* Cloning is way of copying the objects and it's attributes and having the same properties in a new object.
   Changes made to the source object will not change the properties of the new object created. */

   import java.util.Scanner;
class abc implements Cloneable
{
    String name;
    int marks;
    abc(String s,int a)
    {
        name=s;
        marks=a;
    }
    public Object clone()     // Overriding the clone method
    {
        Object temp=null;
        try
        {
           temp=super.clone();
        }
       catch(CloneNotSupportedException e)
    {
        System.out.println("Cloning not supported");
    }
        return temp;
        }
    void display()
    {
        System.out.println("Name is: "+name);
        System.out.println("Marks are: "+marks);
    }
}
class CLNO 
{   
     public static void main(String[] args) {
    abc s=new abc("User",90);
    abc s1=(abc)s.clone();       // Used to change the type as clone method doesn't return the object of same type.
    s.display();
    s1.display();
    }
}
