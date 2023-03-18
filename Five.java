public class Five {
    
public static void main(String[] args)
{
int first = 10000;
int last = 100000;
int i, temp1, temp2, rem, n = 0, res = 0;


for(i = first + 1; i < last; i++)
{
temp2 = i;
temp1 = i;

while (temp1 != 0)
{
temp1 /= 10;
n++;
}

while (temp2 != 0)
{
rem = temp2 % 10;
res += Math.pow(rem, n);
temp2 /= 10;
}

if (res == i) {
System.out.print(i + " ");
}

n = 0;
res = 0;

}

}

}

    
