package br.com.eduardorodrigues.listadesejos;

public class Desejo {
    private String nomeDesejo;
    private float preco;
    private boolean urgente;

    public Desejo(String nomeDesejo, float preco, boolean urgente) {
        this.setPreco(preco);
        this.setNomeDesejo(nomeDesejo);
        this.setUrgente(urgente);
    }

    public String getNomeDesejo() {
        return nomeDesejo;
    }

    public void setNomeDesejo(String nomeDesejo) {
        this.nomeDesejo = nomeDesejo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }
}
