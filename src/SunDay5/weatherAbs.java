package SunDay5;


public abstract class weatherAbs implements Weather {

	@Override
	public String getInfo(String loc) {
		// TODO Auto-generated method stub
		String str = null;
		System.out.println(str.length());
		if("���B".equals(loc)) {
			return "�����";
		}else if("�Ͼ�".equals(loc)) {
			return "�";
		}else {
			return "��";
		}
		
	
	}

}
