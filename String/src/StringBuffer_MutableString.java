public class StringBuffer_MutableString {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Aarya");
//        System.out.println(sb.capacity());

//        String str = sb.toString();
//        System.out.println(sb.deleteCharAt(1));
//        sb.insert(0, "Java ");
        sb.append(" Pandit");
        sb.insert(0, "Java ");
        sb.setLength(30);
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        System.out.println(sb);

//       StringBuffer: to lessen the relocation due to
//                     lack of memory, StringBuffer
//                     provides extra 16bytes
    }
}