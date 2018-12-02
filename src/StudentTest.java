/**
 * 
 * @author 余周周
 *
 */
public class StudentTest {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("John");
		s1.setAge(40);
		s2.setName("John");
		s2.setAge(40);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("ֱ直接比较s1和s2是否相等：" + (s1==s2));
		System.out.println("ͨ通过重写的equals方法比较s1和s2是否相等：" + s1.equals(s2));
		System.out.println(s1);
		
		//测试git更新提交
	}
	

}
