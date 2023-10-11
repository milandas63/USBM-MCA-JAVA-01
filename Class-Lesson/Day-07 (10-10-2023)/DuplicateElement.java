package timeAndSpaceCoplexity;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,5,6,8};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate number is:"+arr[i]);
				}
			}
		}
	}

}
