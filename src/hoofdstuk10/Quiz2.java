
package hoofdstuk10;

/**
 * @author jordi
 * 
 */
public class Quiz2 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0] = 3;
		arr[1] = 7;
		arr[4] = 3;
		arr[3] = 1;
		arr[1] = 8;
		
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] >= 3) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
