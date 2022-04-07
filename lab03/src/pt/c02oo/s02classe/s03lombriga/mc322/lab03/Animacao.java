package mc322.lab03;
class Animacao{
    String animacao;
    AquarioLombriga lombriga;
    
    Animacao(String animacao){
        int aquarioTamanho = (animacao.charAt(0)-48)*10 + animacao.charAt(1) - 48;
        int lombrigaTamanho = (animacao.charAt(2)-48)*10 + animacao.charAt(3)-48;
        int pos = (animacao.charAt(4)-48)*10 + animacao.charAt(5)-48;
        
        this.lombriga = new AquarioLombriga(aquarioTamanho, lombrigaTamanho, pos);
        this.animacao = "";
        for(int i = 6; i < animacao.length(); i++){
            this.animacao += animacao.charAt(i);
        }
    }
    
    public void passo() {
    	if(this.animacao.length() > 0) {
    		switch(this.animacao.charAt(0)) {
    		case 'M':
    			this.lombriga.mover();
    			break;
    		case 'V':
    			this.lombriga.virar();
    			break;
    		case 'C':
    			this.lombriga.crescer();
    			break;
    		}
    		this.animacao = this.animacao.substring(1);
    	}
    }
    
    public void apresenta(){
        lombriga.apresentar();
    }
    
}
