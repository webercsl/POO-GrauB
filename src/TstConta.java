public class TstConta {
    public static void main(String[] args) {
        PessoaJuridica pj = new PessoaJuridica();
        PessoaFisica pf = new PessoaFisica();

        try {
            System.out.println("==========SAÍDA DE DADOS==========");
            pj.setNumeroConta(1234567890);
            pj.setCnpj(109389800001L);
            pj.setResponsavel(new PessoaFisica());
            pj.getResponsavel().setCpf(13506845020L);
            pj.getResponsavel().setNome("Gustavo Weber");
            pj.setRua("Rua Silvino Paulino Birk, 91");

            pj.imprimirDados();
            pj.getResponsavel().imprimirDados();
        } catch (NumException e) {
            e.impMsg();
        }
    }
}