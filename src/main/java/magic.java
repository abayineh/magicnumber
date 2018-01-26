
public static void main(String[] args){
        int n=integer.parseInt(args[0]);
        collatz(n);
        system.out.println();
        }
public Static void collats(int n){
        system.out.print(n + "");
        if(n==1){
        return; }
        else if(n%2 ==0){
        collatz(n/2)
        }else {
        collatz (3*n +1);
        }
        }
