class danish {
    public void pro()
    {
        System.out.println("i am danish pro");
    }
}

class kartik extends danish{
    public void pro()
    {
        System.out.println("i am kartik pro");
    }
    // public void d()
    // {
    //     System.out.print("knwe");
    // }
}

public class dynamic{
    public static void main(String[] args) {
        danish k=new kartik(); //reference of super class is equal to base class
        k.pro();
    }
}