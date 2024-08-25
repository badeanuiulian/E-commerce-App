package com.example.ECOM.repositories;

import com.example.ECOM.model.AppRole;
import com.example.ECOM.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}