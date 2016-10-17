int a,b
boolean asc = true
boolean desc = true
String str 

print "enter numbers or -1 to finish\n"
str = System.console().readLine()
a = Integer.parseInt(str)

str = System.console().readLine()
b = Integer.parseInt(str)

while (b!=-1 && a!=-1){	
	if (b-a != 1 ) asc = false
	if (b-a != -1 ) desc = false
	a = b	
	str = System.console().readLine()
	b = Integer.parseInt(str)
}

if (asc || desc) print "yes"
	else print "no"