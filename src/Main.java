public class Main
{
    public static void main(String[] args)
    {
        // instanciando um cliente
        Cliente Alejandro = new Cliente("Bruno Alejandro", "brunim_ale@gmail.com");

        // instanciando uma filial e um fornecedor
        Filial filial1 = new Filial("LTDA", "Parquelandia");
        Fornecedor Amazon = new Fornecedor("LTDA", "12.345.678/0001-90");

        // instanciando um funcinario e um estoque
        Funcionario Matuê = new Funcionario("Matheus Brasileiro", "matheuzim420@gmail.com", 2000.00, "Caixa");
        Estoque estoque = new Estoque();

        // // instanciando produtos
        Produto farinha = new Produto("Farinha Dona Benta", 8.00, 10, Amazon);
        Produto feijao = new Produto("Feijão Carioca", 10.00, 6, Amazon);

        // adicionando produtos no estoque
        System.out.println("====== Adicionando produtos no estoque ======");
        estoque.adicionarProduto(farinha);
        estoque.adicionarProduto(feijao);
        System.out.println();

        // realizando uma venda
        Venda venda = new Venda("24/09/2024", Alejandro, filial1, Matuê, estoque);
        venda.adicionarProduto("Farinha Dona Benta", 2);
        venda.adicionarProduto("Feijão Carioca", 3);
        System.out.println();

        System.out.println("===== REALIZAR VENDA ======");
        venda.finalizarVenda();
    }
}