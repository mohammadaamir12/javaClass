import java.util.*;

public class Roman_Int {
    public int romanToInt(String s) {
        Map<Character,Integer> m = new HashMap();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        
        int x = m.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i>=0;i--){
            if(m.get(s.charAt(i))<m.get(s.charAt(i+1))){
                x-=m.get(s.charAt(i));
            }
            else
                x+=m.get(s.charAt(i));
        }
        return x;
    }
}
