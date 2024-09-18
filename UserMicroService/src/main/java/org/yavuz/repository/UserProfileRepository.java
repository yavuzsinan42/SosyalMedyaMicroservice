package org.yavuz.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.yavuz.document.UserProfile;

public interface UserProfileRepository  extends MongoRepository<UserProfile, String> {

}
