import java.util.Arrays;
public class prog63_SplitByLimit {
    public static void main(String[] args) {
        String name="one-two-three-four";      
        String arrname[]=name.split("-",3);
        System.out.println(Arrays.toString(arrname));
    }
}
