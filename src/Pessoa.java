import java.time.LocalDate;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String sobrenome;
    private LocalDate data;
    private int telefone;


    public Pessoa(String nome, String sobrenome, LocalDate data, int telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.data = data;
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    @Override
    public int compareTo(Pessoa o) {
        int comparacaoNome = this.nome.compareTo(o.nome);
        if(comparacaoNome != 0){
            return comparacaoNome;
        }

        int comparacaoSobrenome = this.sobrenome.compareTo(o.sobrenome);
        if(comparacaoSobrenome != 0){
            return comparacaoSobrenome;
        }

        return this.data.compareTo(o.data);
    }

    
}
