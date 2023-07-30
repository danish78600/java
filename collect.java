import java.util.*;
public class collect {
    public static void main(String[] args) {
         ArrayDeque<Integer> l3=new ArrayDeque<>();
        LinkedList<Integer> l1=new LinkedList<>();
        //  LinkedList<Integer> l2=new LinkedList<>();
        

// l2.add(212);
// l2.add(312);
l3.add(21);
l3.addFirst(12);
System.out.println((l3));

        l1.add(21);
        l1.add(21);
        l1.add(0,211);
        // l1.addAll(0, l2);
        l1.set(2,100);
        l1.addLast(999);  //linked list method
        l1.addFirst(1);   //linked list method
        System.out.println(l1.contains(21));
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));  //in this .get(indexno) is used insted of li[i]
        }
    }
}
