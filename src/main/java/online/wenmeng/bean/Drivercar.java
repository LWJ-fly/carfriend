package online.wenmeng.bean;

public class Drivercar {
    private Integer driverid;

    private Integer ordernum;

    private String carlicence;

    private String carcolor;

    private Integer carseat;

    public Integer getDriverid() {
        return driverid;
    }

    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public String getCarlicence() {
        return carlicence;
    }

    public void setCarlicence(String carlicence) {
        this.carlicence = carlicence == null ? null : carlicence.trim();
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor == null ? null : carcolor.trim();
    }

    public Integer getCarseat() {
        return carseat;
    }

    public void setCarseat(Integer carseat) {
        this.carseat = carseat;
    }
}