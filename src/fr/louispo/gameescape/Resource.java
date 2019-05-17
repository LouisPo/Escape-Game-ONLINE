package fr.louispo.gameescape;

import java.util.Properties;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class Resource{

   /**
    * Charge la liste des propri�t�s contenu dans le fichier sp�cifi�
    *
    * @param filename le fichier contenant les propri�t�s
    * @return un objet Properties contenant les propri�t�s du fichier
    */
   public static Properties load(String filename) throws IOException, FileNotFoundException{
      Properties properties = new Properties();

      FileInputStream input = new FileInputStream(filename);
      try{

         properties.load(input);
         return properties;

      }

              finally{

         input.close();

      }

   }

  
}