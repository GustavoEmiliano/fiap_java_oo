package executaveis;

import br.com.fiap.banco.Cliente;
import br.com.fiap.banco.Conta;

public class CriaConta {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Gustavo", "522.211.146-81", "Rua Odorico Mendes", "11-958559810", "23/12/2024");
        Cliente cliente1 = new Cliente("Rodrigo", "400.211.242-42", "Rua Sabonete", "11 972424543", "11/12/24");
        Conta conta1 = new Conta(500352, cliente);
        Conta conta2 = new Conta(414124, cliente1);

        conta1.depositar(20.0);
        conta1.transferir(5, conta2);

        System.out.println(conta1.consultarSaldo());
        System.out.println(conta2.consultarSaldo());

        conta2.sacar(2.0);
        System.out.println(conta2.consultarSaldo());

        System.out.println(conta1.consultarSaldo());
        System.out.println(conta2.consultarSaldo());

        conta1.exibirInformacoes();
    }
}
