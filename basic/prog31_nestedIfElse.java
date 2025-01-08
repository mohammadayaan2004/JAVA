public class prog31_nestedIfElse {
    public static void main(String arg[]) {
        int a = 10, b = 20, c = 30;

        if (a > b) {
            if (a > c) {
                System.out.println("a is greatest.");
            } else {
                System.out.println("c is greatest.");
            }
        } else {
            if (b > c) {
                System.out.println("b is greatest.");
            } else {
                System.out.println("c is greatest.");
            }
        }
    }
}
