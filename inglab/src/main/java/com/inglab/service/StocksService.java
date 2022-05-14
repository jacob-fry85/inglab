package com.inglab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inglab.entity.Stocks;
import com.inglab.repository.StocksRepository;

import java.util.List;

import javax.transaction.Transactional;

@Service
@Transactional
public class StocksService {
	public static final int USERS_PER_PAGE = 5; 

	@Autowired
	private StocksRepository stocksRepo;
	
//	public List<Role> listRoles(){  
//		return (List<Role>) roleRepo.findAll();
//	}
	
	public Stocks saveGainerLoser(Stocks stocks) {
		return stocksRepo.save(stocks);		
	}
}
