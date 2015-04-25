import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 利用Collections.sort()方法对泛型为String的List进行版本2排序
 * 1.创建List<String>之后，往其中添加十条随机字符串
 * 2.每条字符串长度为10以内随机整数
 * 3.每条字符串的每个字符都为随机生成的字符串，字符可以重复
 * 4.每条随机字符串不可以重复
 * @param args
 * */
	public class StringSortVersion2 {
	
		List<String> stringList = new ArrayList<String>();
		
		public void stringSort(){
			Random random = new Random();
			String str;
			for(int i = 0; i < 10; i ++){
				int stringLength = random.nextInt(10);
				do{
					//调用randomString方法产生随机字符串
					str = randomString(stringLength);
				}while(stringList.contains(str));
				System.out.println("将要添加的字符串: '" + str + "'" );
				stringList.add(str);
			}
			System.out.println("--------排序前--------" );
			for(String str1: stringList)
				System.out.println("元素: " + str1 );
			Collections.sort(stringList);
			System.out.println("--------排序后--------" );
			for(String str1: stringList)
				System.out.println("元素: " + str1 );
		}
	
	/**
	 * 产生随机字符串
	 * @param args
	 */
	public String randomString(int length){
		String string = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		StringBuffer str = new StringBuffer();
		for(int i = 0;i < length;i ++){
			int index = random.nextInt(62);
			str.append(string.charAt(index));
		}
		return str.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringSortVersion2 stv = new StringSortVersion2();
		stv.stringSort();
	}

}
