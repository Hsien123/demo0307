/**
 * @description:
 * @ClassName: Test002
 **/
public class Test002 {
    /**
     * @Description: 百分数转小数
     * @Param: []
     * @return: float
     */
    private float changePercentToPoint(String percent){
        return new Float(percent.substring(0,percent.indexOf("%")));
    }
    /**
     * @Description: 小数转百分数
     * @Param: [point]
     * @return: java.lang.String
     */
    private String changePointToPercent(float point){
        return String.valueOf(point*100)+"%";
    }
}
