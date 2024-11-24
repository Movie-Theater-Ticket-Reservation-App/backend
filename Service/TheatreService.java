package com.acmeplex.movieticketreservation.Service;

import com.acmeplex.movieticketreservation.Model.Theatre;
import com.acmeplex.movieticketreservation.Repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    @Autowired
    private TheatreRepository theatreRepository;

    public List<Theatre> getAllTheatres() {
        return theatreRepository.findAll();
    }
}
