public class Aluno extends Pessoa {
    private int idAluno;

    public Aluno (){
        this("", 0,0l, 0);
    }

    public Aluno (String nome, int idade, long cpf, int idProfessor){
        super(nome, idade, cpf);
    }

    public int getIdAluno(){
        return this.idAluno;
    }
    public String toString(){
        return super.toString() + "ID Aluno: " + getIdAluno();
    }
}
