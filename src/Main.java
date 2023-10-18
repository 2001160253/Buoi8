import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = importArray(n);

        do{
            menu();
            System.out.println("Select function: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                {
                    System.out.println("1. Calculate the sum of positive numbers");
                    exportArray(array);
                    int sumPositive = calculatePositiveSum(array);
                    System.out.println("Sum = "+sumPositive);
                    break;
                }
                case 2: {
                    System.out.println("2. Calculate the sum of odd numbers");
                    exportArray(array);
                    int sumOdd = calculateOddSum(array);
                    System.out.println("Sum = "+sumOdd);
                    break;
                }
                case 3:{
                    System.out.println("3. Count the number of positive numbers");
                    exportArray(array);
                    int count = countPositiveNum(array);
                    System.out.println("Count = " +count);
                    break;
                }
                case 4:{
                    System.out.println("4. Find the smallest number in the array");
                    exportArray(array);
                    int minNumber = findSmallestNum(array);
                    System.out.println("Min number: " +minNumber);
                    break;
                }
                case 5: {
                    System.out.println("5. Find the smallest positive number in the array");
                    exportArray(array);
                    int minPositiveNum = findSmallestPositiveNum(array);
                    System.out.println("Min positive number : "+minPositiveNum);
                    break;
                }
                case 6: {
                    System.out.println("6. Find the last even number in the array");
                    exportArray(array);
                    int num = findLastEvenNum(array);
                    if(num == -1){
                        System.out.println("Not found!");
                    }else {
                        System.out.println("The last even number is: "+num);
                    }
                    break;
                }
                case 7: {
                    System.out.println("7. Find the first even number in the array");
                    exportArray(array);
                    int num = findFirstEvenNum(array);
                    if(num == -1){
                        System.out.println("Not found!");
                    }else {
                        System.out.println("The first even number is: "+num);
                    }
                    break;
                }
                case 8:{
                    System.out.println("8. Find the first prime number in the array");
                    exportArray(array);
                    int num = findFirstPrime(array);
                    if(num == -1){
                        System.out.println("Not found!");
                    }else {
                        System.out.println("The first prime number is: "+num);
                    }
                    break;
                }
                case 9:{
                    System.out.println("9. Find the last positive number in the array");
                    exportArray(array);
                    int num = findLastPositive(array);
                    if(num == -1){
                        System.out.println("Not found!");
                    }else {
                        System.out.println("The last positive number is: "+num);
                    }
                    break;
                }
                case 10: {
                    System.out.println("10. Find the smallest even number");
                    exportArray(array);
                    int num = findSmallestEvenNum(array);
                    System.out.println("The smallest even number is: "+num);
                    break;
                }
                default:{
                    System.out.println("Invalid selection, select again!");
                }

            }

        }while (choice!=0);

    }

    public  static  void menu(){
        System.out.println("\n---------");
        System.out.println("1. Calculate the sum of positive numbers");
        System.out.println("2. Calculate the sum of odd numbers");
        System.out.println("3. Count the number of positive numbers");
        System.out.println("4. Find the smallest number in the array");
        System.out.println("5. Find the smallest positive number in the array");
        System.out.println("6. Find the last even number in the array");
        System.out.println("7. Find the first even number in the array");
        System.out.println("8. Find the first prime number in the array");
        System.out.println("9. Find the last positive number in the array");
        System.out.println("10. Find the smallest even number");
        System.out.println("0. End");
        System.out.println("---------");
    }

    public static int[] importArray(int n){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("array["+(i+1)+"] = "   );
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void exportArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static int calculatePositiveSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public  static  int calculateOddSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]%2 != 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public  static  int countPositiveNum(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                count++;
            }
        }
        return  count;
    }

    public  static  int findSmallestNum(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findSmallestPositiveNum(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i] && arr[i] > 0){
                min = arr[i];
            }
        }
        return min;
    }

    public  static  int findLastEvenNum(int[] arr){
        int num = 0;
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i]%2 == 0){
                return num = arr[i];
            }
        }
        return -1;
    }
    public  static  int findFirstEvenNum(int[] arr){
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                return num = arr[i];
            }
        }
        return -1;
    }

    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return  false;
            }
        }
        return true;
    }
    public  static int findFirstPrime(int[] arr){
        for (int i = 0; i < arr.length; i++){
           if(isPrime(arr[i])){
               return arr[i];
           }
        }
        return -1;
    }

    public static int findLastPositive(int[] arr){
        int num = -1;
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] > 0){
               num = arr[i];
               break;
            }
        }
        return num;
    }

    public static int findSmallestEvenNum(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0 && min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}