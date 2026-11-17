package Operator;
public class UnaryOperator {
    public static void main(String[] args) {
         // Example 1
         int number = 5;
         System.out.println(++number + number++); // 12

        // Example 2
         int firstNumber = 10;
         int secondNumber = firstNumber++ + ++firstNumber + firstNumber;
         System.out.println(secondNumber); // 34

         //Example 3
         int value = 3;
         value = value++ + ++value;
         System.out.println(value); // 8

        // Example 4
         int count = 1;
         int result = count++ + count++ + count;
         System.out.println(result); // 6

        // Example 5
         int firstValue = 2, secondValue = 3;
         int finalValue = ++firstValue * secondValue-- + firstValue--;
         System.out.println(finalValue); // 12

        // Example 6
         int initialValue = 5;
         int total = initialValue++ + ++initialValue
                   + initialValue++ + --initialValue;
         System.out.println("initialValue = " + initialValue
                 + ", total = " + total); // 7, 26

        // Example 7
         int currentValue = 1;
         currentValue = currentValue++ - --currentValue
                      + ++currentValue - currentValue--;
         System.out.println(currentValue); // 0

        // Example 8
         int firstCount = 4, secondCount = 5;
         int finalCount = ++firstCount + secondCount--
                        - firstCount++ + --secondCount;
         System.out.println(finalCount); // 8

        // Example 9
         int numberValue = 6;
         System.out.println(numberValue++ + numberValue++ + ++numberValue); // 22

        // Example 10
        int startingNumber = 10;
        startingNumber = startingNumber++ + ++startingNumber
                       - --startingNumber + startingNumber--;

        System.out.println(startingNumber); // 22
    }
}