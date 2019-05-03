public class TesteHeranca {

    public static void main(String[] args) {

        Funcionario funcionario = new Professor();
        funcionario.setNome("Elaine");
        funcionario.setSalario(50000F);
        System.out.println(" Funcionário(a) " + funcionario.getNome() + " ganha R$ " + funcionario.getSalario());


        Funcionario professor = new Professor();
        professor.setNome("Fábio");
        professor.setSalario(20000F);
        ((Professor) professor).setCurso("Mobile Android");
        System.out.println(professor.getNome() + " é professor de " + ((Professor) professor).getCurso() +" e ganha R$ " + professor.getSalario() );

        funcionario.baterPonto();
        professor.baterPonto();

        professor.baterMeta();
        professor.baterMeta(5);

        if (professor.baterMeta(15)){
            System.out.println("Meta batida");
        } else{
            System.out.println("Meta não atingida");
            }
        }



    }

    