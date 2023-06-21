public class PessoaFisica extends ClienteBanco {
    public void verifiDoc(){
        if(quantcpf >= 10 && quantcpf <= 20){
            System.out.println("CPF válido");
        } else{
            System.out.println("CPF inválido");
        }
    }
    private int cpf;
    String cpfstring = Integer.toString(cpf);
    int quantcpf = cpfstring.length();

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
