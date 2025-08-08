public class dz6 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 3, 4, 7, 4, 4, 3};
        for (int a : numbers) {
            System.out.println(a);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
            System.out.println(numbers[i]);
        }
    }
}
