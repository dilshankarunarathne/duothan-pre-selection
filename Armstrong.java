public class Armstrong {
    public static void main(String[] args) {
        for (int i = 0; i <= 100000; i++) {
            String numberString = String.valueOf(i);
            int length = numberString.length();
            int sum = 0;

            for (char digitChar : numberString.toCharArray()) {
                int digit = Character.getNumericValue(digitChar);
                sum += Math.pow(digit, length);
            }

            if (sum == i) {
                System.out.println(i + " is an Armstrong number");
            }
        }
    }
}
