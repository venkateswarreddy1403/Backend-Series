package day04;

public class arrays {
    static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num: numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        Exercise 1 — Print Array
        int[] numbers = {10,20,30,40,50};
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

//        Exercise 2 — Sum
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);

//        Exercise 3 — Find Maximum
        int maxValue = numbers[0];
        for (int num : numbers) {
            if(num > maxValue) {
                maxValue = num;
            }
        }
        System.out.println(maxValue);

        //    Exercise 4 — Count Even Numbers
        int count = 0;
        int[] numbers2 = {10, 15, 22, 31, 40, 55, 60};
        for(int num : numbers2) {
            if(num % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

//        Exercise 5 — Method + Array
        int result = findMax(numbers);
        System.out.println(result);

     }
}
