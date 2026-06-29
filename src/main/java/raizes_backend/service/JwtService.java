package raizes_backend.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Date;

@Service
public class JwtService {

    private static final String SECRET_KEY =
            "cmFpemVzLWJhY2tlbmQtc2VjcmV0LWtleS0xMjM0NTY=";


    private Key obterChave() {

        // Decodifica a chave Base64 e cria a chave utilizada pelo JWT
        return new SecretKeySpec(
                java.util.Base64.getDecoder()
                        .decode(SECRET_KEY),
                SignatureAlgorithm.HS256.getJcaName()
        );
    }


    public String gerarToken(String email) {

        // Gera um token válido por uma hora
        return Jwts.builder()
                .subject(email)
                .issuedAt(new Date())
                .expiration(
                        new Date(
                                System.currentTimeMillis()
                                        + 1000 * 60 * 60
                        )
                )
                .signWith(obterChave())
                .compact();
    }
}