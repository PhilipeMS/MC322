package mc322.lab03;
class AquarioLombriga{
    int aquarioTamanho;
    int lombrigaTamanho;
    int pos;
    int dir; //se dir = -1; a lombriga esta virada para a esquerda, se dir = 1, esta virada pra direita;
    
    AquarioLombriga(int aquarioTamanho, int lombrigaTamanho, int pos){
        this.aquarioTamanho = aquarioTamanho;
        this.lombrigaTamanho = lombrigaTamanho;
        this.pos = pos;
        this.dir = -1;
    }
    
    public void crescer(){
        if(this.dir == -1){
            if(this.lombrigaTamanho + this.pos - 1 < this.aquarioTamanho){
                this.lombrigaTamanho += 1;
            }
        }else{
            if(this.pos - this.lombrigaTamanho + 1 > 1){
                this.lombrigaTamanho += 1;
            }
        }

    }
    
    public void mover(){
        if(this.dir == -1){
            if(this.pos > 1)
                this.pos -= 1;
            else
                this.virar();
        }else{
            if(this.pos < aquarioTamanho)
                this.pos += 1;
            else
                this.virar();
        }
    }
    
    public void virar(){
        if(this.dir == -1){
            this.pos = this.pos + this.lombrigaTamanho - 1;
        }else{
            this.pos = this.pos - this.lombrigaTamanho + 1;
        }
        
        this.dir = -this.dir;
    }
    
    public void apresentar(){
        for(int i = 1; i <= this.aquarioTamanho; i++){
            if(this.dir == -1){
                if(i == this.pos)
                    System.out.print("O");
                else if(this.pos< i && i < this.pos + this.lombrigaTamanho)
                    System.out.print("@");
                else
                    System.out.print("#");
            }else{
                if(i == this.pos)
                    System.out.print("O");
                else if(this.pos >  i && i > this.pos - this.lombrigaTamanho)
                    System.out.print("@");
                else
                    System.out.print("#");
            }
        }
        System.out.println("");
    }

}