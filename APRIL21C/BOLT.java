import java.io.*;
import java.util.*;

class BOLT {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            double k1 = sc.nextDouble();
            double k2 = sc.nextDouble();
            double k3 = sc.nextDouble();
            double v = sc.nextDouble();
            double ans = 100/(k1*k2*k3*v);
            ans *= 100;
            ans = Math.round(ans); 
            if(ans<958) pw.println("YES");
            else pw.println("NO");
            pw.flush();       
        }
        sc.br.close();
        pw.close();
    }
}
class Scanner{
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
