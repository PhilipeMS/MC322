package mc322.lab03;

public class AppLab03 {
	
	public static void main(String[] args) {
		Animacao lombriga = new Animacao("080403MCMVM");
		while(lombriga.animacao.length() > 0) {
			lombriga.apresenta();
			lombriga.passo();
		}
		lombriga.apresenta();
	}

}
