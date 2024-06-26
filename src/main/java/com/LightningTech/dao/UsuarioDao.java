/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LightningTech.dao;
import com.LightningTech.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Maik
 */


public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}