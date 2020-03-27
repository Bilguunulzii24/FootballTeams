import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nurkulov 12/26/19
 */
public class APITasks {

    /*
     * GET all soccer team names listed in given resource
     * Deserialization type: Pojo
     */

    private static HttpClient httpClient;
    private static URIBuilder uri;
    private static HttpGet httpGet;
    private static ObjectMapper objectMapper;
    private static HttpResponse httpResponse;


    public static List<String> getAllTeams() throws URISyntaxException, IOException {

        httpClient = HttpClientBuilder.create().build();

        uri = new URIBuilder();
        uri.setScheme("Http").setHost(ConfigReader.getProperty("host")).setPath("v2/teams");

        httpGet = new HttpGet(uri.build());
        httpGet.setHeader(ConfigReader.getProperty("contType"), ConfigReader.getProperty("appJson"));
        httpGet.setHeader("X-Auth-Token", ConfigReader.getProperty("token"));

        httpResponse = httpClient.execute(httpGet);
        objectMapper = new ObjectMapper();

        TeamPojo printTeams = objectMapper.readValue(httpResponse.getEntity().getContent(),TeamPojo.class);

        List<String> teams = new ArrayList<>();
        for(int i = 0; i < printTeams.getTeams().size(); i++) {
            teams.add(printTeams.getTeams().get(i).getName());
        }

        System.out.println(teams);
        return teams;

    }

    /*
     * GET names of all goalkeepers from England team
     * note: England team id is 66
     * Deserialization type: TypeReference
     */
    public static List<String> getAllGoalkeepers() throws URISyntaxException, IOException {

        httpClient =
        return null;

    }

    /*
     * GET names of all defenders from England team
     * note: England team id is 66
     * Deserialization type: TypeReference
     */
    public static List<String> getDefenders() throws URISyntaxException, IOException {
        return null;
    }

    /*
     * GET names of all midfielders from England team
     * note: England team id is 66
     * Deserialization type: Pojo
     */
    public static List<String> getMidfielders() throws IOException, URISyntaxException {
        return null;
    }

    /*
     * GET names of all midfielders from England team whose country is Brazil
     * note: England team id is 66
     * Deserialization type: Pojo
     */
    public static List<String> getMidfielderFromBrazil() throws URISyntaxException, IOException {
        return null;
    }

    /*
     * GET names of all attackers from England team whose origin country is England
     * note: England team id is 66
     * Deserialization type: Pojo
     */
    public static List<String> getAttackerFromEngland() throws URISyntaxException, IOException {
        return null;
    }

    /*
     * GET name of Spain team coach
     * note: Spain team id is 77
     * Deserialization type: Pojo
     */
    public static List<String> getSpainCoach() throws URISyntaxException, IOException {
        return null;
    }

    public static List<String> getAllCompetitions() throws URISyntaxException, IOException {
        return null;

    }

    /*
     * GET names of second highest scorrer from competitions of 2000 season
     * note: endpoint for competitions: `competitions/<year>/
     * note: endpoint for scorers: `competitions/<year>/scorers`
     * Deserialization type: Pojo and TypeReference
     */
    public static List<String> getSecondHighestScorer() throws URISyntaxException, IOException {
        return null;
    }
}
