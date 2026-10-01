import java.time.LocalDate;

public class Doacao {
    
    private int id;
    private Doador doador;
    private Alimento alimento;
    private double quantidade;
    private LocalDate data;
    private boolean processada;

    public Doacao(int id, Doador doador, Alimento alimento, double quantidade, LocalDate data, boolean processada){
        this.id = id;
        this.doador = doador;
        this.alimento = alimento;
        this.quantidade = quantidade;
        this.data = data;
        this.processada = false;
    }

    public double getQuantidade(){
        return this.quantidade;
    }
    
    public boolean processar(Estoque estoque){

        if(processada){
            System.out.println("ERRO: está doação não foi processada");
            return false;
        }

        if(quantidade <= 0){
            System.out.println("ERRO: doaçao invalida");
            return false;
        }

        estoque.registrarEntrada();
        processada = true;

        return true;
    }

}
