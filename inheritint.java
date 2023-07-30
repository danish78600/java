interface pro{
    void meth1();
    void meth2();

}
interface noob extends pro{
    void meth3();
    void meth4();
}


class danish implements noob{
    public void meth3()
    {
System.out.println("a");
    }
    public void meth4()
    {
        System.out.println("b");
    }
    
    public void meth1()
    {
        System.out.println("meth1");
    }
    public void meth2()
    {
        System.out.println("meth2");
    }
}