/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports.Util;

/**
 *
 * @author anveshvarma
 */
public class Util1 {
   
    
    public static final String ALPHA_NUMERIC_STRING = "@ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
public static String generatePassword()
   {
       int count = 8;
    StringBuilder builder = new StringBuilder();
    while (count-- != 0) 
    {
         int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
         builder.append(ALPHA_NUMERIC_STRING.charAt(character));
    }
    return builder.toString();
   }
}
