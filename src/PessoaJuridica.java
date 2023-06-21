public class PessoaJuridica extends ClienteBanco {
    private int cnpj = 0;
    private PessoaFisica responsavel = new PessoaFisica();
    String nome = responsavel.getNome();
    int countNome = nome.length();

    public void verifiDoc(){
        if( countNome > 30){
            System.out.println("Nome inválido para Responsável");
        } else{
            System.out.println("Nome válido para Responsável");
        }
    }

}
