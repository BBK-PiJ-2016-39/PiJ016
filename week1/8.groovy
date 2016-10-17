int a,b,c
int max
String str 

print "enter numbers or -1 to finish\n"
str = System.console().readLine()
a = Integer.parseInt(str)
max = a

while (a!= -1){
	str = System.console().readLine()
	a = Integer.parseInt(str)
	
	if (a>max) max = a
}

print "max unmber : " + max