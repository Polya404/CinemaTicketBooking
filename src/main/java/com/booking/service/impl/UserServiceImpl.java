package com.booking.service.impl;

import com.booking.models.User;
import com.booking.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.security.Principal;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Override
    public String login(Principal principal) {
        return null;
    }

    @Override
    public String register(Model model) {
        return null;
    }

    @Override
    public String registerSuccessfully(User user, BindingResult bindingResult) {
        return null;
    }
}