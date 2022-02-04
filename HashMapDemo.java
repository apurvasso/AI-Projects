import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
//        HashMap<String, Integer> happy = new HashMap<String, Integer>();
//        happy.put("a",10);
//        happy.put("b",3);
//        happy.put("c",88);
//        System.out.println(happy);
//        System.out.println(happy.get("b"));
        //{a=10, b=3, c=88}
        //3



        HashMap<String,String> fun = new HashMap<String, String>();
        fun.put("jfhsakjfh","fundnkdn");
        fun.put("jfheakjfh","fundukdn");
        fun.put("dfjkd","dkfjh");
        fun.remove("dfjkd");
        System.out.println(fun);
        System.out.println(fun.containsValue("fundnkdn"));
        System.out.println(fun.size());
        System.out.println(fun.replace("jfhsakjfh","fundnkcn"));
        System.out.println(fun.values());
        System.out.println(fun.keySet());

    }
}
