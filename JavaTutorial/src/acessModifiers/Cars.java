package acessModifiers;

public class Cars {
	// Quando nao tenho um modificador ele é acessivel somente dentro do pacote
	int speed;
	
	
	// Private é acessivel somente pela classe
	// para variveis privates costumo usar get and set para receber e retornar valores
	@SuppressWarnings("unused")
	private int privateSpeed;
	
	//Qualquer lugar no java desde que realize o importe do pacote e instancie a classe
	public int publicSpeed;

	// Disponivel no mesmo pacote e nas subclasses (herança)
	protected int protectedSpeed;
	
	int speedLimit = 100 ;
	
	public Cars () {
		this(0);
	}
	
	public void setPrivateSpeed(int pSpeed) {
		this.privateSpeed = pSpeed;
	}

	public Cars (int startSpeed) {
		this.privateSpeed = startSpeed;
	}
		
	public void increaseSpeed() {
		if (speed < 100) {
			speed++;
		}
		System.out.println("Increasing Speed of Cars ");
	}
	
	protected void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing Speed of Cars");
	}
}
