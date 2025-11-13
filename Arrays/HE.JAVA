int divide(int x, int y)
{
    if (y != 0)                     // Condition 1
    {
        return x / y;
    }
    else if (x == 0 && y > 2)       // Condition 2 (compound condition)
    {
        return 1;
    }
    else
    {
        printf("div by zero\n");        return 0;
   }
}