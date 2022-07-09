package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        int digit = number/1000;
        number -= digit * 1000;
        sum += digit;
        digit = number/100;
        number -= digit * 100;
        sum += digit;
        digit = number/10;
        number -= digit * 10;
        sum += digit;
        sum += number;
        System.out.println(sum);
    }
}
