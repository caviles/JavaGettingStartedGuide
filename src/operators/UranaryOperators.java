package operators;

public class UranaryOperators {
    public static void tryOutPlusPlusAndMinusMinus() {
        int i = 0;
        i++;
        System.out.println("=" + i--);
        System.out.println("=" + i);

        i = 0;
        ++i;
        System.out.println("=" + ++i);
        System.out.println("=" + --i);
    }
}
