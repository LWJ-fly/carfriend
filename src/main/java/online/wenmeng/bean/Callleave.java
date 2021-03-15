package online.wenmeng.bean;

import java.util.Date;

public class Callleave {
    private Integer callleaveid;

    private Integer calluserid;

    private Integer pollingcarid;

    private Integer toleaveid;

    private String agreeids;

    private String disagreeids;

    private String leavecause;

    private Date calltime;

    private Date endtime;

    private Integer callresult;

    public Callleave() {
    }

    public Callleave(Integer callleaveid, Integer calluserid, Integer pollingcarid, Integer toleaveid, String agreeids, String disagreeids, String leavecause, Date calltime, Date endtime, Integer callresult) {
        this.callleaveid = callleaveid;
        this.calluserid = calluserid;
        this.pollingcarid = pollingcarid;
        this.toleaveid = toleaveid;
        this.agreeids = agreeids;
        this.disagreeids = disagreeids;
        this.leavecause = leavecause;
        this.calltime = calltime;
        this.endtime = endtime;
        this.callresult = callresult;
    }

    public Integer getCallleaveid() {
        return callleaveid;
    }

    public void setCallleaveid(Integer callleaveid) {
        this.callleaveid = callleaveid;
    }

    public Integer getCalluserid() {
        return calluserid;
    }

    public void setCalluserid(Integer calluserid) {
        this.calluserid = calluserid;
    }

    public Integer getPollingcarid() {
        return pollingcarid;
    }

    public void setPollingcarid(Integer pollingcarid) {
        this.pollingcarid = pollingcarid;
    }

    public Integer getToleaveid() {
        return toleaveid;
    }

    public void setToleaveid(Integer toleaveid) {
        this.toleaveid = toleaveid;
    }

    public String getAgreeids() {
        return agreeids;
    }

    public void setAgreeids(String agreeids) {
        this.agreeids = agreeids == null ? null : agreeids.trim();
    }

    public String getDisagreeids() {
        return disagreeids;
    }

    public void setDisagreeids(String disagreeids) {
        this.disagreeids = disagreeids == null ? null : disagreeids.trim();
    }

    public String getLeavecause() {
        return leavecause;
    }

    public void setLeavecause(String leavecause) {
        this.leavecause = leavecause == null ? null : leavecause.trim();
    }

    public Date getCalltime() {
        return calltime;
    }

    public void setCalltime(Date calltime) {
        this.calltime = calltime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getCallresult() {
        return callresult;
    }

    public void setCallresult(Integer callresult) {
        this.callresult = callresult;
    }
}