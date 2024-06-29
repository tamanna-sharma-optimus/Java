
public class MethodOverloading {
	public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading cal = new MethodOverloading();
        int sumForInt = cal.add(5, 10);
        int sumForInt3= cal.add(3, 7, 2);
        double sumForDouble = cal.add(2.5, 3.5);
        System.out.println("Sum 1: " + sumForInt);
        System.out.println("Sum 2: " + sumForInt3);
        System.out.println("Sum 3: " + sumForDouble);
	}
}