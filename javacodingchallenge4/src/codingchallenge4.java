public class codingchallenge4
{
    public double average(Integer[] numList) {
        double av=0;
        for(int i=0;i<numList.length;++i)
        {
            av+=numList[i];
        }
        av/=numList.length;
        return av;
    }
}
