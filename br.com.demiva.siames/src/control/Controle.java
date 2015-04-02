package control;

public class Controle {

	private int possibilidadeChuva; 
	private int temperatura;


	public Controle () {

	}



	public int getTemperatura() {
		return temperatura;
	}



	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}



	public int getPossibilidadeChuva() {
		return possibilidadeChuva;
	}

	public void setPossibilidadeChuva(int possibilidadeChuva) {
		this.possibilidadeChuva = possibilidadeChuva;
	}


	public String indicaSapato (int possibilidadeChuva) {
		String sapato = "Nenhum";

		if (getPossibilidadeChuva() >= 50)
			sapato = "botas";

		return sapato;

	}
	
	public String indicaCasaco (int temperatura) {
		String casaco = null;
		
		if (getTemperatura() < 15)
			casaco = "casaco";
		
		return casaco;
		
	}

}
