
public class ConditionalLogic {

	public static void main(String[] args) {
			int number = 8;

	        if (number < 10) {
	            System.out.println("Number is less than 10");
	        } else if (number < 20) {
	            System.out.println("Number is between 10 and 20");
	        } else {
	            System.out.println("Number is 20 or more");
	        }
	        int dayOfWeek = 6;
	        switch (dayOfWeek) {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            case 6:
	                System.out.println("Saturday");
	                break;
	            case 7:
	                System.out.println("Sunday");
	                break;
	            default:
	                System.out.println("Invalid day");
	        }
	    }
}