package com.booking.service.impl;

import com.booking.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.security.Principal;

@Service
@RequiredArgsConstructor
public class TokenServiceImpl implements TokenService {

    @Override
    public String signUp(String value) {
        return null;
    }

    @Override
    public String welcome(Principal principal, Model model) {
        return null;
    }
}