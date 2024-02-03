package _99_extra._04_tea_party;

public class TeaParty {
	 public String welcome(String name, boolean isWoman, boolean isKnighted) {
	        String greeting = "Hello ";
		 if(isWoman && !isKnighted) {
			 greeting =  greeting+"Ms. " + name;
		 }
		 else if(!isWoman && !isKnighted) {
			 greeting = greeting+"Mr. " + name;
		 }
		 else if(isWoman && isKnighted) {
			 greeting = greeting+"Lady "+ name;
		 }
		 else if(!isWoman && isKnighted) {
			 greeting = greeting+"Sir "+ name;
		 }
		 
	    
	
	return greeting;
	 }	
		
	
	






















}
