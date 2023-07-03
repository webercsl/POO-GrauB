public class PessoaJuridica extends ClienteBanco {
    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    private long cnpj = 0;

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

    private PessoaFisica responsavel = new PessoaFisica();
    String nome = responsavel.getNome();
    int countNome = nome.length();

    private Endereco endereco = new Endereco();

    public void setRua(String rua) {
        endereco.setRua(rua);
    }

    public void verifiDoc(){
        if( countNome > 30){
            System.out.println("Nome inválido para Responsável");
        } else{
            System.out.println("Nome válido para Responsável");
        }
    }

    public void imprimirDados() {
        System.out.println("Número da Conta: " + getNumeroConta());
        validar();
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Rua: " + endereco.getRua());
    }

}
