import java.time.LocalDate;

public class Perda {
    
    private int id;
    private Alimento alimento;
    private double quantidade;
    private String motivo;
    private LocalDate data;

    public Perda(int id, Alimento alimento, double quantidade, String motivo, LocalDate data){
        this.id = id;
        this.alimento = alimento;
        this.quantidade = quantidade;
        this.motivo = motivo;
        this.data = data;
    }

    public boolean processar(Estoque estoque){
        
        if(quantidade <= 0){
            System.out.println("ERRO: quantidade inválida");
            return false;
        }

        return estoque.registrarPerda(quantidade);
        
    }
}
