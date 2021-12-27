package io.java.CryptoProvider;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;


public class Provider 
{
    public static void main( String[] args ) throws NoSuchAlgorithmException, NoSuchPaddingException
    {
    	Security.addProvider(new BouncyCastleProvider());

    	Cipher cipher = Cipher.getInstance("AES");
    }
}
