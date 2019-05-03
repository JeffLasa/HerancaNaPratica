public abstract class Funcionario {

    private String Nome;
    private float salario;

    public abstract void baterPonto();

    public boolean baterMeta(){
        return true;
    }

    public boolean baterMeta(int pontos){
        return pontos >= 10;
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
