
//////////////////////////////////////////////////////////////
 
/**
 * はがきのサンプルコード
 *
 */
public class TestHagaki{
	
	public static void main(String[] args){

		// インスタンス作成
		Hagakivable hagaki = new Hagaki();
//		hagaki.outHagaki();
		
		// インスタンス作成
		hagaki = new Nenga();
		hagaki.outHagaki();
		
		// インスタンス作成
		hagaki = new Syochu();
		hagaki.outHagaki();

		// インスタンス作成
		hagaki = new Zansyo();
		hagaki.outHagaki();

	}
}