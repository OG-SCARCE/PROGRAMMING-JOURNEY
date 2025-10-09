import java.util.*;
public class programme_12{
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"skt");
        hm.put(2,"aks");
        hm.put(2,"abs");//overwrite aks to abs
        System.out.println(hm);
    }
}