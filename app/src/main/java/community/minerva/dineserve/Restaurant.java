package community.minerva.dineserve;

class Restaurant {
    private String name;
    private double distance;
    private double magnitude;
    private int tables;

    Restaurant(String name, double distance, double magnitude, int tables) {
        this.name = name;
        this.distance = distance;
        this.magnitude = magnitude;
        this.tables = tables;
    }

    String getName() {
        return name;
    }

    double getDistance() {
        return distance;
    }

    double getMagnitude() {
        return magnitude;
    }

    int getTables() {
        return tables;
    }
}
