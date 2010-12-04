package org.hob.beekeeper.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Klasa pomocnicza do liczenia skrótu MD5.
 */
public class MD5
{
    public static String calculateHash(String input)
    {
                try
        {
            MessageDigest m = MessageDigest.getInstance("MD5");
                       m.update(input.getBytes(),0,input.length());
           return new BigInteger(1,m.digest()).toString(16);

        }
        catch (NoSuchAlgorithmException e)
        {
            throw new IllegalArgumentException("Nieznany algorytm: MD5");
        }
    }
}