public class PessoaFisica extends ClienteBanco {
    private long cpf;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void verifiDoc() {
        String cpfString = String.valueOf(cpf);
        int quantCpf = cpfString.length();

        if (quantCpf >= 10 && quantCpf <= 20) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }
    }

    public void imprimirDados() {
        System.out.println("CPF da pessoa física: " + getCpf());
        verifiDoc();
        System.out.println("Nome da pessoa física: " + getNome());
    }
}
