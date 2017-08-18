package inheritance;

public class Cars {
	
	public int speed;
	public int valor;
	public String nome = "Daiane";
		
	public void increaseSpeed()
	{
		this.speed ++;
		System.out.println("Increasing Speed of Cars");
	}
	
	public void decreaseSpeed()
	{
		this.speed --;
		System.out.println("Decreasing Speed of Cars");
	}
	
	
	public void ValordoCarro(int valor)
	{	
		this.valor = valor + 1000;
		System.out.println("----------------------");
		System.out.println(this.valor);
		System.out.println(nome);
	}

}
