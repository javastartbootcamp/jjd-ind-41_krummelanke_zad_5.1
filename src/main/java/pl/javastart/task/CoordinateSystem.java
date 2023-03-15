package pl.javastart.task;

import pl.javastart.task.definition.Point;

import java.util.Scanner;

public class CoordinateSystem {

    void run(Scanner scanner) {
        System.out.println("Podaj X:");
        int coordinateX = scanner.nextInt();
        System.out.println("Podaj Y:");
        int coordinateY = scanner.nextInt();
        scanner.close();

        Point point = new Point(coordinateX, coordinateY);

        String quarter = point.returnQarter();

        System.out.println("Punkt (" + point.getxCoordinate() + ", " + point.getyCoordinate() + ")" + quarter);
    }
}
