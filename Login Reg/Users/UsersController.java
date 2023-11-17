package booksystem.user;


public class UsersController {
    
 public boolean accountCheckpoint(String username, String password){
    Users usersModel = new Users();
    return usersModel.isUserExist(username, password);
 }
