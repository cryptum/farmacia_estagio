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
public class AssistenciaM {
    private int id;
    private String nome_cliente;
    private String medicamento;
    private String data_atendimento;
    private String quadro_acontecido;
    private String atendente;

    public AssistenciaM(int id, String nome_cliente, String medicamento, String data_atendimento, String quadro_acontecido, String atendente) {
        this.id = id;
        this.nome_cliente = nome_cliente;
        this.medicamento = medicamento;
        this.data_atendimento = data_atendimento;
        this.quadro_acontecido = quadro_acontecido;
        this.atendente = atendente;
    }

    public AssistenciaM() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getData_atendimento() {
        return data_atendimento;
    }

    public void setData_atendimento(String data_atendimento) {
        this.data_atendimento = data_atendimento;
    }

    public String getQuadro_acontecido() {
        return quadro_acontecido;
    }

    public void setQuadro_acontecido(String quadro_acontecido) {
        this.quadro_acontecido = quadro_acontecido;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }
}
