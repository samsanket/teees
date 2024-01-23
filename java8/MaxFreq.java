package java8;

import java.util.HashMap;
import java.util.Map;

public class MaxFreq {
    public static void main(String[] args) {
        findmaxfreq("i am sanket deshpande i am from pune ");
    }

    private static void findmaxfreq(String s) {
        String words[] =s.split(" ");
        HashMap<String,Integer> workdwithfreq= new HashMap<>();

        for (String w:words){
            workdwithfreq.put(w,workdwithfreq.getOrDefault(w,0)+1);
        }
       for (Map.Entry<String,Integer> mapEntry:workdwithfreq.entrySet()){
           System.out.println("key "+mapEntry.getKey() +" freq "+mapEntry.getValue());

       }
    }
}
