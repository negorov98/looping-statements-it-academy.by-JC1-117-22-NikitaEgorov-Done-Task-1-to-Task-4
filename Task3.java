public class Task3 {
    public static void main(String[] args) {
        int firstNumber = 0;
        System.out.println(firstNumber);
        int secondNumber = 1;
        System.out.println(secondNumber);
        int result = firstNumber + secondNumber;
        System.out.println(result);
        int range = 22;

        while (result < range) {
            firstNumber = secondNumber;
            secondNumber = result;
            result = firstNumber + secondNumber;
            System.out.println(result);
        }
    }
}


