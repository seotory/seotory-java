package pattern.singleton;

import java.io.Serializable;

public class SerializedInitializtion implements Serializable {

		private static final long serialVersionUID = -7604766932017737115L;
		private SerializedInitializtion() {}
		private static class Helper {
			private static final SerializedInitializtion instance = new SerializedInitializtion();
		}
		
		public static SerializedInitializtion getInstance () {
			return Helper.instance;
		}
		
		protected Object readResolve () {
			return getInstance();
		}
}
