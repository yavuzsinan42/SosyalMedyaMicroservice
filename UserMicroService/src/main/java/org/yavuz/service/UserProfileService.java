package org.yavuz.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.yavuz.document.UserProfile;
import org.yavuz.dto.request.CreateUserRequestDto;
import org.yavuz.repository.UserProfileRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final UserProfileRepository repository;

    public void createUser(CreateUserRequestDto dto) {
        repository.save(UserProfile.builder()
                        .authId(dto.getAuthId())
                        .username(dto.getUsername())
                        .email(dto.getEmail())
                .build());
    }

    public List<UserProfile> getAll(){
        return repository.findAll();
    }
}
