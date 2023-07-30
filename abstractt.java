abstract class a {
    public a()
    {
        System.out.print("hlo");
    }
abstract public void greet();

}
class b extends a {
    public void greet()
    {
        System.out.print("namste");
    }
}

abstract class c extends a{
    public void namaste()
    {
        System.out.println("da");
    }
}

public class abstractt {
    public static void main(String[] args) {
        
        // a d=new a(); //not allowed as it is abstract class.
        b e=new b();
        
    }
}
