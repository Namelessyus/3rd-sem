package yomari;

public class SimpleMath {
    public int f=10;
    public int g=2;

    public static void main (String args[]){
        int a=10;
        int b=20;
        int c;
        c=a+b;
        System.out.println(c);
        
        int d=30; 
        int e=40;
        System.out.println(d+e);
        
        SimpleMath wiwiwi = new SimpleMath();
        System.out.println("Division "+ wiwiwi.f/ wiwiwi.g);
        
        System.out.println(a + -wiwiwi.g);

    }
    
}
