#include <stdio.h>

float fun(float x);//fun为你的函数
float text(float (*f)(float), float a, float b);
int main(void)
{
	float a, b, sum;
	
	printf("Please enter the lower and upper: ");
	while(scanf("%f %f", &a, &b) == 2)
	{
		sum = text(fun, a, b);
		printf("The integral is %.4f.\n", sum);
		printf("Please enter the lower and upper: ");
	}

	return 0;
}
float fun(float x) //假设f(x) = 1 + x * x
{
	return 1 + x * x;
}

float text(float (*f)(float), float a, float b)
{
	float s, h;
	int n = 100, i;

	s = ((*f)(a) + (*f)(b)) / 2;
	h = (b - a) / 100;
	for(i = 1; i < n; i++)
		s += (*f)(a + i * h);
	return s * h;
}
