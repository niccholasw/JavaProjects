//Learning how to use recursion

//Recursion is a method that calls itself


public class RecursionPractise {
    public static void main(String[] args) {
        sayHi(3);
    }

    private static void sayHi(int count){
        System.out.println("Hi");
        if (count <=1) //Exit condition, if the count is less than or equal to 1, then 
            return; //Base case returns avoiding the infinite loop
        sayHi(count - 1); //Uses recursion and -1 from the count every single time 

    }
}
