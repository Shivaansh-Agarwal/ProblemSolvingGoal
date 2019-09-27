import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buff.readLine());
        String inputStr[] = buff.readLine().split(" ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(inputStr[i]);
        boolean ans = true;
        for(int i=0;i<n-1;i++){
            if(arr[i]==0)
                continue;
            else if(arr[i]==arr[i+1]){
                arr[i] = 0;
                arr[i+1] = 0;
                i++;
            }
            else if(arr[i]>arr[i+1]){
                ans = false;
                break;
            }
            else if(arr[i]<arr[i+1]){
                arr[i+1] = arr[i+1] - arr[i];
                arr[i] = 0;
            }
        }
        if(arr[n-1]!=0){
            ans = false;
        }
        if(ans)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
