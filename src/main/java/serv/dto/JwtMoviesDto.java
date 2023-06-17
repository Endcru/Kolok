package serv.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import serv.models.Film;

import java.util.List;


@Getter
@AllArgsConstructor
public class JwtMoviesDto {
    private List<Film> films;
}
