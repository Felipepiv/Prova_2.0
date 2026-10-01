import java.time.LocalDate;

public class Distribuicao {
    private int id;
    private Alimento alimento;
    private double quantidade;
    private LocalDate data;
    private String beneficiario;

    public Distribuicao(int id, Alimento alimento, double quantidade, LocalDate data, String benificiario){
        this.id = id;
        this.alimento = alimento;
        this.quantidade = quantidade;
        this.data = data;
        this.beneficiario = beneficiario;
    }

    public boolean processar(Estoque estoque){
        
        if(quantidade <= 0){
            System.out.println("ERRO: quantidade inválida");
            return false;
        }

        if(alimento.estaVencido()){
            System.out.println("ERRO: alimento vencido");
            return false;
        }

        if(quantidade > estoque.getQuantidade()){
        System.out.println("ERRO: quantidade insuficiente no estoque");
        return false;
        }

        return estoque.registrarDistribuicao(quantidade);
    }
}
