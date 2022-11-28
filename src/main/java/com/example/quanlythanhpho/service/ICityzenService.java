package com.example.quanlythanhpho.service;

import com.example.quanlythanhpho.model.city;

import java.util.Optional;

public interface ICityzenService {
    Iterable<city> findAll();

    Optional<city> findById(Long id);

    city save(city city);

    void remove(Long id);
}
