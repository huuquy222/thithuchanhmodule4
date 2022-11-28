package com.example.quanlythanhpho.repository;

import com.example.quanlythanhpho.model.city;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICityReponsitory extends CrudRepository<city, Long > {

}
