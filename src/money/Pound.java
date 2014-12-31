package money;

public class Pound extends Denomination {
	
	Pound(){
		super();
	}
	Pound(String p){
		super(p, "£");
	}
	
	Pound(Double p){
		super(p, "£");
	}
	
}
