package Questao1;

public class Main {
    public static void main(String[] args){

        Contato contato1=new Contato();
        Contato contato2=new Contato();
        Agenda agenda1=new Agenda();

        contato1.nome="lucas";
        contato2.nome="joana";
        contato1.numero="999000000";
        contato2.numero="999000001";
        contato1.email="lucasmuto@id.uff.br";
        contato2.email="joana@gmail.com";

        agenda1.adicionarContato(contato1);
        agenda1.imprimir();
        System.out.println();

        agenda1.adicionarContato(contato2);
        agenda1.imprimir();
        System.out.println();

        agenda1.removerContato(contato1);
        agenda1.imprimir();





    }
}
