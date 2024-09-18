package org.yavuz.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@lombok.Builder
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Data
@Document
public class UserProfile {
    @Id
    String id;
    Long authId;
    String username;
    String name;
    String surname;
    String email;
    String phone;
    String avatar;
    String instagram;
    String twitter;
    Boolean isActive;
    Long createAt;
}
