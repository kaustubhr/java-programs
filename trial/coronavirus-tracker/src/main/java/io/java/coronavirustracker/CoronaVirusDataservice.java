package src.main.java.io.java.coronavirustracker;

import java.net.http.HttpClient;
import java.net.http.*;








public class CoronaVirusDataservice {
	
	private static String VIRUS_DATA_URL = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_US.csv";
	
	public void fetchVirusData() {
		HttpClient client = HttpClient.newHttpClient();	
	}

}
