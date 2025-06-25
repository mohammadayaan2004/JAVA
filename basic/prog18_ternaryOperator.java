//condition ? trueStatement : falseStatement
public class prog18_ternaryOperator {
    public static void main(String[] args) {
        int a=100;
        int b=180;
        String result;
        result=a>b?"a is greater than b":"a is less than b";
        String result2;
        result2=(a==b)?"a is equal to b":"a is not equal to b";
        System.out.println(result);
        System.out.println(result2);
    }    
}
