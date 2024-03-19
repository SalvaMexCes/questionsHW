
package javaHW;

public class main {

    public static void main(String[] args) {
        //Q1
        String[] arrayOfNames = {"Jane", "Jack", "Jill", "Cesar"};
        int lastIndexPosition = getLastIndex(arrayOfNames);
        System.out.println("Q1: " + lastIndexPosition);

        //Q2
        String[] arrayOfNamesTwo = {"John", "Alex", "Mike", "Cesar"};
        int secondToLastIndex = getSecondToLastIndex(arrayOfNamesTwo);
        System.out.println("Q2: " + secondToLastIndex);

        //Q3
        String[] arrayOfNamesThree = {"John", "Alex", "Mike", "Cesar"};
        String firstElement = getFirstElement(arrayOfNamesThree);
        System.out.println("Q3: " + firstElement);

        //Q4
        String[] questionFour = {"John", "Alex", "Mike", "Cesar"};
        String lastElement = getLastElement(questionFour);
        System.out.println(lastElement);

        //Q5
        String[]questionFive = {"John", "Alex", "Mike", "Cesar"};
        String secondToLastElement = getSecondToLastElement(questionFive);
        System.out.println("Q5: " + secondToLastElement);

        //Q6
        int[] questionSix = {21, 44, 67, 88, 99};
        int sum = getSum(questionSix);
        System.out.println("Q6: " + sum);

        //Q7
        double[] questionSeven = {21, 44, 67, 88, 99};
        double average = getAverage(questionSeven);
        System.out.println("Q7: " + average);

        //Q8
        int[] questionEight = {21, 44, 67, 88, 99};
        String result = extractAllOddNumbers(questionEight);
        System.out.println("Q8: " + result);

        //Q9
        int[] questionNine = {21, 44, 67, 88, 99};
        String evenNumbersString = extractAllEvenNumbers(questionNine);
        System.out.println("Q9: " + evenNumbersString);

        //Q10
        String[] questionTen = {"John", "Alex", "Mike", "Cesar"};
        String nameToCheck = "Walter ";
        String nameWithProperCapitalization = properCapitals(nameToCheck);
        boolean isPresent = contains(questionTen, nameWithProperCapitalization);
        if (isPresent) {
            System.out.println("Q10: " + nameWithProperCapitalization + "is in the array.");
        } else {
            System.out.println("Q10: " + nameWithProperCapitalization + "is not in the array.");
        }

    } //Main Method

//Note: Create all your static methods outside on the main() method!
    // Loops, Control Flow, Arrays and Methods

    //Question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    //Question 3
    public static String getFirstElement(String[] arrayOfNamesThree) {
        if (arrayOfNamesThree != null && arrayOfNamesThree.length > 0) {
            return arrayOfNamesThree[0];
        } else {
            return "Array is empty.";
        }
    }

    //Question 4
    public static String getLastElement(String[] questionFour) {
        if (questionFour != null && questionFour.length > 0) {
            return questionFour[questionFour.length - 1];
        } else {
            return "Array is empty or null";
        }
    }

    //    Question 5
    public static String getSecondToLastElement(String[] questionFive) {
        if (questionFive != null && questionFive.length > 0) {
            return questionFive[questionFive.length - 2];

        } else {
            return "Array is empty.";
        }
    }

    //Q6
    public static int getSum(int[] questionSix) {
        int sum = 0;
        for (int num : questionSix) {
            sum += num;
        }
        return sum;
    }

    //Q7
    public static double getAverage(double[] questionSeven) {
        double sum = 0;
        for (double num : questionSeven) {
            sum += num;
        }
        return sum / questionSeven.length;
    }

    //Q8
    public static String extractAllOddNumbers(int[] questionEight) {
        StringBuilder oddNumbers = new StringBuilder();
        for (int number : questionEight) {
            if (number % 2 != 0) {
                oddNumbers.append(number).append(", ");
            }
        }
        if (oddNumbers.length() > 0) {
            oddNumbers.delete(oddNumbers.length() - 2, oddNumbers.length());
        }
        return oddNumbers.toString();
    }

    //    Question 9
    public static String extractAllEvenNumbers(int[] questionNine) {
        StringBuilder evenNumbersBuilder = new StringBuilder();
        boolean foundEven = false;
        for (int number : questionNine) {
            if (number % 2 == 0) {
                if (foundEven) {
                    evenNumbersBuilder.append(", ");
                }
                evenNumbersBuilder.append(number);
                foundEven = true;
            }
        }
        return evenNumbersBuilder.toString();
    }

    //    Question 10
    public static boolean contains(String[] questionTen, String nameToCheck) {
        for (String name : questionTen) {
            if (name.equalsIgnoreCase(nameToCheck)) {
                return true;
            }
        }
        return false;
    }

    public static String properCapitals(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
}