package online.wenmeng.bean;

import java.util.Date;

public class Drivervie {
    private Integer vieid;

    private Integer driverid;

    private Integer poolingcarid;

    private Double totalpay;

    private Date vietime;

    private String viemsg;

    private Integer viestatus;

    public Drivervie() {
    }

    public Drivervie(Integer vieid, Integer driverid, Integer poolingcarid, Double totalpay, Date vietime, String viemsg, Integer viestatus) {
        this.vieid = vieid;
        this.driverid = driverid;
        this.poolingcarid = poolingcarid;
        this.totalpay = totalpay;
        this.vietime = vietime;
        this.viemsg = viemsg;
        this.viestatus = viestatus;
    }

    public Integer getVieid() {
        return vieid;
    }

    public void setVieid(Integer vieid) {
        this.vieid = vieid;
    }

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public Integer getPoolingcarid() {
        return poolingcarid;
    }

    public void setPoolingcarid(Integer poolingcarid) {
        this.poolingcarid = poolingcarid;
    }

    public Double getTotalpay() {
        return totalpay;
    }

    public void setTotalpay(Double totalpay) {
        this.totalpay = totalpay;
    }

    public Date getVietime() {
        return vietime;
    }

    public void setVietime(Date vietime) {
        this.vietime = vietime;
    }

    public String getViemsg() {
        return viemsg;
    }

    public void setViemsg(String viemsg) {
        this.viemsg = viemsg == null ? null : viemsg.trim();
    }

    public Integer getViestatus() {
        return viestatus;
    }

    public void setViestatus(Integer viestatus) {
        this.viestatus = viestatus;
    }
}