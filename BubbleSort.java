public class BubbleSort
{
public static void main(String[] args){
int a [] ={1,2,-5,7,2,4,-1};
int b = a.length;
for(int i =0; i<b-1;){
i++;
for(int j=0;j<b-1;j++){
if(a[j+1]<a[j]) {
int temp = a[j+1];
a[j+1]=a[j];
a[j]=temp;
}
}
}
for(int e :a){
System.out.print(e);
}
}
}