package lab1opt;

public class Main {

    public static void main(String[] args) {
        graphMatrix(args);
    }

    //method to verify if some string is an integer
    public static boolean checkInt(String n) {
        try {
            Integer.parseInt(n);
        } catch (NumberFormatException except) {
            return false;
        }
        return true;
    }

    public static int valArg(String[] args) {
        if (args.length == 0) //we verify if there is no input yet
            System.out.println("No arguments");
        else if (!checkInt(args[0])) System.out.println("Argument is not an integer");
        else if (checkInt(args[0]))
            if (Integer.parseInt(args[0]) % 2 == 0) System.out.println("Number is not odd");
            else
                System.out.println("Argument is valid");

        int n = Integer.parseInt(args[0]);
        return n;
    }

    public static void graphMatrix(String[] args) {
        long startTime = System.nanoTime();
        int n = valArg(args);
        int[][] matrix = new int[n][n];
        if (n % 2 == 1) {
            int i;
            int j;
            for (i = 0; i < n; i++)
                for (j = i; j < n; j++)
                    if (i == j) matrix[i][j] = 0; //on the main diagonal we have 0
                    else {
                        int rand_int = (int) (Math.random() * 2); //we randomly generate 0 or 1
                        matrix[i][j] = matrix[j][i] = rand_int;
                        //the matrix of a graph is symmetric respective to the main diagonal
                    }

            if (n < 30000) {
                System.out.println("The generated matrix of the graph is:");
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        System.out.print(matrix[i][j] + " ");
                   /* Here I have tried to use empty hearts for 0 and full hearts for 1, but all I got was '?' everywhere
                    if (matrix[i][j]==1)
                        System.out.print("\u2665 ");
                    else
                        System.out.print("\u2661 ");
                    */
                    }
                    System.out.println();
                }
            }
        }

        /*
        we find the connected components using an array of "colors", where each connected component has a number i,
        where 1<=i<=n
        */
            int i, j;
            int[] colors = new int[n];
            int color = 0;
            for (i = 0; i < n; i++)
                for (j = 0; j < n; j++)
                    if (matrix[i][j] == 1)
                        if (colors[i] != 0)
                            colors[j] = colors[i];
                        else if (colors[j] != 0)
                            colors[i] = colors[j];
                        else {
                            color++;
                            colors[i] = colors[j] = color;
                        }
            for (i = 0; i < n; i++)
                if (colors[i] == 0) {
                    color++;
                    colors[i] = color;
                }

            if (n % 2 == 1) {
                int OK = 1;
                for (i = 0; i < n - 1; i++)
                    if (colors[i] != colors[i + 1])
                        OK = 0;
                if (n < 30000) {
                    if (OK == 1)
                        System.out.println("The graph is connected");
                    else System.out.println("The number of connected components is: " + color);
                    System.out.println("The nodes with their corresponding connected component are:");
                    for (i = 0; i < n; i++)
                        System.out.print(i + " | ");
                    System.out.println();
                    for (i = 0; i < n; i++)
                        System.out.print(colors[i] + " | ");
                    System.out.println();
                }

                //partial tree of the graph
                if (OK == 1) {
                    int[] visited = new int[n];
                    int[][] partialTree = new int[n + 1][n + 1];
                    for (i = 0; i < n; i++)
                        for (j = i; j < n; j++)
                            if (matrix[i][j] == 1)
                                if (visited[i] == 0 && visited[j] == 0) {
                                    visited[i] = visited[j] = 1;
                                    System.out.println(i + " is visited");
                                    System.out.println(j + " is visited");
                                    partialTree[i][j] = 1;
                                    partialTree[j][i] = 1;
                                } else if (visited[i] == 1 && visited[j] == 0) {
                                    visited[j] = 1;
                                    System.out.println(j + " is visited");
                                    partialTree[i][j] = 1;
                                    partialTree[j][i] = 1;
                                }

                    //we print the matrix of the partial tree
                    if (n<30000) {
                        System.out.println("The matrix of the partial tree is: ");
                        for (i = 0; i < n; i++) {
                            for (j = 0; j < n; j++) {
                                System.out.print(partialTree[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                }
            }
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Time in nanoseconds: " + totalTime);
        }

    }


