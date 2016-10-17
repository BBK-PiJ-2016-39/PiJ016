int a,b,i,n
String str 

print "enter a number\n"
str = System.console().readLine()
a = Integer.parseInt(str)

print "enter another number\n"
str = System.console().readLine()
b = Integer.parseInt(str)

n=0
for(i=0 ; i<a; i++){
	n+=b
}

print "result is: " + n