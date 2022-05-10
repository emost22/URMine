package com.urmine.db.repository;

import com.urmine.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * User 관련 query문 생성을 위한 JpaRepository
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
