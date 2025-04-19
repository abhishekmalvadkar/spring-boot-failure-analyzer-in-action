package com.amalvadkar.sbfaia.repo;

import com.amalvadkar.sbfaia.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
}
