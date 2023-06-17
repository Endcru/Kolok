package serv.dto;

import lombok.Getter;
import lombok.Setter;
import serv.models.Session;

import java.util.List;

@Setter
@Getter
public class JwtSessionsDto {
    public List<Session> sessions;

    public JwtSessionsDto(List<Session> sessions) {
        this.sessions = sessions;
    }
}
