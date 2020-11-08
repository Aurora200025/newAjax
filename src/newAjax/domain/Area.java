package newAjax.domain;

public class Area {

    private int aid;
    private String aname;
    private Country cid;
    public Area() {}

    public Area(int aid, String aname, Country cid) {
        this.aid = aid;
        this.aname = aname;
        this.cid = cid;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Country getCountry() {
        return cid;
    }

    public void setCountry(Country cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Area{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", cid=" + cid +
                '}';
    }
}
