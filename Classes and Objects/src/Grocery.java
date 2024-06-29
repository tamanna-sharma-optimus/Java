
public class Grocery {
	public void fruits() {
        String fruits[] = {"Apple", "Banana", "Mango", "Strawberry"};
        System.out.println("Fruits:");
        for (int i=0; i<fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
	static void vegetables() {
        String vegies[] = {"Onion", "Potato", "Carrot", "Raddish"};
        System.out.println("Vegetables:");
        for (int i=0; i<vegies.length; i++) {
            System.out.println(vegies[i]);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grocery fruit = new Grocery();        //need to create object in case of public
        fruit.fruits();
        System.out.println();
        vegetables();  // for static need not to create object

	}
}
