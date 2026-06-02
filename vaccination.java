package day10;

abstract class vaccine {
	int age;
	String nationality;
	boolean firstDoseTaken=false;
	
	vaccine(int age,String nationality){
		this.age=age;
		this.nationality=nationality;
	}
    void firstDose() {
    	if(nationality.equalsIgnoreCase("Indian") && age >= 18) {
    		System.out.println("your firstdose is successful now pay the 250rs");
    		firstDoseTaken = true;
    	}else {
    		System.out.println("not eligiable");
    	}
    }
    void secondDose() {
    	if(firstDoseTaken) {
    		System.out.println("your second Dose successfully done");
    	}else {
    		System.out.println("first complete the firstDose before second Dose");
    	}
    }
    abstract void boosterDose();
}
class vaccinationSuccessful extends vaccine{
	vaccinationSuccessful(int age, String nationality){
		super(age,nationality);
	}
	void boosterDose() {
		System.out.println("your Booster dose successfully done");
	}
}

public class vaccination {

	public static void main(String[] args) {
		vaccinationSuccessful v=new vaccinationSuccessful(18,"indian") ;
		
		v.firstDose();
		v.secondDose();
		v.boosterDose();
	}

}
