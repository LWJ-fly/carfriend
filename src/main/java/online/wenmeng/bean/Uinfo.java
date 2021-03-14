package online.wenmeng.bean;

public class Uinfo {
    private Integer userid;

    private String qqnum;

    private String wxnum;

    private Long phone;

    private String email;

    private String realname;

    private Integer age;

    private String nickname;

    private Integer gender;

    private String signature;

    private Double wallet;

    private Integer credibility;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    public Integer getCredibility() {
        return credibility;
    }

    public void setCredibility(Integer credibility) {
        this.credibility = credibility;
    }
}