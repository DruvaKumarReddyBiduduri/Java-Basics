public class MutableStrings {
    public static void stringBuffer(){
        StringBuffer sb=new StringBuffer("Hello");
        sb.append(" ");
        sb.append("World!");


        sb.reverse();
        System.out.println(sb);

        // removes char at given index
        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.delete(4,7);
        System.out.println(sb);


        System.out.println("Capacity : "+sb.capacity());
    }
}
