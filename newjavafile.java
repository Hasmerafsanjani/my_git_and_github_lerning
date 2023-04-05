
import java.util.*;
import java.io.*;

class lerning {
    public static void frequencyMap(String s){
       // char [] chararr = s.toCharArray();
        Map<Character , Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
              map.put(s.charAt(i),1);
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String str = "hasmerafsanjnai";

        frequencyMap(str);

       
    }
}

