package online.wenmeng.bean;

import java.util.Date;

public class Uinacarinfo extends UinacarinfoKey {
    private String nickname;

    private String chathead;

    private Integer gender;

    private String incarmsg;

    private Date jointime;

    private Date endtime;

    private Integer instatus;

    private Integer outinfo;

    private String qqnum;

    private String wxnum;

    private Long phone;

    private String email;

    private Integer credibility;

    public Uinacarinfo() {
    }

    public Uinacarinfo(String nickname, String chathead, Integer gender, String incarmsg, Date jointime, Date endtime, Integer instatus, Integer outinfo, String qqnum, String wxnum, Long phone, String email, Integer credibility) {
        this.nickname = nickname;
        this.chathead = chathead;
        this.gender = gender;
        this.incarmsg = incarmsg;
        this.jointime = jointime;
        this.endtime = endtime;
        this.instatus = instatus;
        this.outinfo = outinfo;
        this.qqnum = qqnum;
        this.wxnum = wxnum;
        this.phone = phone;
        this.email = email;
        this.credibility = credibility;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getChathead() {
        return chathead;
    }

    public void setChathead(String chathead) {
        this.chathead = chathead == null ? null : chathead.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIncarmsg() {
        return incarmsg;
    }

    public void setIncarmsg(String incarmsg) {
        this.incarmsg = incarmsg == null ? null : incarmsg.trim();
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getInstatus() {
        return instatus;
    }

    public void setInstatus(Integer instatus) {
        this.instatus = instatus;
    }

    public Integer getOutinfo() {
        return outinfo;
    }

    public void setOutinfo(Integer outinfo) {
        this.outinfo = outinfo;
    }

    public String getQqnum() {
        return qqnum;
    }

    public void setQqnum(String qqnum) {
        this.qqnum = qqnum == null ? null : qqnum.trim();
    }

    public String getWxnum() {
        return wxnum;
    }

    public void setWxnum(String wxnum) {
        this.wxnum = wxnum == null ? null : wxnum.trim();
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getCredibility() {
        return credibility;
    }

    public void setCredibility(Integer credibility) {
        this.credibility = credibility;
    }
}