package practice100;

import java.util.*;

public class nonrepeatedvalue {

    public  static  Character fnc(String str){
        Set<Character> repeating=new HashSet<>();
        List<Character> nonrepeating=new ArrayList<>();
        for (int i=0;i<str.length();i++){
            char letter=str.charAt(i);
            if(repeating.contains(letter))
                continue;
            if (nonrepeating.contains(letter)) {

                nonrepeating.remove((Character) letter);
                repeating.add(letter);
            }
            else {
                nonrepeating.add(letter);
            }

        }
        return  nonrepeating.get(0);
    }
    public static void main(String[] args) {
//        String inpytString="teether";
//
//        for (char i:inpytString.toCharArray()){
//            if (inpytString.indexOf(i)==inpytString.lastIndexOf(i)){
//                System.out.println("first non rrpeating string is"+i);
//            }
//
//        }
//        System.out.println("enter the string");
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        char ch=Firstnonrepeatedchar(s);
//        System.out.println("the first non repeated char is="+ch);
//
//    }
//
//    private static char Firstnonrepeatedchar(String s) {
//        HashMap<Character,Integer> characterIntegerHashMap=new LinkedHashMap<Character,Integer>();
//        int length;
//        Character ch;
//        length=s.length();
//        for (int i=0;i<length;i++){
//            ch=s.charAt(i);
//            if(characterIntegerHashMap.containsKey(ch)){
//                characterIntegerHashMap.put(ch,characterIntegerHashMap.get(ch)+1);
//            }
//            else {
//                characterIntegerHashMap.put(ch,1);
//            }
//        }
//        for (Map.Entry<Character,Integer> entry:characterIntegerHashMap.entrySet()){
//            if (entry.getValue()==1){
//                return  entry.getKey();
//            }
//
//
//        }
//
//
//        return 0;
//    }
        System.out.println("enter the string ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=fnc(s);
        System.out.println("the nonrepeated char is"+ch);


    }
}
