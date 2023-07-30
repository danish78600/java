class constr {
    constr()
    {
System.out.println("u am 1st class");
    }
    constr(int a )
    {
System.out.println(a);
    }
}


class danish extends constr{
danish()
{
    // super(1);
    System.out.println("u am 2d class");
}
danish(int a)
{
super(a); //took a and call the super class constructor
System.out.println(a);

}
}


class kalua extends danish{
    kalua()
    {
        System.out.print("i am  kalua");
    }
    kalua(int a,int b)
    {
        super(a);
        System.out.println(a+b);
    }
}



public class constructor{
public static void main(String[] args) {
    kalua abc=new kalua(11,11);
    
}
}

