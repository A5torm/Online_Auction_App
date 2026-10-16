package model;
//ĐẠI DIỆN CHO NGƯỜI BÁN CÓ QUYỀN TẠO VÀ QUẢN LÍ CÁC PHIÊN ĐẤU GIÁ
public class Seller extends User {
    public Seller(String userid, String username, String password, String email){
        super(userid,username,password,email);
    }
    @Override 
    public String getRole(){
        return "SELLER";
    }
}
