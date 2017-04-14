package br.com.caelum.crypto;

import java.security.NoSuchAlgorithmException;

public class TesteHash {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String test = "Isso eh um teste";
		System.out.println(SHA1.hash(test.getBytes()));

	}

}
