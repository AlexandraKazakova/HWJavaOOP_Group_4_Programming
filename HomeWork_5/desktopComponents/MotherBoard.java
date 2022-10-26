package HW.HomeWork_5.desktopComponents;

import java.util.Objects;

public class MotherBoard {
    private String mbCompany;

    public MotherBoard(String mbCompany) {
        this.mbCompany = mbCompany;
    }

    public String getMbCompany() {
        return mbCompany;
    }

    public void setMbCompany(String mbCompany) {
        this.mbCompany = mbCompany;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MotherBoard that = (MotherBoard) o;
        return mbCompany.equals(that.mbCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mbCompany);
    }

    @Override
    public String toString() {
        return "MotherBoard: " + mbCompany + "; ";
    }
}
