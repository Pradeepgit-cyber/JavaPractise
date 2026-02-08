public class StringDemo {
    public static void main(String[] args){
        String a = "Hello";
        String b = "Hello";
        System.out.println(a);
//        string classes
        String s = new String("Hello");
        String s1 = new String("Hello");
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a==s);
        System.out.println(s==s1);
        System.out.println(a.equalsIgnoreCase(s));

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);
        sb.insert(2, "she");
        System.out.println(sb);
        sb.replace(3, 5, "aa");
        System.out.println(sb);
        sb.deleteCharAt(12);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);


    }
}
