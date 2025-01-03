#include <stdio.h>
#include <windows.h>>
main()
{
    int y, sum_odd, sum_even;
    int x[10];

    for (y = 0; y <= 9; y++)
    {
        printf("Enter number for index [%d]: ", y);
        scanf("%d", &x[y]);
                system("CLS");
    }
    printf("\nODD NUMBERS\n");

    for (y = 0; y <= 9; y++)
    {

        if (x[y] / 2 * 2 != x[y])
        {
            printf("\nx[%d] = %d", y, x[y]);
            sum_odd += x[y];
        }
          
    }
      printf("\nSum of odd: %d", sum_odd  );
    printf("\n");
    printf("\nEVEN NUMBERS\n");

    for (y = 0; y <= 9; y++)
    {
        if (x[y] / 2 * 2 == x[y])
        {

            printf("\nx[%d] = %d", y, x[y]);
             sum_even += x[y];
        }
    }
    printf("\nSum of even: %d", sum_even  );
}