package AllNameOfLigue;

import java.util.List;

public class CompetitionPojo {
    private int count;
    private Filters filters;
    private List<Competitions> competitions;



    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    public List<Competitions> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competitions> competitions) {
        this.competitions = competitions;
    }
}
