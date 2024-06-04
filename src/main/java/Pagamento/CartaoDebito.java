/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagamento;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import java.util.Date;

public class CartaoDebito implements Pagamento{
    private String numero;
    private YearMonth validade;
    private String cvv;
    
    public CartaoDebito(String numeroCartao, String validade, String cvv) {
        this.numero = numeroCartao;
        this.validade = analisaYearMonth(validade);
        this.cvv = cvv;
    }
    
    @Override
     public void pagar() {
        if (validarNumeroCartao(numero) && validarValidade(validade) && validarCVV(cvv)) {
            System.out.println("Processando pagamento...");
            try {
                Thread.sleep(2000); // Simulando tempo de processamento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Pagamento realizado com sucesso com cartao de debito.");
        } else {
            System.out.println("Falha no pagamento: Dados do cartao invalidos.");
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getCvv() {
        return cvv;
    }

    public YearMonth getValidade() {
        return validade;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setValidade(YearMonth validade) {
        this.validade = validade;
    }
    
    
    private boolean validarNumeroCartao(String numeroCartao) {
        return numeroCartao != null && numeroCartao.matches("\\d{16}");
    }

    private boolean validarValidade(YearMonth validade) {
        return validade != null && validade.isAfter(YearMonth.now());
    }

    private boolean validarCVV(String cvv) {
        return cvv != null && cvv.matches("\\d{3,4}");
    }
    
    
    private YearMonth analisaYearMonth(String validade) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
            return YearMonth.parse(validade, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de validade invalido. Use MM/AA.");
            return null;
        }
    }
    
      
}
