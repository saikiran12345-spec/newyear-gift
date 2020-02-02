import java.lang.*;
import java.util.*;
abstract class Sweets //abstarct class
{
    abstract public void sweet1(); //abstrct metod
   
    public void sweet2()    //normal method
    {
        System.out.println("Gulabjam");
    }
   
}
class Sai extends Sweets   //inheritance
{
    public void sweet1()   //abstrct metod defintion in another class
    {
        System.out.println("mysorpak");
    }
}
interface Chocolates     //interface
{
    public abstract void choc1();   //only abstract class is used in interface
    public abstract void choc2();
}
class Sai2 implements Chocolates    //interface implementation
{
    public void choc1()
    {
        System.out.println("candies");  //abstarct method defintion
    }
    public void choc2()
    {
        System.out.println("poppins");
    }
}
class  NewyearGift
{
    public static void main(String args[])
    {
        Sai obj=new Sai();   //creating objects to classes
        obj.sweet1();
        obj.sweet2();
        Sai2 obj2=new Sai2();
        obj2.choc1();
        obj2.choc2();
    }
}