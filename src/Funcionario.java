public class Funcionario {

    private String Nome;
    private float salario;

    public void baterPonto(){
        System.out.println("funcionário bateu ponto");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
