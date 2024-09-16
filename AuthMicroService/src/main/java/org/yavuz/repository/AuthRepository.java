package org.yavuz.repository;
import org.yavuz.entity.Auth;

public interface AuthRepository extends MyGenericRepo<Auth, Long> {
    Auth findByUsername(String username);

}
