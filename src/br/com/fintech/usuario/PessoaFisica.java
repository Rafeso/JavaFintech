package br.com.fintech.usuario;
/**
 * Subclasse PessoaFisica filha da Superclasse Pessoa
 * @author Rafael Feitosa
 * @version 1.0
 * @see Pessoa
 */
public class PessoaFisica extends Pessoa {

    private String cpf;

    public PessoaFisica(int codPessoa, String nome, String endereco, String fone, char status) {
        super(codPessoa, nome, endereco, fone, status);
    }

    /**
     * @return CPF registrado
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Altera o valor de cpf
     * @param cpf que deseja registrar
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Metodo para gravar o usuário
     */
    @Override
    public void gravarusuario() {
        System.out.println("Gravando Pessoa Física");
    }
    /**
     * @return Cadastro do usuário
     */
    @Override
    public String visualizarCadastro() {
        return "Pessoa Física" + super.getNome() + " -CPF" + this.getCpf() + "Endereço" + super.getEndereco()
                + "Telefone" + super.getFone() + "Status" + super.getStatus();
    }

}
