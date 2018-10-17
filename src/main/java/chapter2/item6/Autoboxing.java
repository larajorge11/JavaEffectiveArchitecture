package chapter2.item6;

public class Autoboxing {
    public static long sum(){
        // Creating unneccesary objects with autoboxing
        Long sum = 0L;
        for (long i=0L; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }

    public static long sumImproved() {
        long sum = 0L;
        for(long i=0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String args[]) {
        //prefer primitives to
        //boxed primitives, and watch out for unintentional autoboxing
        long startTime = System.currentTimeMillis();
        sum();
        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println(finalTime);

        startTime = System.currentTimeMillis();
        sumImproved();
        finalTime = System.currentTimeMillis() - startTime;
        System.out.println(finalTime);


    }
}
