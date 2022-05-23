package br.com.zup.edu.freemium.albuns;

import br.com.zup.edu.freemium.client.cadastro.NovaFigurinhaRequest;
import br.com.zup.edu.freemium.client.cadastro.NovoAlbumRequest;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class NovoAlbumFremiumRequest {

    @NotBlank
    private String titulo;

    @NotBlank
    @Size(max = 2000)
    private String descricao;

    @Valid
    @Size(min = 1, max = 3)
    private List<NovaFigurinhaFremiumRequest> figurinhas;

    public NovoAlbumFremiumRequest(String titulo, String descricao, List<NovaFigurinhaFremiumRequest> figurinhas) {
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

    public List<NovaFigurinhaFremiumRequest> getFigurinhas() {
        return figurinhas;
    }

    @Override
    public String toString() {
        return "NovoAlbumFremiumRequest{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", figurinhas=" + figurinhas +
                '}';
    }

    public NovoAlbumRequest toModel() {

        List<NovaFigurinhaRequest> _figurinhas = figurinhas.stream()
                                    .map(NovaFigurinhaFremiumRequest::toModel)
                                    .collect(toList());

        return new NovoAlbumRequest(titulo, descricao, _figurinhas);
    }
}
