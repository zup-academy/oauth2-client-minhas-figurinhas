package br.com.zup.edu.freemium.albuns;

import br.com.zup.edu.freemium.client.detalhes.DetalhesDoAlbumResponse;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class AlbumFreemiumResponse {

    private Long id;
    private String planoContratado = "FREEMIUM";
    private String titulo;
    private String descricao;
    private String dono;
    private List<FigurinhaFreemiumResponse> figurinhas;

    public AlbumFreemiumResponse(DetalhesDoAlbumResponse album) {
        this.id = album.getId();
        this.titulo = album.getTitulo();
        this.descricao = album.getDescricao();
        this.dono = album.getDono();
        this.figurinhas = album.getFigurinhas()
                .stream().map(FigurinhaFreemiumResponse::new)
                .collect(toList());
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDono() {
        return dono;
    }

    public List<FigurinhaFreemiumResponse> getFigurinhas() {
        return figurinhas;
    }

    public String getPlanoContratado() {
        return planoContratado;
    }

    @Override
    public String toString() {
        return "AlbumFreemiumResponse{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dono='" + dono + '\'' +
                ", figurinhas=" + figurinhas +
                '}';
    }
}
