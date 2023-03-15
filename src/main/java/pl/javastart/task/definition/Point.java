package pl.javastart.task.definition;

public class Point {
    private int coordinateX;
    private int coordinateY;
    public String quarter = null;

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
            quarter = " leży w I ćwiartce";
        }
        if (coordinateX < 0 && coordinateY > 0) {
            quarter = " leży w II ćwiartce";
        }
        if (coordinateX < 0 && coordinateY < 0) {
            quarter = " leży w III ćwiartce";
        }
        if (coordinateX > 0 && coordinateY < 0) {
            quarter = " leży w IV ćwiartce";
        }
        return quarter;
    }
}