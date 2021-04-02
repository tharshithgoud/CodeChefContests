import java.util.*;
import java.io.*;

class SDICE
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long a[] = {16,32,44,55};
            if(n==1){
                pw.println(20);
                continue;
            }
            else if(n==2){
                pw.println(36);
            }
            else if(n==3){
                pw.println(51);
            }
            else if(n==4){
                pw.println(60);
            }
            else if(n>4){
                long mod = n%4;
                long multiple = n/4;
                pw.println(a[(int)mod]+44*multiple);
            }
        }
        pw.close();
        sc.br.close();
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
