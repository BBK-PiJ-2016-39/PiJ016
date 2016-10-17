print "enter a number\n"
String str = System.console().readLine()
int n = Integer.parseInt(str)

int i = 0
boolean result = true

for (i = 2; i < n/2; i++){
	if (n%i == 0) {
		result = false
		break
	}
}

if (result) print "prime"
	else print "no"