import java.util.*;
public class programme_13{
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(2);
        System.out.println(hs);
        Iterator<Integer> i=hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}