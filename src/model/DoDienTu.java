package model;

public class DoDienTu extends chaSP {
    private String stbh;
    public DoDienTu(String idSp, String nameSp, String mtSp, double  gkdSp, double ghtSp, String stbh){
        super(idSp, nameSp, mtSp, gkdSp, ghtSp);
        this.stbh=stbh;
    }
    @Override 
    public String getPhanLoai(){
        return "DoDienTu";
    }
    public String getStbh(){return stbh;}
    public void setStbh(String stbh){this.stbh=stbh;}
}
