
public class ParaConstructor {
		int id;  
	    String name; 
	    ParaConstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }   
	    void display(){System.out.println(id+" "+name);}  
	    public static void main(String args[]){
	    ParaConstructor s1 = new ParaConstructor(1,"Hi");  
	    ParaConstructor s2 = new ParaConstructor(2,"Hello");    
	    s1.display();  
	    s2.display(); 
	}
}