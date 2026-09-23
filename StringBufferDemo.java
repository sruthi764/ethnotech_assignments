public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Java");

        System.out.println("Original:"+sb);
        
        sb.append("Programming");
        
        System.out.println("After append:"+sb);
        
        sb.insert(4, "is");
        
        System.out.println("After insert:"+sb);
        
        sb.replace(0, 4, "python");
        
        System.out.println("After replace:"+sb);
    }
}
