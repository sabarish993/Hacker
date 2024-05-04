package practice100;

import java.util.HashSet;

public class UniqueCharecter {
    public static void main(String[] args) {
        boolean result=false;
        String input="Alvinn @sowmiyas";
        System.out.println(input);
        HashSet<Character> hs=new HashSet<>();
        for (int i=0;i<input.length();i++){
            result= hs.add(input.charAt(i));
            if (result==false){
                break;
            }
        }
        System.out.println(""+result);
    }
}
