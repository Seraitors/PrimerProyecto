package Arraez;

public class OtroEjmplo {
    public static void main(String[] args) {
        int[]nums ={1,2,3,4,5,6,7,8,9,10};



        boolean ordenado = true;

        for (int i = 0; i <nums.length-1 ; i++) { // me quedo me la oemnultima poscion
            if (nums[i] <= nums[i+1]){
                continue;
            }else {
                ordenado=false;
                break;
            }

        }

    if (ordenado){
        System.out.println("ordenador");
    }else {
        System.out.println("desordenador");
    }

    }
}
