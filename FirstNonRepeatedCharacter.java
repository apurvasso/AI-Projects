//import java.util.*;
//
//public class FirstNonRepeatedCharacter {
//    public static Character firstNonRepeatedCharacter(String s){
//        Set<Character> repeatingChar = new HashSet<>();
//        List<Character> nonRepeatingChars = new ArrayList<>();
//        for(int i=0;i<s.length();i++){
//            char letter = s.charAt(i);
//            if(repeatingChar.contains(letter)){
//                continue;
//            }
//            if(nonRepeatingChars.contains(letter)){
//                nonRepeatingChars.remove((Character)letter);
//                repeatingChar.add(letter);
//
//            }
//            else {
//                nonRepeatingChars.add(letter);
//            }
//        }
//        return nonRepeatingChars.get(0);
//    }
//    public static void main(String[] args)
//    {
//
//        System.out.println(" Please enter the input string :" );
//        Scanner in = new Scanner (System.in);
//        String s = in.nextLine();
//        char ch = firstNonRepeatedCharacter(s);
//        System.out.println("The first non repeated character is :  " + ch);
//    }
//}
