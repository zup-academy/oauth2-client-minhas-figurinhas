package br.com.zup.edu.freemium.client.cadastro;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

public class NovoAlbumRequest {

    @NotBlank
    private String titulo;

    @NotBlank
    @Size(max = 2000)
    private String descricao;

    @Valid
    @NotEmpty
    private List<NovaFigurinhaRequest> figurinhas;

    public NovoAlbumRequest(String titulo, String descricao, List<NovaFigurinhaRequest> figurinhas) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.figurinhas = figurinhas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<NovaFigurinhaRequest> getFigurinhas() {
        return figurinhas;
    }

}
