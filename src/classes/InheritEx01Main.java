package classes;

public class InheritEx01Main extends InheritEx01{

		int vI03 = 300;
		
		public static void main(String[] args) {
			InheritEx01Main obj =  new InheritEx01Main();
			System.out.println(obj.vI01 + obj.vI03);
			obj.mInh01();
		}

	}

}
