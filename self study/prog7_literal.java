public class prog7_literal 
{
    public static void main(String[] args) 
    {
        int a=123456789;//Decimal Integer literal
        int b=01234567;//Octal Integer Literal
        int c=0x1234af;//Hexadecimal Integer Literal
        int d=0X1234AF;//Hexadecimal Integer Literal
        int e=0b010101;//Binary Integer Literal
        int f=0B011010;//Binary Integer Literal
        
        float g=1.234f;//float literal
        double h=12.34;//double literal

        boolean i1=true;//boolean literal
        boolean i2=false;//boolean literal

        char ch1='A';//character literal
        char ch2=' ';//character literal

        String s="I am a world ka best loser";

        // Print values of all literals
        System.out.println("Integer literals:");
        System.out.println("Decimal: " + a);
        System.out.println("Octal: " + b);
        System.out.println("Hexadecimal (lowercase): " + c);
        System.out.println("Hexadecimal (uppercase): " + d);
        System.out.println("Binary 1: " + e);
        System.out.println("Binary 2: " + f);

        System.out.println("\nFloating-point literals:");
        System.out.println("Float: " + g);
        System.out.println("Double: " + h);

        System.out.println("\nBoolean literals:");
        System.out.println("True: " + i1);
        System.out.println("False: " + i2);

        System.out.println("\nCharacter literals:");
        System.out.println("Char 1: " + ch1);
        System.out.println("Char 2 (space): '" + ch2 + "'");

        System.out.println("\nString literal:");
        System.out.println(s);

    }    
}
