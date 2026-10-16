package model;
//ĐẠI DIỆN CHO NGƯỜI THAM GIA ĐẤU GIÁ, BỔ SUNG THÊM THUỘC TÍNH SỐ DƯ TÀI KHOẢN
public class Bidder extends User {
    private double balance;
    public Bidder(String userid, String username, String password, String email, double balance){
        super(userid, username, password, email);
        this.balance=balance;
    }
    @Override 
    public String getRole(){
        return "BIDDER";
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    // Phuong thuc tru tien khi dat gia
    public boolean deductBalance(double amount){
        if(amount>0&&this.balance>=amount){
            this.balance-=amount;
            return true;
        }
        return false;
    }
}
