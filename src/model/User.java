package model;
//BẢN THIẾT KẾ CHUNG CHO CẢ 3 ĐỐI TƯỢNG: NGƯỜI ĐẤU GIÁ, NGƯỜI BÁN, QUẢN TRỊ VIÊN
import java.io.Serializable;
public abstract class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userid;
    private String username;
    private String password;
    private String email;
    public User(String userid, String username, String password, String email){
        this.userid=userid;
        this.username=username;
        this.password=password;
        this.email=email;
    }
    public abstract String getRole();
    public String getUserid(){
        return userid;
    }
    public void setUserid(String userid){
        this.userid=userid;
    }
    public String getusername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
