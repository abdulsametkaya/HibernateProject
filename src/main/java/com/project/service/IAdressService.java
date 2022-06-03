package com.project.service;

import com.project.domain.Adress;

public interface IAdressService {

	public void createAdress(Adress adress);
	public void removeAdress(Adress adress);
	public Adress findByIdAdress(int id);

	
}
