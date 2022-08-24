package innerclassdemo;
public class InnerDemo
{
    static class Outer{
        int a=10;
        int b=22;
        int c=a+b;
        public void show(){
            System.out.println(c);
        }
        class Inner{
            public void display(){
                System.out.println("in display");
            }
        class Middle{
           public void show(){
               System.out.println(a);
           }
        }

        }
    }
    public static void main(String args[])
    {

        Outer obj = new Outer();
        obj.show();
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
        Outer.Inner.Middle obj2 = obj1.new Middle();
        obj2.show();
    }
}
