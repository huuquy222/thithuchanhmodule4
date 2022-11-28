package com.example.quanlythanhpho.service;

import com.example.quanlythanhpho.model.city;
import com.example.quanlythanhpho.repository.ICityReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityzenService implements ICityzenService {
        @Autowired
        private ICityReponsitory cityReponsitory;

        @Override
        public Iterable<city> findAll() {
            return cityReponsitory.findAll();
        }

        @Override
        public Optional<city> findById(Long id) {
            return cityReponsitory.findById(id);
        }

        @Override
        public city save(city smartPhone) {
            return cityReponsitory.save(smartPhone);
        }

        @Override
        public void remove(Long id) {
            cityReponsitory.deleteById(id);
        }
}
