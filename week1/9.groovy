int a,b
boolean result = true
String str 

print "enter numbers or -1 to finish\n"
str = System.console().readLine()
a = Integer.parseInt(str)

str = System.console().readLine()
b = Integer.parseInt(str)

while (b!=-1 && a!=-1){	
	if (b-a != 1) result = false
	a = b	
	str = System.console().readLine()
	b = Integer.parseInt(str)
}

print "rule respected : " + result