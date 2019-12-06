public class MyCalculator {
    int n;
    int p;

    public long power(int n, int p) throws NegativeException, ZeroException{
        if (n < 0 | p < 0) {
            throw new NegativeException(n);
        }
        else if (p < 0) {
            throw new NegativeException(n);
        }
        else if (n==0 && p==0) {
            throw new ZeroException();
        }
        long k=1;
        for (int i = 1; i <=p ; i++) {
            k = k*n;
        }
        System.out.println("The result of the entered term is - " + k);
        return k;
    }

    public MyCalculator(int n, int p) {
        this.n = n;
        this.p = p;
    }
}

class NegativeException extends Exception {
    int number;

    public NegativeException(int number) {
        this.number = number;

    }

    public String toString() {
        return "n or p should not be negative";
    }
}

class ZeroException extends Exception {


    public String toString() {
        return "n and p should not be zero";
    }
}