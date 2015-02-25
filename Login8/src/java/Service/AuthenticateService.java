/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Service;

/**
 *
 * @author Sayed Mahmud Raihan
 */
public class AuthenticateService {
    public boolean authenticate(String userName,String password){
        if(password == null || password.trim()==""){
            return false;
        }
        return true;
        
    }
}

