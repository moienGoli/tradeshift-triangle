package com.tradeshift;

import com.tradeshift.domain.Polygon;
import com.tradeshift.exception.AppException;
import com.tradeshift.service.PolygonFactory;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given an array of integers, this app will tell you the type of given polygon
 */
public class App {

    /**
     * The app will ask you to input an array of numbers, separated by comma or space. Then it will print the type of polygon that it can be drawn by given numbers.
     * Currently only the triangle part is implemented and entering more than three numbers will result in error message.
     *
     * @param args No params needed.
     */
    public static void main(String[] args) {

        log("This app will tell you the polygon type considering the input");
        log("Type 'exit' to exit the app");
        runApp();
    }

    @SuppressWarnings("InfiniteRecursion")
    private static void runApp() {
        try {
            String input = readInput();
            if (input.equalsIgnoreCase("exit")) {
                System.exit(0);
            }
            double[] sides = Arrays.stream(input.split("\\s*(,|\\s)\\s*")).mapToDouble(Double::parseDouble).toArray();
            Polygon polygon = PolygonFactory.create(sides);
            log(polygon.toString());
        } catch (NumberFormatException e) {
            log("Invalid Input!!");
        } catch (AppException e) {
            log(e.getMessage());
        } finally {
            runApp();
        }
    }

    private static String readInput() {

        log("Enter the values. Values must be an array of numbers, all greater than zero and separated by comma or space");
        log("e.g '5 5 8' or '5,5,8' ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().trim();
    }

    //Normally it is not a good practice ti use System.out.println. So consider using a Logger tool if there is a need to extend the app
    private static void log(String message) {
        System.out.println(message);
    }
}
