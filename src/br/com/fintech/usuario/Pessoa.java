package br.com.fintech.usuario;
/**
 * Classe que abstrai uma Pessoa
 * @author Rafael Feitosa
 * @version 1.0
 */
public abstract class Pessoa {
    private int codPessoa;
    private String nome;
    private String endereco;
    private String fone;
    private char status;

    public Pessoa(){

    }

    public Pessoa(int codPessoa, String nome, String endereco, String fone, char status) {
        this.codPessoa = codPessoa;
        this.nome = nome;
        this.endereco = endereco;
        this.fone = fone;
        this.status = status;
    }

    public int getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
    }

    /**
     *
     * @return Nome registrado
     */
    public String getNome() {
        return nome;
    }
    /**
     *
     * @param nome o nome do usuário
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return Endereço registrado
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Altera o endereço do usuário
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     *
     * @return Telefone registrado
     */
    public String getFone() {
        return fone;
    }

    /**
     * Registra o numero de telefone
     * @param fone
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     *
     * @return status
     * @see inativarUsuario
     * @see ativarUsuario
     */
    public char getStatus() {
        return status;
    }

    /**
     * Altera o valor de status
     * @param status
     * @see inativarUsuario
     * @see ativarUsuario
     */
    public void setStatus(char status) {
        this.status = status;
    }

    /**
     * Metodo abstrato para retornar um valor ao registrar o usuário
     */
    public abstract void gravarusuario();

    /**
     * Metodo abstrato para visualizar cadastro do usuário
     */
    public abstract String visualizarCadastro();

    /**
     * Altera o valor do usuário para 'A' que representa 'Ativo'
     */
    public void ativarUsuario(){
        this.status = 'A';
    }

    /**
     * Altera o valor de status para 'I' que representa 'Inativo'
     */
    public void inativarUsuario(){
        this.status = 'I';
    }


}



