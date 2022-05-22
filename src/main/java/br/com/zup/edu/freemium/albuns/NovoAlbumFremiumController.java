package br.com.zup.edu.freemium.albuns;

import br.com.zup.edu.freemium.client.MinhasFigurinhasClient;
import br.com.zup.edu.freemium.client.cadastro.NovoAlbumRequest;
import feign.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class NovoAlbumFremiumController {

    @Autowired
    private MinhasFigurinhasClient client;

    public ResponseEntity<?> cadastra(@RequestBody @Valid NovoAlbumFremiumRequest request,
                                      UriComponentsBuilder uriBuilder) {

        NovoAlbumRequest novoAlbum = request.toModel();
        Response novoAlbumResponse = client.cadastra(novoAlbum);

        Long albumId = getAlbumId(novoAlbumResponse);

        URI location = uriBuilder.path("/api/albuns/{id}")
                .buildAndExpand(albumId)
                .toUri();

        return ResponseEntity
                .created(location).body(client.detalha(albumId));
    }

    private Long getAlbumId(Response novoAlbumResponse) {

        String location = novoAlbumResponse.headers()
                .get("Location").stream().findFirst().get();

        String pathId = location.substring(location.lastIndexOf("/") + 1);
        return Long.parseLong(pathId);
    }
}
