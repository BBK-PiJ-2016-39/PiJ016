int a,b,result,remainder
String str 

print "enter a number\n"
str = System.console().readLine()
a = Integer.parseInt(str)

print "enter another number\n"
str = System.console().readLine()
b = Integer.parseInt(str)

remainder=a

while (remainder>=b){
	result+=1;
	remainder-=b
}

print "result: " + result + " remainder " + remainder 