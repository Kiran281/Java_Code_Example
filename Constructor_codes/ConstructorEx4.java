class ConstructorEx4 {
    int price;
    String model;
    String color;
	
	// constructor chaining

    // constructor 1 (default) 
    ConstructorEx4() {
        this(15000, "Redmi Note 12", "Blue"); // call parameterized constructor
    }

    // constructor 2 (parameterized)
   ConstructorEx4(int price, String model, String color) {
        this.price = price;
        this.model = model;
        this.color = color;
    }

    void display() {
        System.out.println("Model: " + model + ", Price: " + price + ", Color: " + color);
    }

    public static void main(String[] args) {
       ConstructorEx4 m1 = new ConstructorEx4(); // default constructor called
        m1.display();
    }
}
