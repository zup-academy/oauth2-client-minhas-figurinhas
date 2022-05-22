package br.com.zup.edu.freemium.albuns;

import br.com.zup.edu.freemium.client.cadastro.NovaFigurinhaRequest;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NovaFigurinhaFremiumRequest {

    @NotBlank
    @Size(max = 2000)
    private String descricao;

    @URL
    @NotNull
    private String enderecoDaImagem;

    public NovaFigurinhaFremiumRequest(String descricao, String enderecoDaImagem) {
        this.descricao = descricao;
        this.enderecoDaImagem = enderecoDaImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEnderecoDaImagem() {
        return enderecoDaImagem;
    }

    @Override
    public String toString() {
        return "NovaFigurinhaFremiumRequest{" +
                "descricao='" + descricao + '\'' +
                ", enderecoDaImagem='" + enderecoDaImagem + '\'' +
                '}';
    }

    public NovaFigurinhaRequest toModel() {
        return new NovaFigurinhaRequest(descricao, enderecoDaImagem);
    }
}
