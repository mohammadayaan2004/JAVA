public class prog17_bitwiseOperator {
    public static void main(String[] args) {
        int a=10; //00001010 
        int b=16; //00010000
        int c=5;  //00000101
        int d=5;
        int e=5;
        System.out.println("Bitwise opertors are as follows :- ");
        System.out.println("Bitwise AND :- "+(a&b)); //00000
        System.out.println("Bitwise OR :- "+(a|b));  //11010
        System.out.println("Bitwise XOR :- "+(a^b)); //11010
        System.out.println("Bitwise Tilde :- "+(~c));
        System.out.println("Left Shift Operator :- "+(d<<1));
        System.out.println("Right Shift Operator :- "+(e>>1));
    }
}
