/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadil.produk.service;

import com.fadil.produk.entity.Produk;
import com.fadil.produk.repository.ProdukRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class ProdukService {
    @Autowired
    private ProdukRepository produkRepository;
    
    public List<Produk>getAll(){
        return produkRepository.findAll();
    }
    
    public Produk getProduk(Long id){
        return produkRepository.findById(id).get();
    }
    
    @Transactional
    public void insert(Produk produk){
        produkRepository.save(produk);
    }
    

}

