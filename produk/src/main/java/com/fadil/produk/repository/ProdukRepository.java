/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fadil.produk.repository;

import com.fadil.produk.entity.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository; 
/**
 *
 * @author LENOVO
 */
public interface ProdukRepository extends JpaRepository<Produk, Long> {

}
