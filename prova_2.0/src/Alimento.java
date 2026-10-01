import java.time.LocalDate;

public class Alimento {
    
    private int id;
    private String nome;
    private String categoria;
    private LocalDate dataValidade;

    public Alimento(int id, String nome, String categoria, LocalDate dataValidade){
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.dataValidade = dataValidade;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCategoria(){
            return this.categoria;
    }

    public boolean estaVencido(){
        return LocalDate.now().isAfter(dataValidade); //usado para calcular a data de validade
    }

    public void exibirDados(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Data validade: " + dataValidade);
    }

    
}
