package stringdemo;
public class StringDemo {
    public static void main(String[] args) {
        String str="tom";
        System.out.println(str);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        
        System.out.println(str.indexOf('t'));
        System.out.println(str.indexOf('k'));
        System.out.println(str.contains("t"));
        System.out.println(str.contains("p"));        
        System.out.println(str.equals("tom")); 
        System.out.println(str.equals("Tom"));     
        System.out.println(str.equalsIgnoreCase("Tom"));
        
        byte b[]=str.getBytes();
        System.out.println((char)b[0]);
        System.out.println((char)b[1]);
        System.out.println((char)b[2]);
        
        System.out.println("HellO".toLowerCase());
        System.out.println(str.toLowerCase());      
        System.out.println("HellO".toUpperCase());
        System.out.println(str.toUpperCase());
        
        System.out.println(str.isEmpty());        
        System.out.println("".isEmpty());  
        System.out.println("".length());  
        System.out.println(str.length());    
        System.out.println("tom".toCharArray()); 
        
        char ch[]=str.toCharArray();
        System.out.println(ch[0]);  
        System.out.println(ch[0]);  
        System.out.println(ch[0]);     
        System.out.println(ch[0]);  
        System.out.println(ch[0]);
        
        System.out.println(str.compareTo(str));  
        System.out.println(str.compareTo(str)); 
        
        System.out.println("a".compareTo("b"));  
        System.out.println("a".compareTo("d"));  
        System.out.println("a".compareTo("Z"));  
        System.out.println("b".compareTo("a"));  
        System.out.println("c".compareTo("a")); 
              //ASCII value of each character
        for (int i = 0; i < 128; i++) {
        System.out.print("i = "+i+" : "+(char)i+", ");
        if(i==10 || i==20 || i==30 || i==40  || i==50 || i==60 || i==70 || i==80 || i==90 ||i==100 || i==110)
       {
        System.out.println("");
        }
        }
    }
}
