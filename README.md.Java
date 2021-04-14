package cadastrocliente;

import Cliente.Cliente;


public class CadastroCliente {

    public static void main(String[] args) {
        
        Cliente cli = new Cliente();
        
        cli.codigo = 10 ;
        cli.nome = "Marcos";
        cli.cpf = "088542212301";
        cli.endereco = "Av. 1° de maio";
        cli.cep = 888352490;
        cli.email = "afa@gmail.com";
        cli.telefone = "33523443";
        cli.aposentado = false;
        
        //System.out.println("Nome: "+cli.nome);
       // System.out.println("cpf: "+cli.cpf);
       
       //Array de Clientes
       Cliente[] listaDeClientes = new Cliente[3];
       
       listaDeClientes[0] = cli;
       cli = new Cliente();
       cli.nome = "Deivide";
       cli.cpf = "015212323";
       listaDeClientes[1] = cli;
       
       
       cli = new Cliente();
       cli.nome = "Bruno";
       cli.cpf = "48845656790";
       listaDeClientes[2] = cli;
       
       
        for (int i = 0; i <listaDeClientes.length; i++) {
            cli = listaDeClientes[i];
            
            System.out.println("Nome: "+cli.nome);
            System.out.println("CPF: "+cli.cpf);
            System.out.println("email: "+cli.email);
            System.out.println("");
        }
       
        
        
        
        
       
    }
    
}
