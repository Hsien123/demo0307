import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @ClassName: Demo06
 **/
public class Demo06 {
    public static int getNum(int num){
        List list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            list.add(i);
        }
        int count = 1;
        for (int j = 0;list.size()!=1 ; j++) {
            if(j==list.size()){
                j=0;
            }
            if(count%5==0){
                list.remove(j--);
            }
            count++;
        }
        return (int) list.get(0);
    }

    public static void main(String[] args) {
        getNum(100);
    }
}
