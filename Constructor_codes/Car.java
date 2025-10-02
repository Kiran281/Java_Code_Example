class Car {
    String model;
    double price;

    // Static variable: counts total cars produced
    static int totalCarsProduced = 0;

    // Constructor
    Car(String model, double price) {
        this.model = model;
        this.price = price;
        totalCarsProduced++; // increment whenever a car is created
    }

    // Static method to show total cars produced
    static void showTotalCars() {
        System.out.println("Total Cars Produced: " + totalCarsProduced);
    }

    // Static nested class: Factory details
    static class Factory {
        static String factoryName = "Speed Motors";

        static void showFactory() {
            System.out.println("Factory Name: " + factoryName);
        }
    }

    // Method to display car details
    void display() {
        System.out.println("Model: " + model + ", Price: $" + price);
    }

    public static void main(String[] args) {
        // Create car objects
        Car c1 = new Car("Tesla Model 3", 50000);
        Car c2 = new Car("BMW X5", 60000);
        Car c3 = new Car("Audi Q7", 70000);

        // Display car details
        c1.display();
        c2.display();
        c3.display();

        // Show total cars produced (static method)
        Car.showTotalCars();

        // Show factory details (static nested class)
        Car.Factory.showFactory();
    }
}
