/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author NUPSI 04
 */
public class ClienteM {
    private int id;
    private String nome;
    private String telefone;
    private String data_nascimento;

    public ClienteM(int id, String nome, String telefone, String data_nascimento) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
    }

    public ClienteM() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
