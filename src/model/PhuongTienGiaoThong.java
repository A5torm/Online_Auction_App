package model;

public class PhuongTienGiaoThong extends chaSP {
    private String namSX;
    public PhuongTienGiaoThong(String idSp, String nameSp, String mtSp, double gkdSp, double ghtSp, String namSX){
        super(idSp, nameSp, mtSp, gkdSp, ghtSp);
        this.namSX=namSX;
    }
    @Override 
    public String getPhanLoai(){
        return "PhuongTienGiaoThong";
    }
    public String getNamSX(){return namSX;}
    public void setNamSX(String namSX){this.namSX=namSX;}
}
