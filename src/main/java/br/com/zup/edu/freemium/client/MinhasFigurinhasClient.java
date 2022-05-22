package br.com.zup.edu.freemium.client;

import br.com.zup.edu.freemium.client.cadastro.NovoAlbumRequest;
import br.com.zup.edu.freemium.client.detalhes.DetalhesDoAlbumResponse;
import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@FeignClient(
    name = "livrariaClient",
    url = "${integrations.resource-server.url}"
)
public interface MinhasFigurinhasClient {

    @PostMapping("/api/albuns")
    public Response cadastra(@RequestBody @Valid NovoAlbumRequest request);

    @GetMapping("/api/albuns/{albumId}")
    public DetalhesDoAlbumResponse detalha(@PathVariable Long albumId);

}
