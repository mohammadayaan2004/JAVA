public class prog51_labelledContinueStatement {
    public static void main(String args[]) {
        outer:
        for (int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 3; i++) {
                if (j == 2) {
                    continue outer;
                }
                System.out.println("j= " + j + ", i = " + i);
            }
        }
    }
}
