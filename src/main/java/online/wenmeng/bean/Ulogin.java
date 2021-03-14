package online.wenmeng.bean;

public class Ulogin {
    private Integer userid;

    private String qqlogin;

    private String wxlogin;

    private String zfblogin;

    private String tblogin;

    private String userlogin;

    private String userpwd;

    private Integer usable;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getQqlogin() {
        return qqlogin;
    }

    public void setQqlogin(String qqlogin) {
        this.qqlogin = qqlogin == null ? null : qqlogin.trim();
    }

    public String getWxlogin() {
        return wxlogin;
    }

    public void setWxlogin(String wxlogin) {
        this.wxlogin = wxlogin == null ? null : wxlogin.trim();
    }

    public String getZfblogin() {
        return zfblogin;
    }

    public void setZfblogin(String zfblogin) {
        this.zfblogin = zfblogin == null ? null : zfblogin.trim();
    }

    public String getTblogin() {
        return tblogin;
    }

    public void setTblogin(String tblogin) {
        this.tblogin = tblogin == null ? null : tblogin.trim();
    }

    public String getUserlogin() {
        return userlogin;
    }

    public void setUserlogin(String userlogin) {
        this.userlogin = userlogin == null ? null : userlogin.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public Integer getUsable() {
        return usable;
    }

    public void setUsable(Integer usable) {
        this.usable = usable;
    }
}