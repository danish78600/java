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
public class poly{
    public static void main(String[] args) {
        wifi n=new smartphone();  //this is  a smartphone but use it as a wifi othrwise you will get an error.
        //giving a reference of an interface means we cannot access methods outside the interface. 
        n.connect("netplus");
        // n.videoshoot();
    }

}