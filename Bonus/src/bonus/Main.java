package bonus;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of nodes:");
        int nodes = scan.nextInt();

        int root = (int)(Math.random() * nodes); // we generate a random number for root
        System.out.println("The root is: " + root);
        System.out.println();

        int [] fatherOf = new int[nodes + 1];
        //initially, all values are -2
        Arrays.fill(fatherOf,-2);

        // we put the value -1 for the root, since it has no father
        fatherOf[root] = -1;

        // we make another array of "available fathers" from which we randomly choose the father of a root
        int [] availableFathers = new int[nodes + 1];

        // the root is the only one available for now
        int index = 0;
        availableFathers[index] = root;

        int i, randomFather;
        for (i = 0; i < nodes; i++)
            if (fatherOf[i] == -2) {
                randomFather = (int) (Math.random() * (index + 1));
                fatherOf[i] = availableFathers[randomFather];
                index = index + 1;
                availableFathers[index] = i;
            }
        System.out.print("Node i | ");
        for (i = 0; i < nodes; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Father | ");
        for (i = 0; i < nodes; i++) {
            System.out.print(fatherOf[i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("The representation of the tree: (Father -> Son)");

        //We call the function, starting from the root
        findSons(fatherOf, root);


    }
    public static void findSons(int[] array, int node){

        int i;
        for (i = 0; i < array.length; i++) {

            if (array[i] == node) {

                int currentNode = i;
                System.out.println("node" + node + " -> node" + i);
                // We search further, for sons of the current node
                findSons(array, currentNode);

            }

        }

    }
}
