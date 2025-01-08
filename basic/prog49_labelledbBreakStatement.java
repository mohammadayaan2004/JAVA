public class prog49_labelledbBreakStatement {
    public static void main(String args[]) {
        outer:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; i++) {
                System.out.print(i + " ");
                if (i == 5) {
                    break outer;
                }
            }
        }
    }
}
