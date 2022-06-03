package com.project.service;

import com.project.domain.Adress;

import service.project.repository.AdressRepository;

public class AdressServiceImpl implements IAdressService {

	private final static AdressRepository repo = new AdressRepository();

	@Override
	public void createAdress(Adress adress) {
		repo.createAdress(adress);
	}

	@Override
	public void removeAdress(Adress adress) {
		repo.removeAdress(adress);
	}

	@Override
	public Adress findByIdAdress(int id) {
		return repo.findByIdAdress(id);
	}
	
	

}
