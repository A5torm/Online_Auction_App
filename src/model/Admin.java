package model;
//ĐẠI DIỆN CHO TÀI KHOẢN QUẢN TRỊ HỆ THỐNG
public class Admin extends User {
    public Admin(String userid, String username, String password, String email){
        super(userid, username, password, email);
    }
    @Override 
    public String getRole(){
        return "ADMIN";
    }
}
