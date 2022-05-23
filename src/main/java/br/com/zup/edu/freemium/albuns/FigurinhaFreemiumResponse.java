package br.com.zup.edu.freemium.albuns;

import br.com.zup.edu.freemium.client.detalhes.DetalheDaFigurinhaResponse;

public class FigurinhaFreemiumResponse {

    private Long id;
    private String descricao;
    private String enderecoDaImagem;

    public FigurinhaFreemiumResponse(DetalheDaFigurinhaResponse figurinha) {
        this.id = figurinha.getId();
        this.descricao = figurinha.getDescricao();
        this.enderecoDaImagem = figurinha.getEnderecoDaImagem();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEnderecoDaImagem() {
        return enderecoDaImagem;
    }

    public void setEnderecoDaImagem(String enderecoDaImagem) {
        this.enderecoDaImagem = enderecoDaImagem;
    }

    @Override
    public String toString() {
        return "FigurinhaFreemiumResponse{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", enderecoDaImagem='" + enderecoDaImagem + '\'' +
                '}';
    }
}
