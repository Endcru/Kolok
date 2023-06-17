package serv.api;

import io.jsonwebtoken.Claims;
import lombok.NonNull;

import java.util.Date;

public interface TokenProvider {
    Date dateAccessToken();
    boolean validateAccessToken(@NonNull String accessToken);
    boolean validateRefreshToken(@NonNull String refreshToken);
    Claims getAccessClaims(@NonNull String token);
    Claims getRefreshClaims(@NonNull String token);
}
