class gitassign
{
int partition(int arr[], int l, int h)
{
int pivot = arr[h]; 
int i = (l-1);
for (int j=l; j<h; j++)
{
if (arr[j] <= pivot)
{
i++;
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}
int temp = arr[i+1];
arr[i+1] = arr[h];
arr[h] = temp;
return i+1;
}
void sort(int arr[], int l, int h)
{
if (l < h)
{
int pi = partition(arr, l, h);
sort(arr, l, pi-1);
sort(arr, pi+1, h);
}
}
static void printArray(int arr[])
{
int n = arr.length;
for (int i=0; i<n; ++i)
System.out.print(arr[i]+" ");
System.out.println();
}
public static void main(String args[])
{
int arr[] = {56, 2, 34, 36, 12, 69};
int n = arr.length;
 
gitassign ob = new gitassign();
ob.sort(arr, 0, n-1);
 
System.out.println("Sorted array is:");
printArray(arr);
    }
}
