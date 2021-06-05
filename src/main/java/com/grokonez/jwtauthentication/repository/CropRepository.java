package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Crop;
import com.grokonez.jwtauthentication.model.Role;
import com.grokonez.jwtauthentication.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CropRepository extends JpaRepository<Crop, Long> {
}