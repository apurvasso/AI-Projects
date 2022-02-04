//reverse string using for loop

//public class Linen {
//    public static void main(String args[]){
//        String str = "hfhhdfijfkj";
//        String rev = "";
//        for(int i =str.length()-1;i>0;i--){
//            rev = rev + str.charAt(i);
//        }
//        System.out.println(rev);
//    }
//}
//using recursion
//public class Linen{
//    public static void main(String args[]){
//        Linen rsr = new Linen();
//        String str = "skfjhsjhf";
//        String rev = rsr.recursiveReverse(str);
//        System.out.println(rev);
//    }
//    public String recursiveReverse(String originalStr){
//        if(originalStr.length() == 1){
//            return originalStr;
//        }
//        else{
//            return originalStr.charAt(originalStr.length() - 1) + recursiveReverse(originalStr.substring(0,originalStr.length() - 1));
//        }
//    }
//}
//using reverse() method of StringBuffer class
//public class Linen{
//    public static void main(String args[]){
//        String str = "skfjhsjhf";
//        StringBuffer sb = new StringBuffer(str);
//        System.out.println(sb.reverse());
//    }
//
//}
public class Linen{
    public static void main(String args[]){
        String word = "Aogle";
        String anagram= "Angel";
        System.out.println(isAnagram(word,anagram));
    }
    public static boolean isAnagram(String word,String anagram){
        if(word.length()!=anagram.length())
            return  false;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            int index = anagram.indexOf(c);
            if(index != -1){
                anagram = anagram.substring(0,index)+anagram.substring(index + 1);
            }
            else
                return false;
        }
        return anagram.isEmpty();
    }
}