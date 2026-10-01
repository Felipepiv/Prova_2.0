public class Doador { // Molde chamado Doador

    private int id;
    private String nome;
    private String documento;
    private String telefone;

    // Constructor de doador
    public Doador(int id, String nome, String documento, String telefone){
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDocumento(){
        return this.documento;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }

    // Metódos da classe doador
    public void exibirDados(){
        System.out.println("ID: ] " + id);
        System.out.println("Nome: ] " + nome);
        System.out.println("Documento: ] " + documento);
        System.out.println("Telefone: ] " + telefone);
    }
    
    public void atualizartelefone(String novoTelefone){
        this.telefone = novoTelefone;
    }
}
