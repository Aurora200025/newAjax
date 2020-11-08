package newAjax.domain;

public class City {

    private int cityId;
    private String cityName;
    private Float citySize;
    private Area aid;
    public City() {}

    public City(int cityId, String cityName, Float citySize, Area aid) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.citySize = citySize;
        this.aid = aid;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Float getCitySize() {
        return citySize;
    }

    public void setCitySize(Float citySize) {
        this.citySize = citySize;
    }

    public Area getAid() {
        return aid;
    }

    public void setAid(Area aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", citySize=" + citySize +
                ", aid=" + aid +
                '}';
    }
}

