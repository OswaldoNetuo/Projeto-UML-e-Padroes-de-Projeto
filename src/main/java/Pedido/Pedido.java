/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedido;

import CarrinhoCompras.CarrinhoCompras;
import Pagamento.Pagamento;
import java.util.Date;

public class Pedido {

    private int pedido_id;
    private Date data;
    private CarrinhoCompras carrinho;
    private Pagamento pagamento;
    private EstadoPedido estado;

    public Pedido(int pedido_id, Date data, CarrinhoCompras carrinho, Pagamento pagamento) {
        this.pedido_id = pedido_id;
        this.data = data;
        this.carrinho = carrinho;
        this.pagamento = pagamento;
        estado = new Aberto(this);
    }

    public int getPedido_id() {
        return pedido_id;
    }

    public Date getData() {
        return data;
    }

    public CarrinhoCompras getCarrinho() {
        return carrinho;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setCarrinho(CarrinhoCompras carrinho) {
        this.carrinho = carrinho;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    // @Override
    public void cancelarPedido() {
        estado.cancelarPedido();
    }

    //@Override
    public void finalizarPedido() {
        estado.finalizarPedido();
    }
}
