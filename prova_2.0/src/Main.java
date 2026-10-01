import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       SISTEMA BANCO DE ALIMENTOS");
        System.out.println("========================================");

        // 1. Criando o alimento Arroz
        Alimento arroz1 = new Alimento(
                1,
                "Arroz",
                "Grãos",
                LocalDate.of(2026, 12, 31)
        );

        // Estoque inicial de 0 kg
        Estoque estoque = new Estoque(arroz1, 0);

        // 2. Criando o doador
        Doador doador = new Doador(
                1,
                "Supermercado Esperança",
                "123456789",
                "99999-9999"
        );

        // 3. Criando e processando a doação de 100 kg
        Doacao doacao = new Doacao(
                1,
                doador,
                arroz1,
                100,
                LocalDate.now(), false
        );

        System.out.println("Doador: Supermercado Esperança");
        System.out.println("Produto: Arroz");
        System.out.println("Doação recebida: 100.0 kg");

        if (doacao.processar(estoque)) {
            System.out.println("Doação processada com sucesso.");
        }

        System.out.println(
                "Estoque atual: " + estoque.getQuantidade() + " kg"
        );

        // 4. Distribuição de 30 kg
        Distribuicao distribuicao = new Distribuicao(
                1,
                arroz1,
                30,
                LocalDate.now(),
                "Família cadastrada"
        );

        System.out.println("Distribuição solicitada: 30.0 kg");

        if (distribuicao.processar(estoque)) {
            System.out.println("Distribuição realizada com sucesso.");
        }

        System.out.println(
                "Estoque atual: " + estoque.getQuantidade() + " kg"
        );

        // 5. Perda de 5 kg
        Perda perda = new Perda(
                1,
                arroz1,
                5,
                "Embalagem danificada",
                LocalDate.now()
        );

        System.out.println("Perda registrada: 5.0 kg");
        System.out.println("Motivo: Embalagem danificada");

        if (perda.processar(estoque)) {
            System.out.println(
                    "Estoque atual: " + estoque.getQuantidade() + " kg"
            );
        }

        // 6. Tentativa de distribuir 80 kg
        Distribuicao distribuicaoInvalida = new Distribuicao(
                2,
                arroz1,
                80,
                LocalDate.now(),
                "Instituição cadastrada"
        );

        System.out.println("Distribuição solicitada: 80.0 kg");

        if (distribuicaoInvalida.processar(estoque)) {
            System.out.println("Distribuição realizada com sucesso.");
        }

        System.out.println(
                "Estoque permanece: " + estoque.getQuantidade() + " kg"
        );

        // 7. Demonstração de identidade e referências

        Alimento arroz2 = new Alimento(
                1,
                "Arroz",
                "Grãos",
                LocalDate.of(2026, 12, 31)
        );

        Alimento arroz3 = arroz1;

        // arroz1 e arroz2 são objetos diferentes.
        // Mesmo possuindo os mesmos dados, foram criados
        // com dois "new" diferentes.
        System.out.println(arroz1 == arroz2);

        // arroz3 recebe a mesma referência de arroz1.
        // Portanto, os dois apontam para o mesmo objeto.
        System.out.println(arroz1 == arroz3);

        System.out.println("========================================");
    }
}