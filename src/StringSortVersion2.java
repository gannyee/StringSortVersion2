import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ����Collections.sort()�����Է���ΪString��List���а汾2����
 * 1.����List<String>֮�����������ʮ������ַ���
 * 2.ÿ���ַ�������Ϊ10�����������
 * 3.ÿ���ַ�����ÿ���ַ���Ϊ������ɵ��ַ������ַ������ظ�
 * 4.ÿ������ַ����������ظ�
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
					//����randomString������������ַ���
					str = randomString(stringLength);
				}while(stringList.contains(str));
				System.out.println("��Ҫ��ӵ��ַ���: '" + str + "'" );
				stringList.add(str);
			}
			System.out.println("--------����ǰ--------" );
			for(String str1: stringList)
				System.out.println("Ԫ��: " + str1 );
			Collections.sort(stringList);
			System.out.println("--------�����--------" );
			for(String str1: stringList)
				System.out.println("Ԫ��: " + str1 );
		}
	
	/**
	 * ��������ַ���
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
