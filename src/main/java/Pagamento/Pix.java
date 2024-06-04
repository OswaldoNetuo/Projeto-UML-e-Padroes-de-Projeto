package Pagamento;

public class Pix implements Pagamento {
    
    private String cpf;
    private static final String CPF_REGEX = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
    
    public Pix(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void pagar() {
        if (validarCpf(cpf)) {
            System.out.println("Processando pagamento Pix...");
            try {
                Thread.sleep(2000); // Simulando tempo de processamento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Pagamento realizado com sucesso via Pix.");
        } else {
            System.out.println("Falha no pagamento: Dados do usuário inválidos, Pix cancelado.");
        }
    }

    private boolean validarCpf(String cpf) {
        if (cpf != null && cpf.matches(CPF_REGEX)) {
            return true;
        } else {
            System.out.println("Formato de CPF inválido. Use 000.000.000-00.");
            return false;
        }
    }

   
}
