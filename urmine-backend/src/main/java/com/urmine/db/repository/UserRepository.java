package com.urmine.db.repository;

import com.urmine.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*
 * User 관련 query문 생성을 위한 JpaRepository
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    /*
     * accountEmail을 기준으로 유저를 검색하는 메소드
     */
    Optional<User> findUserByAccountEmail(String accountEmail);
}
