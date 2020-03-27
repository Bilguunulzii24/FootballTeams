import java.util.List;

public class TeamPojo {

    private int count;
    private Filters filters;
    private List<Teams> teams;

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

    public List<Teams> getTeams() {
        return teams;
    }

    public void setTeams(List<Teams> teams) {
        this.teams = teams;
    }
}
