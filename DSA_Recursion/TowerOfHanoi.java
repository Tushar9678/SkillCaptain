public class TowerOfHanoi{
    public static void main(String[] args){

        char source = 'A';
        char dest = 'C';
        char helper = 'B';
  
        solution(3, 'A','C','B');   
    }

    static void solution(int n, char source, char dest, char helper){

        //Base case 
        if(n==1){
            System.out.println("Move disk 1 from " + source + " to " + dest);
            return;
        }

        solution(n-1, source , helper, dest); //(n-1) disks move from A->B using C as Helper and it is recursive call

        System.out.println("Move disk " + n + " from " + source + " to " + dest); // n^th disk move from A->C 
        
        solution(n-1, helper ,dest, source); //(n-1) disks move from B->C using A as helper and it is recursive call
    }
}