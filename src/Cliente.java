public class Cliente extends Usuario
{
    private static int idCliente = 0;

    public Cliente(String nome, String email) {
        this.id = idCliente++;
        this.nome = nome;
        this.email = email;
    }

    @Override
    protected void getDados() {
        super.getDados();
        System.out.println("ID cliente: " + this.id);
    }

    public String getNome() {
        return nome;
    }
}