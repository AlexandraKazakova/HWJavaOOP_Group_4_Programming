package HW.HomeWork_5.desktopComponents;

import java.util.Objects;

public class Cpu {
   private String company;

   public Cpu(String company){
       this.company = company;
   }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cpu cpu = (Cpu) o;
        return company.equals(cpu.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company);
    }

    @Override
    public String toString() {
        return "Cpu: " + company + "; ";
    }
}
