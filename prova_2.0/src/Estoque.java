public class Estoque {
    
    private Alimento alimento;
    private double quantidade;

    public Estoque(Alimento alimento, double quantidade){
        this.alimento = alimento;
        this.quantidade = quantidade;
    }

    public void registrarEntrada(){
        if(quantidade <= 0){
            System.out.println("ERRO: quantidade de entrada inválida");
            return;
        }

        this.quantidade += quantidade;

    }

    public boolean registrarDistribuicao(double quantidade) {
        if(quantidade <= 0){
            System.out.println("ERRO: quantidade insuficiente em estoque");
            return false;
        }
        this.quantidade -= quantidade;
        return true;
    }


    public boolean registrarPerda(double quantidade){
        if(quantidade <= 0){
            System.out.println("ERRO: quantidade inválida");
            return false;
        }
        
        if(quantidade > this.quantidade){
            System.out.println("ERRO: quantidade insuficiente em estoque.");
            return false;
        }
        this.quantidade -= quantidade;
        return true;
    }

    public double getQuantidade(){
        return quantidade;
    }
}
