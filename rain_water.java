
/*
 * https://www.geeksforgeeks.org/trapping-rain-water/
 */
public class rain_water_trap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,5,0,7,2,6};
		int len = arr.length;
		System.out.println(water(arr,len));
	}
	
	static int water(int[] a,int l) {
		int ans = 0;
		for(int i= 1; i<l-1;i++) {
			int left_max = left_max(a, i);
			int right_max = right_max(a, i, l);
			ans = ans + min(left_max,right_max) - a[i];
		}
		return ans;
	}
	
	static int left_max(int a[],int i) {
		int maxi = 0;
		for(int j=0;j<=i;j++) {
			maxi = max(maxi,a[j]);
		}
		return maxi;
	}
	
	static int right_max(int a[],int i,int len) {
		int maxi = 0;
		for(int j=i;j<len;j++) {
			maxi = max(maxi,a[j]);
		}
		return maxi;
	}
	
	static int max(int a,int b) {
		if (a>b)
			return a;
		else
			return b;
	}
	static int min(int a,int b) {
		if (a>b)
			return b;
		else
			return a;
	}
	
}
