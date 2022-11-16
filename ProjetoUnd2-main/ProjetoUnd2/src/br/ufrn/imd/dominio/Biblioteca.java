package br.ufrn.imd.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
	
	
	private List<ItemAcervo> itens; 
    
    public void addAcervo(ItemAcervo item) {
        if(itens == null)
           itens = new ArrayList<>();
            itens.add(item);
    
    }
   
    
    public List<ItemAcervo> listarItensCadastrados() {
		return itens;
	}
    
    public void imprimeCadastrados() {
    	for(ItemAcervo item : listarItensCadastrados()) {
    		System.out.println(item);
    	}
    }
    
    public void listarItensDisponiveis() {
    	System.out.println("Itens disponíveis para alugar");
    	for (ItemAcervo item : listarItensCadastrados()) {
    		if( item.isDisponivel() == true) {
    			System.out.println(item);
    		}
    	}
    }
    
    public void fazerAluguel(String nome) {
    	for (ItemAcervo item : listarItensCadastrados()) {
    		if(item.getTitulo().equals(nome) && item.isDisponivel() == true) {
    			item.setDisponivel(false);
    			item.setQtdCopias(item.getQtdCopias() -1);
    			System.out.println("Item alugado com sucesso");
    		}
    		else{
    			System.out.println("nomes diferentes");
    		};
    	}
    	
    }
    
    public void fazerDevolucao(String nome) {
    	for (ItemAcervo item : listarItensCadastrados()) {
    		if(item.getTitulo().equals(nome)) {
    			item.setDisponivel(true);
    			item.setQtdCopias(item.getQtdCopias() + 1);
    			System.out.println("Item devolvido com sucesso");
    			
    		}
    	}
    }
	
    public void verificaHeranca(String nome) {
    	for (ItemAcervo item : listarItensCadastrados()) {
    		if(item.getTitulo().equals(nome)) {
    			if(item instanceof Livro) {
    				System.out.println("eh um livro");
    			}
    			if(item instanceof Artigo) {
    				System.out.println("eh um artigo");
    			}
    			if(item instanceof Revista) {
    				System.out.println("eh uma revista");
    			}
    		}
    	}
    }
	
	public void esclusivo() {
		
	}
	public Date prevEntrega() {
		return null;
	}
	public Endereco localizacao() {
		return null;
	}
}
