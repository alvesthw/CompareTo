import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("João", "Silva", LocalDate.of(2000, 1, 20), 000000000);
        Pessoa p2 = new Pessoa("Maria", "Santos", LocalDate.of(2001, 1, 20), 000000000);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);

        Collections.sort(pessoas);

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome() +
                    ", Data de Nascimento: " + pessoa.getData() + ", Telefone: " + pessoa.getTelefone());
        }


    }
}
