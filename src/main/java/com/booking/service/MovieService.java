package com.booking.service;

import com.booking.models.Movie;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

public interface MovieService {

    String getMovies(final Model model);

    String addMovie(final Movie movie, final BindingResult result, final Model model);

    String showUpdateFormMovie(final long id, final Model model);

    String updateMovie(final long id, final Movie movie);

    String deleteMovie(final long id, final Model model);

}