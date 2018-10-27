public class Calculator {

    float x,u;


    public void setU(float u) {
        this.u = u;
    }


    public double calculateF1(){
        System.out.print("calculated F1, result = ");
        System.out.print(u);
        return 3+Math.pow(x+u,4);
    }
    public double calculateF2(){
        System.out.print("calculated F2, result = ");
        return x*x*x+x*x-15;
    }
    public double calculateF3(){
        System.out.print("calculated F3, result = ");
        return Math.tan(Math.PI*(x+u));
    }
}
