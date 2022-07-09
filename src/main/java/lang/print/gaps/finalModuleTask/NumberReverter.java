package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
    int first = number/100;
    number -= first*100;
    int mid = number/10;
    number -= mid*10;
    System.out.println(number + "" + mid + "" + first);
    }
}
