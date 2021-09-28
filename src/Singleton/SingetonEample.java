package Singleton;

public class SingetonEample {
    public static void main(String[] args) {
        Singletion x = Singletion.getInstance();

        // Instantiating Singleton class with variable y
        Singletion y = Singletion.getInstance();

        // Instantiating Singleton class with variable z
        Singletion z = Singletion.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());


        // Condition check
        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
    }

