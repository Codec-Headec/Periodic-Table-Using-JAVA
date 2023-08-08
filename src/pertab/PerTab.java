package pertab;

import java.util.Scanner;

public class PerTab {
    public static void main(String[] args) {
        int n, m, a, Exi, Exit;

        System.out.println("Welcome to Modern Periodic Table \n \n");

        System.out.println("> Press 1 to know about any element in Modern Periodic Table");
        System.out.println("> Press 2 to exit");
        Scanner sc;

        System.out.println("Choose Option:");

        sc = new Scanner(System.in);

        n = sc.nextInt();

        if (n == 1)
        {
            System.out.println("> Press 3 to search element my atomic number");
            m = sc.nextInt();

            if (m == 3)
            {
                System.out.println("Enter the atomic number you want to search:");
                a = sc.nextInt();

                if (a == 1)
                {
                    System.out.println("Name : Hydrogen");
                    System.out.println("Symbol : H");
                    System.out.println("Atomic Number : 1");
                    System.out.println("Thanks for using ======> ❤️");
                }

                if (a == 2)
                {
                    System.out.println("Name : Helium");
                    System.out.println("Symbol : He");
                    System.out.println("Atomic Number : 2");
                    System.out.println("Thanks for using ======> ❤️");
                }
            }
        }
        else
        {
            System.out.println("Thanks for using ======> ❤️");
        }

    }
}