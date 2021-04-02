import java.io.*;
import java.util.*;

class SSCRIPT {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-->0){            
            long n = sc.nextLong();
            long K = sc.nextLong();
            String s = sc.next();
            boolean flag = true;
            long count = 1;
            if(K>n){
                pw.println("NO");
            }
            if(K==1){
                for(int i = 0;i<s.length();i++){
                    if(s.charAt((int)i)=='*'){
                        pw.println("YES"); 
                        flag = false;
                        break;
                    }
                }
            }
            else{
                for(long i = 1;i<s.length();i++){
                if(s.charAt((int)i-1)=='*'&&s.charAt((int)i)=='*'){
                    count++;
                    if(count==K){ 
                        pw.println("YES"); 
                        flag = false;
                        break;
                    }
                }
                else{
                    count = 1;
                }
            }
            }
            if(flag)
            pw.println("NO");
            
        }        
        sc.br.close();
        pw.close();
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

