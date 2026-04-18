import java.util.*;
class Main2 {

    static void Sequence(int start,int sum ,List<Integer> list,ArrayList<ArrayList<Integer>> result ){
        if(sum==0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(sum<0){
            return;
        }
        for(int i=start;i>=1;i--){
            list.add(i);
            Sequence(i,sum-i,list,result);
            list.remove(list.size()-1);
        }
    }
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Sequence(n,n,list,result);
        return result;
    }

    public static void main(String[] args) {
        Main2 obj = new Main2();
        System.out.println(obj.UniquePartitions(3));
    }
}