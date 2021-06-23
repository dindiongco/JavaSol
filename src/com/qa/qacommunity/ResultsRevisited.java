package com.qa.qacommunity;

public class ResultsRevisited {
	
	public static void main(String[] args) {
		int physScore = 137;
		int chemScore = 103;
		int bioScore = 23;
		
		System.out.println(displayResults(bioScore, chemScore, physScore));
		displayPercentage(physScore, chemScore, bioScore);
	}
	public static double percentageBioResults(int bio) {
		double percentageBio = (bio * 100) / 150;
		return percentageBio;
	}
	
	public static double percentageChemResults(int chem) {
		double percentageChem = (chem * 100) / 150;
		return percentageChem;
	}
	
	public static double percentagePhysResults(int phys) {
		double percentagePhys = (phys * 100) / 150;
		return percentagePhys;
	}
	
	public static double percentageTotalResults(int phys, int chem, int bio) {
		double percentageTotal = ((phys + chem + bio) * 100) / 450;
		return percentageTotal;
	}
	 public static String displayResults(int bio, int chem, int phys) {
	        String results = "TEST RESULTS:\r\n";
	        results += "Biology: " + bio + "/150\r\n";
	        results += "Chemistry: " + chem + "/150\r\n";
	        results += "Physics: " + phys + "/150\r\n";
	        results += "Total: " + (bio+chem+phys) + "/450\r\n";
	        return results;
	    }
	 
	 public static void displayPercentage(int phys, int chem, int bio) {
		 double passPercentage = 60d;
		 
		 if (percentageBioResults(bio) >= passPercentage) {
			 System.out.println("Biology Percentage: " + percentageBioResults(bio) + "% (PASS)");
		 }
		 else {
			 System.out.println("Biology Percentage: " + percentageBioResults(bio) + "% (FAIL)");
		 }
		 
		 if (percentageChemResults(chem) >= passPercentage) {
			 System.out.println("Chemistry Percentage: " + percentageChemResults(chem) + "% (PASS)");
		 }
		 else {
			 System.out.println("Chemistry Percentage: " + percentageChemResults(chem) + "% (FAIL)");
		 }
		 
		 if (percentagePhysResults(phys) >= passPercentage) {
			 System.out.println("Physics Percentage: " + percentagePhysResults(phys) + "% (PASS)");
		 }
		 else {
			 System.out.println("Physics Percentage: " + percentagePhysResults(phys) + "% (FAIL)");
		 }
		 
		 if (percentageTotalResults(phys, chem, bio) >= passPercentage) {
			 System.out.println("Total Percentage: " + percentageTotalResults(phys, chem, bio) + "% (PASS)");
		 }
		 else {
			 System.out.println("Total Percentage: " + percentageTotalResults(phys, chem, bio) + "% (FAIL)");
		 }
		 
	 }
	 
	 
	 
	
}