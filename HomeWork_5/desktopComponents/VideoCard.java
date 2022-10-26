package HW.HomeWork_5.desktopComponents;

import java.util.Objects;

public class VideoCard {
    private String vcCompany;

    public VideoCard(String vcCompany) {
        this.vcCompany = vcCompany;
    }

    public String getVcCompany() {
        return vcCompany;
    }

    public void setVcCompany(String vcCompany) {
        this.vcCompany = vcCompany;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoCard videoCard = (VideoCard) o;
        return Objects.equals(vcCompany, videoCard.vcCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vcCompany);
    }

    @Override
    public String toString() {
        return "VideoCard: " + vcCompany + "; ";
    }
}
