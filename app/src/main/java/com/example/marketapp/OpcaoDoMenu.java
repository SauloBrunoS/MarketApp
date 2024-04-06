package com.example.marketapp;

public class OpcaoDoMenu {

    private String nomeOpcao;
    private String descricaoOpcao;
    private int imagemOpcao;

    public OpcaoDoMenu (String nomeOpcao, String descricaoOpcao, int imagemOpcao){
        this.nomeOpcao = nomeOpcao;
        this.descricaoOpcao = descricaoOpcao;
        this.imagemOpcao = imagemOpcao;
    }

    public String getNomeOpcao() {
        return nomeOpcao;
    }

    public void setNomeOpcao(String nomeOpcao) {
        this.nomeOpcao = nomeOpcao;
    }

    public String getDescricaoOpcao() {
        return descricaoOpcao;
    }

    public void setDescricaoOpcao(String descricaoOpcao) {
        this.descricaoOpcao = descricaoOpcao;
    }

    public int getImagemOpcao() {
        return imagemOpcao;
    }

    public void setImagemOpcao(int imagemOpcao) {
        this.imagemOpcao = imagemOpcao;
    }
}
