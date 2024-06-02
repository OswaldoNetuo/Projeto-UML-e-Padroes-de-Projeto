/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedido;

import CarrinhoCompras.CarrinhoCompras;
import Pagamento.Pagamento;

public class PedidoProxy implements Pagamento{
    private int pedidoP_id;
    private Pedido pedido;
    private CarrinhoCompras carrinho;
    private Pagamento pag;
    private EstadoPedido estado;

    @Override
    public void pagar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setPedidoP_id(int pedidoP_id) {
        this.pedidoP_id = pedidoP_id;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setCarrinho(CarrinhoCompras carrinho) {
        this.carrinho = carrinho;
    }

    public void setPag(Pagamento pag) {
        this.pag = pag;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public int getPedidoP_id() {
        return pedidoP_id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public CarrinhoCompras getCarrinho() {
        return carrinho;
    }

    public Pagamento getPag() {
        return pag;
    }

    public EstadoPedido getEstado() {
        return estado;
    }
}
