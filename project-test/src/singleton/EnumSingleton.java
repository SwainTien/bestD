package singleton;

public class EnumSingleton {
	private EnumSingleton(){
		
	}
	/**
	 * enum SomeThing等同于 class SomeThing extends enum
	 * @author td
	 *
	 */
	public enum SomeThing{
		INSTANCE;//等同于 public static final SomeThing instance;只能被实例化一次
		private EnumSingleton instance;
		
		SomeThing(){
			instance = new EnumSingleton();
		}
		
		public EnumSingleton getInstance(){
			return instance;
		}
	}
}
