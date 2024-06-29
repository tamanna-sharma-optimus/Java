
class Circle {
	private double radius;
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

	public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println("Initial Radius: " + circle.getRadius());
        circle.setRadius(7.5);
        System.out.println("Updated Radius: " + circle.getRadius());
        System.out.println("Area of the Circle: " + circle.calculateArea());
	}
}