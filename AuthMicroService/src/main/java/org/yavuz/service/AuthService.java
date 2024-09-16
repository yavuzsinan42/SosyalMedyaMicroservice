package org.yavuz.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.yavuz.dto.request.RegisterRequestDto;
import org.yavuz.dto.response.LoginResponseDto;
import org.yavuz.entity.Auth;
import org.yavuz.repository.AuthRepository;

@Service
@RequiredArgsConstructor
public class AuthService {
private final AuthRepository repository;

    public Auth register(RegisterRequestDto dto) {
  return repository.save(Auth.builder()
                    .username(dto.getUsername())
                    .password(dto.getPassword())
                    .email(dto.getEmail())
            .build());
    }

    public Boolean login(LoginResponseDto dto) {
        return  repository.existsByUsernameAndPassword(dto.getUsername(), dto.getPassword());
    }
}
