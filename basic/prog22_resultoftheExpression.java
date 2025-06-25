public class prog22_resultoftheExpression {
    public static void main(String[] args) {
        int a = 7 / 4 * 9 / 2;
        /*
         * 7/4=1.75 but taken as 1
         * 1*9=9
         * 9/2=4.5 but taken as 4
         * beacause of int datatype
         */
        float b = 7 / 4 * 9 / 2;
        /*
         * 7/4=1.75 but taken as 1
         * 1*9=9
         * 9/2=4.5 but taken as 4
         * beacause of int value in RHS
         */
        float c = 7f / 4 * 9 / 2;
        /*
         * 7/4=1.75 
         * 1.75*9=15.75
         * 15.75/2= but taken as 7.875
         */
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
