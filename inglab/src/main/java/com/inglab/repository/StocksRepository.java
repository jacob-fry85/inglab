package com.inglab.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inglab.entity.Stocks;

@Repository
public interface StocksRepository extends CrudRepository <Stocks, Integer>{

}
