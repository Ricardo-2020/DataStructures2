import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAdding {
    
    private ArrayList<Integer> arrayNumbers = new ArrayList<Integer>();
    private int sum;

    public void getNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Array Length: ");
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            arrayNumbers.add(number);
        }
        input.close();
    }

    public void arraySum() {
        sum = 0;
        for (Integer userNum : arrayNumbers) {
            sum = sum + userNum;
        }
        System.out.println("Sum: " + sum);
    }
}
