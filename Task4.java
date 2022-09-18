public class Task4 {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 1;
        int range = 11;
        while (firstNumber < range) {
            while (secondNumber < range) {
                System.out.println(firstNumber * secondNumber);
                secondNumber++;
            }
            System.out.println();
            firstNumber++;
            secondNumber = 1;
        }
    }
}
