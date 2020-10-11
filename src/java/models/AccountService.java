/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author 751682
 */
public class AccountService {
    private String[] users ={"abe","barb"};
    private String[] passwords ={"password","password"};
    
    public AccountService(){
        
    }
    
    public User login(String username, String password) {
        User tempUser=null;
        for(int i=0; i<users.length; i++){
            if(username.equals(users[i]) && password.equals(passwords[i])){
                tempUser=new User(users[i],null);
                return tempUser;}
            
        }
        return tempUser;
    }
    
    
}
