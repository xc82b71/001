//////////////////////////////////////////////////////////////
/**
 * はがきの実装確認サンプルコード
 *
 */
public class Hagaki implements Hagakivable{
	
	// 前文取得
	public String getZenbun(){
		return "LINE1";
	}

	// 本文取得
	public String getHonbun(){
		return "LINE2";
	}

	// 後文取得
	public String getAtobun(){
		return "LINE3";
	}
	
	// 本文出力
	public void outHagaki(){
		System.out.println("-----------------------------------------------");
		System.out.println(this.getZenbun());
		System.out.println(this.getHonbun());
		System.out.println(this.getAtobun());
	}
	
}
