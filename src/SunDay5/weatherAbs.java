package SunDay5;


public abstract class weatherAbs implements Weather {

	@Override
	public String getInfo(String loc) {
		// TODO Auto-generated method stub
		String str = null;
		System.out.println(str.length());
		if("大連".equals(loc)) {
			return "天氣晴";
		}else if("南京".equals(loc)) {
			return "陰";
		}else {
			return "雨";
		}
		
	
	}

}
