public abstract class ClienteBanco implements Verifica {
    private int numeroConta = 0;
    private String nome = "";
    private Endereco ender = new Endereco();

    public abstract void verifiDoc();

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if(numeroConta >=0){
            this.numeroConta = numeroConta;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnder() {
        return ender;
    }

    public void setEnder(Endereco ender) {
        this.ender = ender;
    }

    @Override
    public void validar() {
        if (numeroConta % 2 == 0)
            System.out.println("Este número da conta é par.");
        else if (numeroConta % 2 != 0) {
            System.out.println("Este número da conta é ímpar.");
        } else {
            System.out.println("Número inválido");
        }
    }

}
