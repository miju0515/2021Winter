import java.util.*;
public class l1431 {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;

        int[] findMax=candies.clone();
        int kids=candies.length;
        List<Boolean> answer=new ArrayList<Boolean>();
        Arrays.sort(findMax);
        int max=findMax[kids-1];

        for(int i=0;i<kids;i++){
            if((candies[i]+extraCandies)>max){
                answer.add(true);
            }else{
                answer.add(false);
            }
        }
    }
}
