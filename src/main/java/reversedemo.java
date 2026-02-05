public class reversedemo {
    public static void main(String[] args){
        String p = "pradeep";
        String reversed = "";
        for (int i = p.length()-1; i>=0; i--){
            reversed = reversed+ p.charAt(i);
        }
            System.out.println(reversed);

//        StringBuilder sb = new StringBuilder(p);
//        System.out.println(sb.reverse());

    }
}
