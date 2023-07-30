class man{
public void meth(){
    System.out.println("i m meth2 of man");
}

}
class woman extends man{
public void meth()
{
    System.out.println("i m meth2 of woman");
}
}

public class over{
    public static void main(String[] args) {
        man m=new man();
        m.meth();

        woman w=new woman();
        w.meth();
    }
}