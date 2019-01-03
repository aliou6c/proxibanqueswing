package org.proxibanqueswing.utils;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class MySqlConnexion {
	private static String url="jdbc:mysql://localhost/bd_gestionstock?useSSL=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static String userDb="root";
	private static String pwdDb;
	private static Connection conn= null;//l'unique instance de connexion à la base
	
	//Constructeur privé pour bloquer la création d'instance de la classe
	public MySqlConnexion(){
		super();
		
	}
	
	public static byte[] getEncryptedPassword(String pwdDb, byte[] salt) throws NoSuchAlgorithmException, InvalidKeySpecException {
	    KeySpec spec = new PBEKeySpec(pwdDb.toCharArray(), salt, 4096, 256 * 8);
	    SecretKeyFactory f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
	    return f.generateSecret(spec).getEncoded();
	}
	
	/**
	 * Cette methode retourne l'unique instance de connexion avec la base
	 * @return
	 * @throws IOException 
	 * @throws SecurityException 
	 * @throws SQLException 
	 */
	public static Connection getInstanceConnection() {
		Logger logger = Logger.getLogger("logger");
		try {
			 FileHandler fh= new FileHandler();

			 logger.addHandler(fh);
			if(conn==null) {// Aucune connexion avec la base
				conn=DriverManager.getConnection(url, userDb ,pwdDb);
				 
				 logger.log(Level.INFO, "Connexion établie avec la base");
				  
				
			}
		} catch (IOException e) {
			
			logger.log(Level.INFO, "Probleme de connexion !");
		}
		
		catch(SQLException e) {
			logger.log(Level.INFO, "echec de la connexion !");
		}
		finally {

		}
		return conn;
	}
	

}
