public class Filial extends PJ
{
    protected Integer ID;
    protected String endereco;

    public Filial(String denominacao_social, String endereco)
    {
        this.denominacao_social = denominacao_social;
        this.endereco = endereco;
    }

    @Override
    public String getDados()
    {
        return "Filial: " + denominacao_social + ", Endereço: " + endereco;
    }
}
