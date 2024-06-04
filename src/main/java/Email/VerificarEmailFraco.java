/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Email;

/**
 *
 * @author Oswaldo Beltrani Net
 */
public class VerificarEmailFraco implements ValidarEmail{
    
    @Override
    public boolean isValid(String s){
        
        return s != null && s.contains("@") && s.contains(".com");
    }
    
}
