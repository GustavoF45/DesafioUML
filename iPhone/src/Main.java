//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        iPhone meuiPhone = new iPhone();

        // Testando o Reprodutor Musical
        meuiPhone.selecionarMusica("Fear Of The Dark - Iron Maiden");
        meuiPhone.tocar();
        meuiPhone.pausar();

        // Testando o Aparelho Telefônico
        meuiPhone.ligar("123456-7890");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        // Testando o Navegador na Internet
        meuiPhone.exibirPagina("www.google.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}
