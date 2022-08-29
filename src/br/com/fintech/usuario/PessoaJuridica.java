package br.com.fintech.usuario;
/**
 * Subclasse PessoaJuridica filha da Superclasse Pessoa
 * @author Rafael Feitosa
 * @version 1.0
 * @see Pessoa
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public PessoaJuridica(int codPessoa, String nome, String endereco, String fone, char status) {
        super(codPessoa, nome, endereco, fone, status);
    }
    /**
     * @return Cnpj registrado
     */
    public String getCnpj() {
        return cnpj;
    }
    /**
     * Altera o valor de cnpj
     * @param cnpj que deseja registrar
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    /**
     * Metodo para gravar o usuário
     */
    @Override
    public void gravarusuario() {
        System.out.println("Gravando Pessoa Juridica");
    }
    /**
     * @return Cadastro do usuário
     */
    @Override
    public String visualizarCadastro() {
        return "Pessoa Juridica" + super.getNome() + "-CNPJ" + this.getCnpj() + "Endereço" + super.getEndereco()
                + "Telefone" + super.getFone() + "Status" + super.getStatus();
    }


}
