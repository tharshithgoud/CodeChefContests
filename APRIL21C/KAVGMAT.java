import java.util.*;
import java.io.*;

class KAVGMAT {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long n = sc.nextLong();
            long m = sc.nextLong();
            long k = sc.nextLong();            
            long[][] array = new long[(int)n+1][(int)m+1];
            for(long i = 1;i<=n;i++){
                for(long j = 1;j<=m;j++){
                    array[(int)i][(int)j] = sc.nextLong();
                }
            }
            
            
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=m;j++){
                    array[i][j] += array[i][j-1];
                }
            }
            
            
            for(int j = 1;j<=m;j++){
                for(int i = 1;i<=n;i++){
                    array[i][j] += array[i-1][j];
                }
            }
            
            long solution = 0;
            
                for(int len = 1;len<=n;len++){
                for(int i = 1;i<=n-len+1;i++){
                    int left = 1;
                    int right = (int)m-len+1;
                    int pivot = 0;
                    int mid = 0;
                    boolean check = false;
                    while(left <= right){
                        mid = (left + right)/2;
                        long temp = array[i+len-1][mid+len-1]-array[i+len-1][mid-1]-array[i-1][mid+len-1]+array[i-1][mid-1];
                        if(temp>=k*len*len){
                            right = mid-1;
                            pivot = mid;
                            check = true;
                        }
                        else{
                            left = mid+1;
                        }
                    }
                        if(check){
                            solution+=(int)(m-len-pivot+2);
                    }
                }
            }
            
            
            System.out.println(solution);           
        }
    }
    static class Scanner{
        BufferedReader br;
        StringTokenizer st;
    
        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
    
        public Scanner(FileReader f) {
            br = new BufferedReader(f);
        }
    
        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
    
        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    
        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    
        public float nextFloat() throws IOException {
            return Float.parseFloat(next());
        }
    
        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    
        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(next());
            }
            return arr;
        }
    }
}
