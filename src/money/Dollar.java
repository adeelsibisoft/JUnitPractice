package money;
public class Dollar extends Denomination{
	
	Dollar(){
		super();
	}
	
	Dollar(String d){
		super(d , "$");
	}
	
	Dollar(double d){
		super(d , "$");
	}

}
