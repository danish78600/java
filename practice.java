abstract class Pen{
    abstract void write();
    abstract void refil();
}

class fountainpen extends Pen{
void write()
{
    System.out.println("hello ");
}
void refil()
{
    System.out.println("refil");
}

}