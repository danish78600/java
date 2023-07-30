class danish{
    private String name;
    public String getName()  //with the use of getters and setters we can also put logic in this function.
    {
        return name;
    }
    public void setname(String n)
    {
        name=n;
    }

}

public class get{
    public static void main(String[] args) {
        danish d=new danish();
        d.setname("danish");
        System.out.println(d.getName());
    }
}

