package com.example.LongHotel.repository;

import com.example.LongHotel.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    //    @Query(value = "Select * from user where username = :0 and password = :1", nativeQuery = true)
    Optional<UserEntity> findByUsernameAndPassword(String username, String password);
}
