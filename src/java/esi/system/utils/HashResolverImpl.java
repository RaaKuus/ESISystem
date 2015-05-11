/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.system.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 *
 * @author Bruno
 */
public class HashResolverImpl implements HashResolver {
    private final String hash = "LAMyraA81bJuCJa4";
    
    @Override
    public String gerarSalt() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);    }

    @Override
    public String gerarMd5(String password, String salt) {
        try{
            password += hash+salt;
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.update(password.getBytes(), 0, password.length());
            String md5 = new BigInteger(1, digest.digest()).toString(16);
            return md5;
        }catch(NoSuchAlgorithmException e){
            System.out.println(e.getMessage());
            return "";
        }
    }
    
    
}

