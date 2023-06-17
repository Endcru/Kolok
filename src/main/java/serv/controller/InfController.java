package serv.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import serv.api.InformApi;
import serv.dto.JwtMoviesDto;
import serv.dto.JwtResponseTicketDto;
import serv.dto.JwtSessionsDto;
import serv.dto.TicketRequestDto;
import serv.models.Film;
import serv.models.Session;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequiredArgsConstructor
public class InfController implements InformApi {
    private ArrayList<Film> films = new ArrayList<>();
    private ArrayList<Session> sessions = new ArrayList<>();

    @Override
    public JwtResponseTicketDto getTicket(TicketRequestDto ticketRequest) {
        if(sessions.size() >= ticketRequest.id){
            return new JwtResponseTicketDto(null);
        }
        return new JwtResponseTicketDto("No such Session");
    }

    @Override
    public JwtMoviesDto getMovies() {
        return new JwtMoviesDto(films);
    }

    @Override
    public JwtSessionsDto getSessions() {
        return new JwtSessionsDto(sessions);
    }
}
