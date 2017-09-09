package singleton;

import java.io.ObjectStreamException;

/**
 * 双重检查锁
 * @author td
 *
 */
public class DoubleCheckLockSingleton {
	private volatile static DoubleCheckLockSingleton instance;
	
	private DoubleCheckLockSingleton() {
	}

	public static DoubleCheckLockSingleton getInstance() {
		//当instance不为null时不会进入同步方法,减少了同步开销
		if (instance == null) {
			//当第一次调用getInstance时,同步锁可以保证多线程下实例唯一
			synchronized(DoubleCheckLockSingleton.class){
				if (instance == null) {
					instance = new DoubleCheckLockSingleton();
				}
			}
		}
		return instance;
	}
	
	//为了防止对象在反序列化时创建新的对象，需要加上如下方法
	private Object readResole() throws ObjectStreamException {
	        return instance;
	}
	
}
