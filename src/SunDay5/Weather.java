package SunDay5;

public interface Weather {
	// �������� DAY
	public static final int DAY = 7;

    //����һ����ȡʱ�䷽��
	public abstract String getTime();

    //����һ����ȡ������Ϣ
	public abstract String getInfo(String loc);

}
