package online.wenmeng.bean;

import java.util.Date;

public class Bills {
    private Integer billid;

    private String alipayid;

    private Integer outrequestno;

    private Integer billuserid;

    private String billaboutids;

    private Integer billstatus;

    private Double billpay;

    private String billcause;

    private Date billtime;

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public String getAlipayid() {
        return alipayid;
    }

    public void setAlipayid(String alipayid) {
        this.alipayid = alipayid == null ? null : alipayid.trim();
    }

    public Integer getOutrequestno() {
        return outrequestno;
    }

    public void setOutrequestno(Integer outrequestno) {
        this.outrequestno = outrequestno;
    }

    public Integer getBilluserid() {
        return billuserid;
    }

    public void setBilluserid(Integer billuserid) {
        this.billuserid = billuserid;
    }

    public String getBillaboutids() {
        return billaboutids;
    }

    public void setBillaboutids(String billaboutids) {
        this.billaboutids = billaboutids == null ? null : billaboutids.trim();
    }

    public Integer getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(Integer billstatus) {
        this.billstatus = billstatus;
    }

    public Double getBillpay() {
        return billpay;
    }

    public void setBillpay(Double billpay) {
        this.billpay = billpay;
    }

    public String getBillcause() {
        return billcause;
    }

    public void setBillcause(String billcause) {
        this.billcause = billcause == null ? null : billcause.trim();
    }

    public Date getBilltime() {
        return billtime;
    }

    public void setBilltime(Date billtime) {
        this.billtime = billtime;
    }
}