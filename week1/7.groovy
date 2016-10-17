int a,b,c
int min,med,max

print "enter 3 numbers \n"
a = Integer.parseInt(System.console().readLine())
b = Integer.parseInt(System.console().readLine())
c = Integer.parseInt(System.console().readLine())

min=max=med=a

if (min > b) min = b
	else if (max < b) max=b

if (min > c) min = c
	else if (max < c) max=c

if(a!=min && a!=max) med = a 
if(b!=min && b!=max) med = b 
if(c!=min && c!=max) med = c 

println a + "," + b + "," + c
println min + "," + med + "," + max