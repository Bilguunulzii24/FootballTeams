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
        {"WC Qualification","Superliga Argentina","Supercopa Argentina","Primera B Nacional","WC Qualification","A League","FFA Cup",
                "Playoffs 1/2","Bundesliga","ÖFB Cup","Erste Liga","Supercoupe de Belgique","Playoffs II","Division 1B",
                "Jupiler Pro League","Coupe de Belgique","LFPB","Premier Liga","Série C","Série B","Copa do Brasil","Série D",
                "Série A","Kupa na Bulgarija","A PFG","Canadian Championship","Primera División","Playoffs 1/2","Supercopa de Chile",
                "Chinese Super League","Liga Postobón","Superliga de Colombia","Prva Liga","Synot Liga","Play Offs 1/2","Superliga",
                "DBU Pokalen","Copa Pilsener Serie A","FA Cup","Premier League","Football League Cup","National League","League One",
                "FA Community Shield","Championship","League Two","Meistriliiga","UEFA Women's EURO","WC Qualification",
                "European Championship","UEFA Champions League","UEFA Europa League","Suomen Cup","Veikkausliiga","Coupe de France",
                "Playoffs 2/3","Coupe de la Ligue","Ligue 1","Ligue 2","Trophée des Champions","Playoffs 1/2","DFB-Pokal","2. Bundesliga",
                "Regionalliga","Frauen Bundesliga","Bundesliga","DFL Super Cup","3. Liga","Greek Cup","Super League","NB I","Magyar Kupa",
                "Úrvalsdeild","I-League","Ligat ha'Al","Serie C","Supercoppa","Serie A","Serie B","Coppa Italia","J. League","Super Cup",
                "J. League Division 2","J.League Cup","Virslīga","A Lyga","Premier League","SuperCopa MX","Liga MX","Copa MX","KNVB Beker",
                "Eredivisie","Johan Cruijff Schaal","Jupiler League","Premiership","League Cup","Tippeligaen","Playoffs 1/2","1. divisjon",
                "WC Qualification","Liga Panameña de Fútbol","Primera División","Superpuchar Polski","Puchar Polski","Primeira Liga",
                "Supertaça Cândido de Oliveira","Taça de Portugal","Liga2 Cabovisão","Premier Division","Supercupa României","Liga I",
                "Liga II","Playoffs 1/2","Russian Super Cup","FNL","RFPL","Russian Cup","Playoffs 2/3","Scottish Cup","Premier League",
                "Championship","ABSA Premiership","Copa America","Copa Sudamericana","WC Qualification","Primera Division",
                "Segunda División","Supercopa de España","Copa del Rey","Playoffs 1/2","Allsvenskan","Superettan","Playoffs 2/3",
                "Schweizer Pokal","Super League","1. Lig","TFF Süper Kupa","Süper Lig","Kubok Ukrainy","Playoffs 1/2","Superkubok Ukrainy",
                "Premier Liha","MLS","Supercopa Uruguaya","Primera División","Primera División","V-League","Welsh Premier League",
                "FIFA World Cup"
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
