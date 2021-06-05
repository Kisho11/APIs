package com.grokonez.jwtauthentication.security.services;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.grokonez.jwtauthentication.model.Crop;
import com.grokonez.jwtauthentication.model.User;
import com.grokonez.jwtauthentication.repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CropService {

    @Autowired
    private CropRepository cropRepository;

    public List<Crop> getAllCrops(){
        return cropRepository.findAll();
    }
}