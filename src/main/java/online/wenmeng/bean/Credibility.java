package online.wenmeng.bean;

import java.util.Date;

public class Credibility {
    private Integer credibilityid;

    private Integer userid;

    private Integer changestatus;

    private Integer changenum;

    private String changecause;

    private String aboutids;

    private Date abouttime;

    public Integer getCredibilityid() {
        return credibilityid;
    }

    public void setCredibilityid(Integer credibilityid) {
        this.credibilityid = credibilityid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getChangestatus() {
        return changestatus;
    }

    public void setChangestatus(Integer changestatus) {
        this.changestatus = changestatus;
    }

    public Integer getChangenum() {
        return changenum;
    }

    public void setChangenum(Integer changenum) {
        this.changenum = changenum;
    }

    public String getChangecause() {
        return changecause;
    }

    public void setChangecause(String changecause) {
        this.changecause = changecause == null ? null : changecause.trim();
    }

    public String getAboutids() {
        return aboutids;
    }

    public void setAboutids(String aboutids) {
        this.aboutids = aboutids == null ? null : aboutids.trim();
    }

    public Date getAbouttime() {
        return abouttime;
    }

    public void setAbouttime(Date abouttime) {
        this.abouttime = abouttime;
    }
}