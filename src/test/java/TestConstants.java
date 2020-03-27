/**
 * Created by nurkulov 12/26/19
 */

public class TestConstants {

    private static final String[] ACTUAL_DEFENDERS                =
        {"Marcos Rojo", "Victor Nilsson-Lindelöf", "Axel Tuanzebe", "Phil Jones", "Luke Shaw", "Eric Bailly", "Timothy Fosu-Mensah", "Diogo Dalot", "Brandon Williams", "Ethan Laird",
            "Max Dunne", "Teden Mengi"};
    private static final String[] GOALKEEPERS                     = {"David De Gea", "Sergio Romero", "Lee Grant", "Matej Kovar"};
    private static final String[] EXPECTED_MIDFIELDERS            =
        {"Fred", "Ashley Young", "Jesse Lingard", "Harry Maguire", "Paul Pogba", "Nemanja Matić", "Scott McTominay", "Daniel James", "Aaron Wan-Bissaka", "Mason Greenwood",
            "James Garner", "Dylan Levitt", "Arnau Puigmal", "Di'Shon Bernard", "Ethan Galbraith"};
    private static final String[] EXPECTED_MIDFIELDER_FROM_BRAZIL = {"Fred"};
    private static final String[] EXPECTED_ATTACKERS              = {"Marcus Rashford", "Angel Gomes", "D'Mani Bughail-Mellor"};
    private static final String[] EXPECTED_COACH                  = {"Gaizka Garitano"};
    private static final String[] EXPECTED_TEAMS                  =
        {"Arsenal FC", "Aston Villa FC", "Blackburn Rovers FC", "Bolton Wanderers FC", "Chelsea FC", "Everton FC", "Fulham FC", "Liverpool FC", "Manchester City FC",
            "Manchester United FC", "Newcastle United FC", "Norwich City FC", "Queens Park Rangers FC", "Stoke City FC", "Sunderland AFC", "Tottenham Hotspur FC", "West Bromwich Albion FC",
            "Wigan Athletic FC", "Wolverhampton Wanderers FC", "Hull City AFC", "Burnley FC", "Birmingham City FC", "Leicester City FC", "Southampton FC", "Leeds United AFC", "Derby County FC",
            "Middlesbrough FC", "Sheffield Wednesday FC", "Watford FC", "Charlton Athletic FC", "Ipswich Town FC", "Nottingham Forest FC", "Crystal Palace FC", "Reading FC", "Sheffield United FC",
            "Barnsley FC", "Millwall FC", "Rotherham United FC", "Bristol City FC", "Luton Town FC", "Huddersfield Town AFC", "Brighton & Hove Albion FC", "Brentford FC", "West Ham United FC",
            "England", "AFC Bournemouth", "Burton Albion FC", "Preston North End FC"};
    private static final String[] EXPECTED_SECOND_HIGHEST_SCORER  = {"Denis Cheryshev", "Cristiano Ronaldo", "Antoine Griezmann", "Romelu Lukaku", "Kylian Mbappé"};
    private static final String[] EXPECTED_COMPETITIONS_LIST      =
        {"WC Qualification", "Superliga Argentina", "Supercopa Argentina", "Primera B Nacional", "WC Qualification", "FFA Cup", "A League", "Erste Liga",
            "Bundesliga", "ÖFB Cup", "Playoffs 1/2", "Jupiler Pro League", "Playoffs II", "Coupe de Belgique", "Supercoupe de Belgique", "Division 1B", "LFPB", "Premier Liga", "Série D", "Série A",
            "Série C", "Série B", "Copa do Brasil", "Kupa na Bulgarija", "A PFG", "Canadian Championship", "Playoffs 1/2", "Supercopa de Chile", "Primera División", "Chinese Super League",
            "Superliga de Colombia", "Liga Postobón", "Prva Liga", "Synot Liga", "Superliga", "Play Offs 1/2", "DBU Pokalen", "Copa Pilsener Serie A", "Championship", "League One", "League Two",
            "Premier League", "FA Cup", "Football League Cup", "FA Community Shield", "National League", "Meistriliiga", "WC Qualification", "UEFA Women's EURO", "UEFA Europa League",
            "UEFA Champions League", "European Championship", "Veikkausliiga", "Suomen Cup", "Ligue 2", "Coupe de France", "Playoffs 1/2", "Coupe de la Ligue", "Playoffs 2/3", "Ligue 1",
            "Trophée des Champions", "DFB-Pokal", "Regionalliga", "Frauen Bundesliga", "2. Bundesliga", "DFL Super Cup", "Bundesliga", "3. Liga", "Greek Cup", "Super League", "Magyar Kupa", "NB I",
            "Úrvalsdeild", "I-League", "Ligat ha'Al", "Serie B", "Coppa Italia", "Serie C", "Supercoppa", "Serie A", "J. League Division 2", "J.League Cup", "J. League", "Super Cup", "Virslīga",
            "A Lyga", "Premier League", "Copa MX", "SuperCopa MX", "Liga MX", "Eredivisie", "Jupiler League", "KNVB Beker", "Johan Cruijff Schaal", "Premiership", "League Cup", "Playoffs 1/2",
            "1. divisjon", "Tippeligaen", "WC Qualification", "Liga Panameña de Fútbol", "Primera División", "Superpuchar Polski", "Puchar Polski", "Liga2 Cabovisão", "Primeira Liga",
            "Supertaça Cândido de Oliveira", "Taça de Portugal", "Premier Division", "Liga II", "Supercupa României", "Liga I", "Russian Super Cup", "RFPL", "FNL", "Russian Cup", "Playoffs 1/2",
            "Scottish Cup", "Premier League", "Championship", "Playoffs 2/3", "ABSA Premiership", "Copa America", "Copa Sudamericana", "WC Qualification", "Copa del Rey", "Primera Division",
            "Segunda División", "Supercopa de España", "Superettan", "Playoffs 2/3", "Playoffs 1/2", "Allsvenskan", "Schweizer Pokal", "Super League", "Süper Lig", "1. Lig", "TFF Süper Kupa",
            "Playoffs 1/2", "Superkubok Ukrainy", "Premier Liha", "Kubok Ukrainy", "MLS", "Primera División", "Primera División", "V-League", "Welsh Premier League", "FIFA World Cup"
        };

    public static String[] getActualDefenders() {
        return ACTUAL_DEFENDERS;
    }

    public static String[] getGOALKEEPERS() {
        return GOALKEEPERS;
    }

    public static String[] getExpectedMidfielders() {
        return EXPECTED_MIDFIELDERS;
    }

    public static String[] getExpectedMidfielderFromBrazil() {
        return EXPECTED_MIDFIELDER_FROM_BRAZIL;
    }

    public static String[] getExpectedAttackers() {
        return EXPECTED_ATTACKERS;
    }

    public static String[] getExpectedCoach() {
        return EXPECTED_COACH;
    }

    public static String[] getExpectedTeams() {
        return EXPECTED_TEAMS;
    }

    public static String[] getExpectedSecondHighestScorer() {
        return EXPECTED_SECOND_HIGHEST_SCORER;
    }

    public static String[] getExpectedCompetitionsList() {
        return EXPECTED_COMPETITIONS_LIST;
    }
}
