print "If I give you £1, how many Euro will you give me? (read the pound/euro ratio) ";
double euroOverPoundRatio = Double.parseDouble(System.console().readLine());

print "If I give you 1€, how many Sterling pounds will you give me? (read the euro/pound ratio)";
double poundOverEuroRatio = Double.parseDouble(System.console().readLine());

println "OK, now I know enough.";

boolean finished = false;
while (!finished) {
    println "";
    println "What would you like to do?";
    println "   1 - Exchange £ into €";
    println "   2 - Exchange € into £";
    println "   0 - Exit the program";
    println "";
    print   "> ";
    int choice = Integer.parseInt(System.console().readLine());
    switch (choice) {
    case 1:
	  print "How many pounds would you like to convert? ";
	  double pounds = Double.parseDouble(System.console().readLine());
	  double euro   = pounds * euroOverPoundRatio;
	  println "£" + pounds + " will convert to " + euro + "€";
	  break;
    case 2: 
	  print "How many euro would you like to convert? ";
	  double euro   = Double.parseDouble(System.console().readLine());
	  double pounds = euro * poundOverEuroRatio;
	  println euro + "€ will convert to £" + pounds;
	  break;
    case 0: 
	  finished = true;
	  break;
    default: 
	  println "Sorry, that is not a valid option";
    }	  
}
println "Exiting the program";

