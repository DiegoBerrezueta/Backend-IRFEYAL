package com.example.demo.services;

import java.util.List;

import com.example.demo.models.entity.Provincia;




public interface ProvinciaServicesI  {

	

	public List<Provincia> findAll();
    public List<Provincia> saveProv();
    public List<Provincia> deleteProv();
    public List<Provincia> updateProv();
}
