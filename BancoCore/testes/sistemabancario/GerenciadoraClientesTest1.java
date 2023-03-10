package sistemabancario;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Classe de teste para testar operacoes de GerenciadoraClientes{@link GerenciadoraClientes}
 * 
 * @author Gabriel Custodio dos Santos
 * @date 10/03/2023
 */

public class GerenciadoraClientesTest1 {
	
	private GerenciadoraClientes gerClientes;

	/**
	 * Teste unitario basico de pesquisa cliente a partir do seu ID
	 * 
	 * @author Gabriel Custodio dos Santos
	 * @date 10/03/2023
	 */
	@Test
	public void testPesquisaCliente() {
		//Criacao do Cenario
		Cliente cliente1 = new Cliente(1, "João da Silva", 46, "joaodasilva@gmail.com", 1, true);
		Cliente cliente2 = new Cliente(2, "Maria da Silva", 11, "mariadasilva@gmail.com",1, true);
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		
		gerClientes = new GerenciadoraClientes(clientes);
		
		//execucao do teste
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		//verificacao do resultado
		assertThat(cliente.getId(), is(1));
	}
}
