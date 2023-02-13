package ArrayConcept;

public class MissingEvenNum {

	public static void main(String[] args) {
		int a[]={2,4,8,12,16,20};

for(int i=0;i<a.length-1;i++)
{
    int n=a[i+1]-a[i];
    int count=1;
    while(n>1)
    {
        int val=a[i]+count;
        if(val%2==0)
        {
            System.out.print(val+" ");
        }
        n--;
        count++;
    }
}
}
}