package online.wenmeng.bean;

import java.util.Date;

public class Carfriend {
    private Integer poolingcarid;

    private Integer poolinguserid;

    private String userids;

    private Double aboutpay;

    private Integer totalnum;

    private Integer getnum;

    private Date starttime;

    private Date endtime;

    private Date readtime;

    private Date gotime;

    private String readyplace;

    private String goplace;

    private Integer poolinglimit;

    private Integer poolingstatus;

    private String leaveids;

    @Override
    public String toString() {
        return "Carfriend{" +
                "poolingcarid=" + poolingcarid +
                ", poolinguserid=" + poolinguserid +
                ", userids='" + userids + '\'' +
                ", aboutpay=" + aboutpay +
                ", totalnum=" + totalnum +
                ", getnum=" + getnum +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", readtime=" + readtime +
                ", gotime=" + gotime +
                ", readyplace='" + readyplace + '\'' +
                ", goplace='" + goplace + '\'' +
                ", poolinglimit=" + poolinglimit +
                ", poolingstatus=" + poolingstatus +
                ", leaveids='" + leaveids + '\'' +
                '}';
    }

    public Integer getPoolingcarid() {
        return poolingcarid;
    }

    public void setPoolingcarid(Integer poolingcarid) {
        this.poolingcarid = poolingcarid;
    }

    public Integer getPoolinguserid() {
        return poolinguserid;
    }

    public void setPoolinguserid(Integer poolinguserid) {
        this.poolinguserid = poolinguserid;
    }

    public String getUserids() {
        return userids;
    }

    public void setUserids(String userids) {
        this.userids = userids == null ? null : userids.trim();
    }

    public Double getAboutpay() {
        return aboutpay;
    }

    public void setAboutpay(Double aboutpay) {
        this.aboutpay = aboutpay;
    }

    public Integer getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(Integer totalnum) {
        this.totalnum = totalnum;
    }

    public Integer getGetnum() {
        return getnum;
    }

    public void setGetnum(Integer getnum) {
        this.getnum = getnum;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getReadtime() {
        return readtime;
    }

    public void setReadtime(Date readtime) {
        this.readtime = readtime;
    }

    public Date getGotime() {
        return gotime;
    }

    public void setGotime(Date gotime) {
        this.gotime = gotime;
    }

    public String getReadyplace() {
        return readyplace;
    }

    public void setReadyplace(String readyplace) {
        this.readyplace = readyplace == null ? null : readyplace.trim();
    }

    public String getGoplace() {
        return goplace;
    }

    public void setGoplace(String goplace) {
        this.goplace = goplace == null ? null : goplace.trim();
    }

    public Integer getPoolinglimit() {
        return poolinglimit;
    }

    public void setPoolinglimit(Integer poolinglimit) {
        this.poolinglimit = poolinglimit;
    }

    public Integer getPoolingstatus() {
        return poolingstatus;
    }

    public void setPoolingstatus(Integer poolingstatus) {
        this.poolingstatus = poolingstatus;
    }

    public String getLeaveids() {
        return leaveids;
    }

    public void setLeaveids(String leaveids) {
        this.leaveids = leaveids == null ? null : leaveids.trim();
    }
}