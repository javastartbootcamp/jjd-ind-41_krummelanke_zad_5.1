package pl.javastart.task.definition;

public class Point {
    private int coordinateX;
    private int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getxCoordinate() {
        return coordinateX;
    }

    public int getyCoordinate() {
        return coordinateY;
    }

    public String returnQarter() {
        String quarter = null;

        if (coordinateX == 0 && coordinateY == 0) {
            quarter = " leży na środku układu współrzędnych";
        }
        if (coordinateX == 0 && coordinateY != 0) {
            quarter = " leży na osi Y";
        }
        if (coordinateX != 0 && coordinateY == 0) {
            quarter = " leży na osi X";
        }
        if (coordinateX > 0 && coordinateY > 0) {
            quarter = " leży w I ćwiartce układu współrzędnych";
        }
        if (coordinateX < 0 && coordinateY > 0) {
            quarter = " leży w II ćwiartce układu współrzędnych";
        }
        if (coordinateX < 0 && coordinateY < 0) {
            quarter = " leży w III ćwiartce układu współrzędnych";
        }
        if (coordinateX > 0 && coordinateY < 0) {
            quarter = " leży w IV ćwiartce układu współrzędnych";
        }
        return quarter;
    }
}