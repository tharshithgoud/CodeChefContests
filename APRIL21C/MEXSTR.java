import java.util.*;
import java.io.*;


public class MEXSTR {
    public static void main(String[] args) {
        
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
