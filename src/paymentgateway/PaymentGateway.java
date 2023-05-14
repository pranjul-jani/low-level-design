package paymentgateway;

public class PaymentGateway {

    private double x1;
    private double y1;

    private double x2;
    private double y2;

    private AlgorithmType algorithmType;


}

class Coordinate {

    private double x1;
    private double y1;

    private double x2;
    private double y2;

    private AlgorithmType algorithmType;

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public AlgorithmType getAlgorithmType() {
        return algorithmType;
    }

    public void setAlgorithmType(AlgorithmType algorithmType) {
        this.algorithmType = algorithmType;
    }

    public Coordinate(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
}

enum AlgorithmType {
    DIJKSTRA, A_STAR, BREATH_FIRST_SEARCH, DEPTH_FIRST_SEARCH
}

class RouteFinder {

    private double calculateDistance(Coordinate coordinate) {
        double distance = 0;

        if (coordinate.getAlgorithmType().equals(AlgorithmType.DIJKSTRA)) {
            //calculate distance using dijkstra algorithm
        } else if (coordinate.getAlgorithmType().equals(AlgorithmType.A_STAR)) {
            //calculate distance using A* algorithm
        } else if (coordinate.getAlgorithmType().equals(AlgorithmType.BREATH_FIRST_SEARCH)) {
            //calculate distance using BFS algorithm
        } else if (coordinate.getAlgorithmType().equals(AlgorithmType.DEPTH_FIRST_SEARCH)) {
            //calculate distance using DFS algorithm
        }

        return distance;

    }
}


interface RouteFindingStrategy {
    double calculateDistance(Coordinate coordinate);
}

class DijkstraStrategy implements RouteFindingStrategy {

    @Override
    public double calculateDistance(Coordinate coordinate) {
        double distance = 0;
        //calculate distance using dijkstra algorithm

        return distance;
    }
}

class AStarStrategy implements RouteFindingStrategy {

    @Override
    public double calculateDistance(Coordinate coordinate) {
        double distance = 0;
        //calculate distance using A* algorithm

        return distance;
    }
}

class BfsStrategy implements RouteFindingStrategy {

    @Override
    public double calculateDistance(Coordinate coordinate) {
        double distance = 0;
        //calculate distance using BFS algorithm

        return distance;
    }
}

class DfsStrategy implements RouteFindingStrategy {

    @Override
    public double calculateDistance(Coordinate coordinate) {
        double distance = 0;
        //calculate distance using DFS algorithm

        return distance;
    }
}

class RouteFindingContext {

    private RouteFindingStrategy routeFindingStrategy;

    public RouteFindingContext(RouteFindingStrategy routeFindingStrategy) {
        this.routeFindingStrategy = routeFindingStrategy;
    }

    public double calculateDistance(Coordinate coordinate) {
        return routeFindingStrategy.calculateDistance(coordinate);
    }
}

class NavigatorsApp {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate(0, 0, 4,3);
        DijkstraStrategy dijkstraStrategy = new DijkstraStrategy();

        double distance = new RouteFindingContext(dijkstraStrategy).calculateDistance(coordinate);
    }

}
