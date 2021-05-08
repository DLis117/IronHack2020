
public class CodingChallenge1
{
    public Integer maximum(Integer[] numList) {
        Integer max=numList[0];
        for (int i=1;i<numList.length;++i)
        {
            if(numList[i]>max)
            {
                max=numList[i];
            }
        }
        return max;
    }
}
