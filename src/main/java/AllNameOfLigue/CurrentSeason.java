package AllNameOfLigue;

public class CurrentSeason {
    private int id;
    private String startDate;
    private String endDate;
    private String currentMatchday;
    private Winner winner;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCurrentMatchday() {
        return currentMatchday;
    }

    public void setCurrentMatchday(String currentMatchday) {
        this.currentMatchday = currentMatchday;
    }

    public Winner getWinner() {
        return winner;
    }

    public void setWinner(Winner winner) {
        this.winner = winner;
    }
}
