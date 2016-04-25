import java.text.DecimalFormat;

public class Package {

  private int uiLength;
  private int uiWidth;
  private int uiDepth;
  private int uiWeight;

  public Package(int width, int length, int depth, int weight) {
    uiLength = length;
    uiWidth = width;
    uiDepth = depth;
    uiWeight = weight;
  }
  public int getWeight(){
    return uiWeight;
  }

  public int getLength(){
    return uiLength;
  }

  public int getWidth(){
    return uiWidth;
  }

  public int getDepth(){
    return uiDepth;
  }

  public int getVolume(){
    int vol = uiLength * uiWidth * uiDepth;
    return vol;
  }

  public String getShipped(){
    DecimalFormat df = new DecimalFormat("####.00");
    int vol = uiLength * uiWidth * uiDepth;
    double cost =0;
    if (vol >= 40){
      cost = (vol * uiWeight) * .8;
    } else {
      cost = (vol * uiWeight) * .5;
    }
    return df.format(cost);
  }
}
