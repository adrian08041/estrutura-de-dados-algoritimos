public class Pessoa {

    private String nome;
    private int idade;
    private long cpf;
    
    
    
    public Pessoa (){
        this("",0,0l);
    }

  /*  public Pessoa (String nome, int idade, long cpf){
        this(nome, idade, cpfl);
    }; */
    
    public Pessoa (String nome, int idade){
        this(nome, idade, 0l);
    };


    public Pessoa (String nome, int idade, long cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
        
    public String getNome() {
    return this.nome;
  }
  

   public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public long getCpf() {
    return this.cpf;
  }

  public void setCpf(long cpf) {
    this.cpf = cpf;
  }



  public String toString(){
    return " Nome: "  + getNome() + " idade: "  + getIdade() + " cpf : "  + getCpf(); 
  }



 }

