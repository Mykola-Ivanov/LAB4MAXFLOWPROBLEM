package org.example;

import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String path = "src\\main\\resources\\L4_1.txt";
    public static void main( String[] args )
    {
        try {
            GraphLoader loader = new GraphLoader(path,true);
            FordFalkersonAlgorithm fordFalkersonAlgorithm =
                    new FordFalkersonAlgorithm(loader.getAdjacencyMatrix());
            System.out.println("\nмаксимальний потік:\t" + fordFalkersonAlgorithm.maxFlow(0,5));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
