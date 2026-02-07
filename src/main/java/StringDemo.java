public class StringDemo {
    public static void main(String[] args){
//        string literal
        String a = "Hello";
        String b = "Hello";
//        a.concat("world");
        System.out.println(a);
//        string classes
        String s = new String("hello");
        String s1 = new String("Hello");
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a==s);
        System.out.println(s==s1);
        System.out.println(a.equalsIgnoreCase(s));

//        stringbuffer and stringBuilder are mutable
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);
        sb.insert(2, "she");
        System.out.println(sb);
//        HeshelloWorld
        sb.replace(3, 5, "aa");
        System.out.println(sb);
//        HesaalloWorld
        sb.deleteCharAt(12);
        System.out.println(sb);
//        HesaalloWorl
        sb.reverse();
        System.out.println(sb);
//      lroWollaaseH


    }

}
