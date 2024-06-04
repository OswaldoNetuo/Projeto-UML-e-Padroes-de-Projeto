/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarrinhoCompras;

import Pessoa.Cliente;
import java.util.ArrayList;

public class CarrinhoCompras {
    private ArrayList<ItemPedido> itens;
    private Cliente cliente;
    
    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
        this.cliente = cliente;
    }
    
    public void adicionarProduto(ItemPedido i){
        this.itens.add(i);
    }
    
    public void removerProduto(int id){
        ItemPedido itemParaRemover = null;
        for (ItemPedido item : itens) {
            if (item.getProduto().getProduto_id() == id) {
                itemParaRemover = item;
                break;
            }
        }
        if (itemParaRemover != null) {
            this.itens.remove(itemParaRemover);
        }
    }
    
    public void mostrarCarrinho(){
        System.out.println("\nItens no carrinho\n");
        for(ItemPedido produtolist : itens){
            produtolist.getProduto().mostrarProduto();
            System.out.println("Quantidade:" + produtolist.getQuantidade());
            System.out.println("\n-----------\n");
        } 
        System.out.println("\n\nTotal:" + calcularTotal());
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }
    
    public double calcularTotal(){
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return total;
    }
    
}
