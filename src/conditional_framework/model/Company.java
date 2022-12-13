package conditional_framework.model;

import java.util.Objects;

public class Company {

    //data member

    String head ;
    int totalworker ;
    double turnover;

    //parameterized constructor

    public Company(String head, int totalworker, double turnover) {
        this.head = head;
        this.totalworker = totalworker;
        this.turnover = turnover;
    }

    //hashcode and equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return totalworker == company.totalworker && Double.compare(company.turnover, turnover) == 0 && head.equals(company.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, totalworker, turnover);
    }


    //getter / setter


    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public int getTotalworker() {
        return totalworker;
    }

    public void setTotalworker(int totalworker) {
        this.totalworker = totalworker;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }
}
