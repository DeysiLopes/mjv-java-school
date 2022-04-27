package com.mjv.agualuz.notification.app;

import java.time.LocalDateTime;

import com.mjv.agualuz.notification.model.Cadastro;
import com.mjv.agualuz.notification.model.Contrato;
import com.mjv.agualuz.notification.model.Endereco;

public class SistemaAguaLuzNotification {
	public static void main(String [] args) {
		Contrato contrato = new Contrato();
		contrato.setData(LocalDateTime.of(2022, 2, 21, 16, 0));
		contrato.setNumeroProtocolo(2022025687L);
		contrato.setServico("Agua");
		contrato.setValor(127.83);
		
		Cadastro cliente = new Cadastro();
		contrato.setCliente(cliente);
		
		cliente.setCpf("23476598727");
		cliente.setNome("Gleyson Sampaio");
		
		Endereco endereco = new Endereco();
		cliente.setEndereco(endereco);
		
		endereco.setBairro("Santo Antonio");
		endereco.setCep("27310657");
		endereco.setCidade("São Paulo");
		endereco.setCompleto("Bloco C");
		endereco.setLogradouro("Rua das Marias");
		endereco.setNumero("243");
		endereco.setEstado("SP");
		
		
		
	}
}
