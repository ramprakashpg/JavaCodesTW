import java.util.ArrayList;
import java.util.List;
public class PythagoreanTriplet{
    private int a;
    private int b;
    private int c;
    private static int sum;
    private static int max;
    public static List<PythagoreanTriplet>l3 = new ArrayList<>();
    public static PythagoreanTriplet p = new PythagoreanTriplet();
    public PythagoreanTriplet(){
        
    }

    public PythagoreanTriplet(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static PythagoreanTriplet makeTripletsList(){
        return p;
}
    
    public static PythagoreanTriplet withFactorsLessThanOrEqualTo(int max1){
    max = max1;
    return p;
    }
    public static PythagoreanTriplet thatSumTo(int sum1){
        sum = sum1;
        return p;
    }
    public static List<PythagoreanTriplet> build(){
                   for(int i=1; i<=sum/3; i++){
                        for(int j=i+1; j<=(sum-i)/2;j++){
                            int k = sum-i-j;
                        if((i<=max && j<=max && k<=max)&&((i*i)+(j*j))==(k*k))
                        {
                            l3.add(new PythagoreanTriplet(i, j, k));
        }
            }
                }
        return l3;
    }
    @Override
    public boolean equals(Object p1){
        PythagoreanTriplet p = (PythagoreanTriplet)p1;
            if((p.a == this.a)&&(p.b == this.b)&&(p.c == this.c)){
                return true;
            }
        // }
        return false;
    }
}    
