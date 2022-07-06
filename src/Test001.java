/**
 * @description:
 * @ClassName: Test001
 **/
public class Test001 {
    public static void main(String[] args) {
        lableB:
        for(int i=0;i<3;i++){
            lableA:
            for(int j=0;j<3;j++){
                System.out.println(j);
                if(j==1){
                    break lableB;
                }
            }
        }
        System.out.println("over!");


        String str = "adsfaxsdfas沙发上案发地方";
        System.out.println(str.indexOf('a',5));
    }
}
