package secutiry;

import secutiry.rsa.RSA;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class App {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        var rsa = new RSA();
        rsa.printKeys();


    }


}
