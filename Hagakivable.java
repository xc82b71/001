/**
 * はがきを抽象化したインタフェース
 */
public interface Hagakivable{
	
	// 前文取得
	public String getZenbun();
	
	// 本文取得
	public String getHonbun();

	// 後文取得
	public String getAtobun();
	
	// 本文出力
	public void outHagaki();
	

}
