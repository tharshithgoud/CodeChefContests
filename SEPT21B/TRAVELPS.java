import java.io.*;
import java.util.*;

class TRAVELPS {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int tc = 0; tc < t; tc++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            String s = in.next();
            int time = 0;
            for (int i = 0; i < s.length(); i++) {
                int at = Integer.parseInt(s.charAt(i) + "");
                if (at == 0)
                    time += a;
                else
                    time += b;
            }
            System.out.println(time);
        }
    }

    static class Scanner {
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