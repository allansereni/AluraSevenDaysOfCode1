package br.com.alura.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ColetorDeFilmes {

	public static void main(String[] args) throws Exception {

		String url = "https://imdb-api.com/en/API/Top250Movies/k_strd3kz6";

		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		System.out.println(br.readLine().substring(0,1000));
		
		conn.disconnect();
		
	}

}
