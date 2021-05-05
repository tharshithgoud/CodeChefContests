import java.util.*;
import java.io.*;



class MEXSTR {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            String s = sc.next();
            long len = s.length();
            int left = -1;
            for(int i = 0;i<len;i++){
                if(s.charAt(i)=='0'){
                    for(int j = left +1;j<=1;j++){
                        
                    }
                }
            }
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
