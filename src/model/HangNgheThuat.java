package model;

public class HangNgheThuat extends chaSP {
    private String nameNS;
    public HangNgheThuat(String idSp, String nameSp, String mtSp, double gkdSp, double ghtSp, String nameNS){
        super(idSp,nameSp,mtSp,gkdSp,ghtSp);
        this.nameNS=nameNS;
    }
    @Override 
    public String getPhanLoai(){
        return "HangNgheThua";
    }
    public String getNameNS(){return nameNS;}
    public void setNameNS(String nameNS){this.nameNS=nameNS;}
}
