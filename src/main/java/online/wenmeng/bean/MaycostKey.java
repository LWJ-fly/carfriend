package online.wenmeng.bean;

public class MaycostKey {
    private String goplace;

    private String readyplace;

    public String getGoplace() {
        return goplace;
    }

    public void setGoplace(String goplace) {
        this.goplace = goplace == null ? null : goplace.trim();
    }

    public String getReadyplace() {
        return readyplace;
    }

    public void setReadyplace(String readyplace) {
        this.readyplace = readyplace == null ? null : readyplace.trim();
    }
}