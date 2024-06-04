/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedido;

import CarrinhoCompras.CarrinhoCompras;
import Pagamento.*;
import java.util.Date;

public class PedidoProxy extends Pedido{
    private int pedidoP_id;
    private Pedido pedido;
    private CarrinhoCompras carrinho;
    private Pagamento pag;
    private EstadoPedido estado;

    public PedidoProxy(int pedidoP_id, Date date, CarrinhoCompras carrinho, Pagamento pag) {

        super(pedidoP_id, new Date(), carrinho, pag);

        this.pedidoP_id = pedidoP_id;
        this.carrinho = carrinho;
        this.pag = pag;
        estado = new Aberto(this);

    }

    public void setPedidoP_id(int pedidoP_id) {
        this.pedidoP_id = pedidoP_id;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void setCarrinho(CarrinhoCompras carrinho) {
        this.carrinho = carrinho;
    }

    public void setPag(Pagamento pag) {
        this.pag = pag;
    }

    @Override
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public int getPedidoP_id() {
        return pedidoP_id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    @Override
    public CarrinhoCompras getCarrinho() {
        return carrinho;
    }

    public Pagamento getPag() {
        return pag;
    }

    @Override
    public EstadoPedido getEstado() {
        return estado;
    }
}
