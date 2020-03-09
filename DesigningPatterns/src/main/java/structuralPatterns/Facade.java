package structuralPatterns;

interface Model {
	   void create();
}

class Lamborghini implements Model {
	   public void create() {
	      System.out.println("Model : Lamborghini");
	   }
}

class BMW implements Model {
	public void create() {
	      System.out.println("Model : BMW");
	   }
}

class Ferrari implements Model {
	   public void create() {
	      System.out.println("Model : Ferrari");
	   }
}

class Audi implements Model {
	   public void create() {
	      System.out.println("Model : Audi");
	   }
}

class ModelDeveloper {
	   private Model Lamborghini;
	   private Model BMW;
	   private Model Ferrari;
	   private Model Audi;

	   public ModelDeveloper() {
	      Lamborghini = new Lamborghini();
	      BMW = new BMW();
	      Ferrari = new Ferrari();
	      Audi = new Audi();
	   }

	   public void createLamborghini(){
	      Lamborghini.create();
	   }
	   public void createBMW(){
		      BMW.create();
		   }
	   public void createFerrari(){
		      Ferrari.create();
		   }
	   public void createAudi(){
		      Audi.create();
		   }
	}

public class Facade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModelDeveloper modelDeveloper = new ModelDeveloper();

		  modelDeveloper.createLamborghini();
	      modelDeveloper.createBMW();
	      modelDeveloper.createFerrari();
	      modelDeveloper.createAudi();
	}

}
