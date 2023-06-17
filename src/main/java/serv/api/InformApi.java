package serv.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import serv.dto.JwtMoviesDto;
import serv.dto.JwtResponseTicketDto;
import serv.dto.JwtSessionsDto;
import serv.dto.TicketRequestDto;

@RequestMapping("/kino")
public interface InformApi {
    @PostMapping("/tickets")
    @ResponseStatus(HttpStatus.OK)
    JwtResponseTicketDto getTicket(@RequestBody TicketRequestDto ticketRequest);
    @GetMapping("/movies")
    @ResponseStatus(HttpStatus.OK)
    JwtMoviesDto getMovies();
    @GetMapping("/showtimes")
    @ResponseStatus(HttpStatus.OK)
    JwtSessionsDto getSessions();

}
