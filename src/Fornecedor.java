public class Fornecedor extends PJ
{
    protected Integer ID;
    private String cnpj;

    public Fornecedor(String denominacao_social, String cnpj)
    {
        this.denominacao_social = denominacao_social;
        this.cnpj = cnpj;
    }

    @Override
    public String getDados()
    {
        return "Fornecedor: " + denominacao_social + ", CNPJ: " + cnpj;
    }
}