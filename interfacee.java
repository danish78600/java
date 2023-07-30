//  interface bicycle {
//     int a=2;
//     public void speed();
//     public void brake();
// }

// interface cycle{
//     public void horn();
// }

// class stars implements bicycle,cycle{
// int speed=8;
// public void speed()
// {
//     System.out.println("sped is "+speed);

// }
// public void brake()
// {
//     System.out.println("brakes applied");
// }
// public void horn()
// {
//     System.out.println("horn blow krda");
// }
// }

// public class interfacee{
//     public static void main(String[] args) {
//         stars bc=new stars();
//     // stars.a=21;  //not allowed
//         System.out.println(bc.a);
//         bc.horn();
//     }
// }

//real world

interface camera{
    void takesnap();
    void recordvideo();
    default void videoshoot(){
        System.out.println("doing vdieoshoo");
    }
}

interface wifi{
    void connect(String network);

}

class cellphone{
    public void call()
    {
        System.out.println("calling");
    }
    public void pick()
    {
        System.out.println("picking a call");
    }
}

class smartphone extends cellphone implements wifi,camera{
    
    public void takesnap()
    {
        System.out.println("tooking snap");
    }
    public void recordvideo()
    {
        System.out.println("recording video");
    }
    public void connect(String network)
    {
        System.out.println(network);
    }

}
public class interfacee{
    public static void main(String[] args) {
        smartphone n=new smartphone();
        n.connect("netplus");
        n.videoshoot();
    }

}