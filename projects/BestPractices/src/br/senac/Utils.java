package br.senac;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {
    public static String generateHash(String senhaTextoClaro){
        MessageDigest md;
        String senhaCripto = null;

        try {
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1, md.digest(senhaTextoClaro.getBytes()));
            senhaCripto = hash.toString(16);

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        return senhaCripto;
    }
}
