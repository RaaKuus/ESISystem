/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.utils;

/**
 *
 * @author Bruno
 */
public interface HashResolver {
    public String gerarSalt();
    public String gerarMd5(String password, String salt);
}
