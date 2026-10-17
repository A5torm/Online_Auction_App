package model;
import java.io.Serializable;
public abstract class chaSP implements Serializable {
    private static final long serialVersionUID=1L;
    private String idSp;
    private String nameSp;
    private String mtSp;
    private double gkdSp;
    private double ghtSp;
    public abstract String getPhanLoai();
    public chaSP(String idSp, String nameSp, String mtSp, double gkdSp, double ghtSp){
        this.idSp=idSp;
        this.nameSp=nameSp;
        this.mtSp=mtSp;
        this.gkdSp=gkdSp;
        this.ghtSp=ghtSp;
    }
    public String getIdSp(){return idSp;}
    public void setIdSp(String idSp){ this.idSp=idSp;}
    public String getNameSp(){ return nameSp;}
    public void setNameSp(String nameSp){this.nameSp=nameSp;}
    public String getMtSp(){return mtSp;}
    public void setMtSp(String mtSp){this.mtSp=mtSp;}
    public double getGkdSp(){return gkdSp;}
    public void setGkdSp(double gkdSp){this.gkdSp=gkdSp;}
    public double getGhtSp(){return ghtSp;}
    public void setGhtSp(double ghtSp){this.ghtSp=ghtSp;}
}
