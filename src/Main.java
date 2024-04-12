class funcSolver{
    int x;
    int a;
    int b;
    funcSolver(int x, int a, int b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }
    public void solve1(){
        int y = 3*x + 5;
        System.out.println("Result = " + y);
    }
    public void solve2(){
        if (a == b){
            System.out.println("Cant divide by zero, no solution");
        }else{
            int y = (a + b)/(a - b);
            System.out.println("Result = " + y);
        }
    }
    public void solve3(){
        if (b == 0){
            System.out.println("Cant divide by zero, no solution");
        }else{
            int y = 1;
            for (int i = 1; i <= (a*x / b); i++){
                y *= i;
            }
            System.out.println("Result = " + y);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        funcSolver f1 = new funcSolver(2, 0, 0);
        f1.solve1();
        funcSolver f2 = new funcSolver(1, 2, 3);
        f2.solve2();
        funcSolver f3 = new funcSolver(5, 4, 3);
        f3.solve3();

    }
}