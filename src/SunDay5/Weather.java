package SunDay5;

public interface Weather {
	// 定义属性 DAY
	public static final int DAY = 7;

    //定义一个获取时间方法
	public abstract String getTime();

    //定义一个获取天气信息
	public abstract String getInfo(String loc);

}
