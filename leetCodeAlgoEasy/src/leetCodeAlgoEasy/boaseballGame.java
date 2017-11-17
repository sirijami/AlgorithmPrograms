package leetCodeAlgoEasy;

public class boaseballGame {

	public static void main(String[] args) {
		String[] ops = {"5","2","C","D","+"};
		System.out.println(calPoints(ops));
	}
    public static int calPoints(String[] ops) {
    	int sum = 0;
        int valid[] = new int[ops.length];
        int v = -1;
        for (int i = 0; i < ops.length; i++) {
          if (ops[i].equals("C")) {
            sum -= valid[v];
            v--;
          } else if (ops[i].equals("D")) {
            int d = (valid[v] + valid[v]);
            v++;
            valid[v] = d;
            sum += d;
          } else if (ops[i].equals("+")) {
            int p = (valid[v] + valid[v - 1]);
            v++;
            valid[v] = p;
            sum += p;
          } else {
            int val = Integer.parseInt(ops[i]);
            v++;
            valid[v] = val;
            sum += val;
          }
        }

        return sum;
    }

}
