package Lab.MathOperations;

public class MathOperation {

//    public int add( int a, int b){
//        return a+b;
//    }
//    public int add( int a, int b, int c){
//        return a+b+c;
//    }
//    public int add( int a, int b, int c, int d){
//        return a+b+c+d;
//    }


    public int add(int... element){
        int sum = 0;

        if (element.length == 2){
            return element[0]+element[1];
        }else

            for (int i : element) {
                sum+=i;
            }

        return sum;
    }
}
