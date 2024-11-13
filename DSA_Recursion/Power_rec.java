class Power_rec{
    public int power(int x , int n){
        if(n==0){
            return 1;
        }
        return x* power(x,n-1);
    }

    public static void main(String[] args){
        int x = 2;
        int n = 3;
    
        Power_rec obj = new Power_rec();
        System.out.println("Ans is :" + obj.power(x,n));
        
    }
}

