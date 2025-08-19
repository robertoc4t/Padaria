package com.padaria.padaria.security;

import org.mindrot.jbcrypt.BCrypt;

public class ConverterToHash {

    // Gera o hash das senhas dos padeiros 
    public static String hashPassword(String plainTextPassword) 
    {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }

    // Valida a senha do padeiro comparando o hash
    public static boolean validatePassword(String TextPassword, String hashedPassword) 
    {
        return BCrypt.checkpw(TextPassword, hashedPassword);
    }
    
}