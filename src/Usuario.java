public abstract class Usuario
{
    protected int id;
    protected String nome;
    protected String email;

    protected void getDados() {
        System.out.println("Nome: " + nome + "\nEmail: " + email);
    }
}
