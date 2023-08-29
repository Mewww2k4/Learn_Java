import java.text.DecimalFormat;
public class TinhLaiSuat {
    public static int Calculate(double p, double r, double t){
        double ls = (p + r + t)/100;
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("Lai Suat : " + f.format(ls) + "%");
        return 0;
    }
    public static void main(String[] args)
    {
        TinhLaiSuat obj = new TinhLaiSuat();
        obj.Calculate(200,0.02,3);
    }
}
