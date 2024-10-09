package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonpath) {

		// 1.Mention the target folder location - File

		File f = new File("C:\\Users\\durai\\eclipse-workspace\\SampleMaven\\JvmReport");

		// 2.Add details to the report using Configuration class--addClassification()-m

		Configuration c = new Configuration(f,"Facebook&Amazon");

		c.addClassifications("Os Name", "Windows 11");
		c.addClassifications("Browser Name", "FireFox");
		c.addClassifications("Browser Version", "4.125");

//		3.Add json file paths into List<String> (first complete 4th step then come back to 3rd step)

		List<String> l = new ArrayList<String>();
		l.add(jsonpath);

//		4.Create object for ReportBuilder class and using the created object call generateReports() method.

		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
	}
}
