#include<header.h>
#define p printf 

int highest(int x[])
{
	int high,y;
	for (y=0;y<=4;y++)
		if (x[y] > high)
        	high = x[y];
	return high;
}
int lowest(int x[])
{
	int low,y;
	for (y=0;y<=4;y++)
		if (x[y] < low)
        	low = x[y];
	return low;
}
main()
{
	
	int x[5],y,high=0,low=0;
	for (y=0;y<=4;y++){
		p("Enter a Number for index %d - ",y); 
		scanf("%d",&x[y]);
		}
	high=highest(x);
	low=lowest(x);
	p("\nHighest number is %d",high);
	p("\nLowest number is %d",low);
}

