package com.pramati.scraper.google_grp_scraper;

import java.net.URL;


public class ScraperStartup {
	public static void main(String[] args) throws Exception {
		args = new String[2];
		args[0] = "https://groups.google.com/forum/#!forum/tensorflow/topics";
		args[1] = "7";
		CollectLink collectLink = new CollectLink();
		URL url = new URL(args[0]);
		int noOfWorker;
		try {
			noOfWorker = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			noOfWorker = 10;
		}

		collectLink.init(url, noOfWorker);
		collectLink.scrap();
	}
}
