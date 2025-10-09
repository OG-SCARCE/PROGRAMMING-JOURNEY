import java.util.*;
public class programme_13{
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();//normal unorder
        hs.add(1);
        hs.add(2);
        hs.add(2);
        System.out.println(hs);//duplicate,index wise value not suppeort
        //iterator
        Iterator<Integer> i=hs.iterator();
        while(i.hasNext()){//jab tak value hai hasNext return karta rahege
            System.out.println(i.next());//jab tak value hai next print karta rahega
        }
    }
}