//////////////////////////////////////////////////////////////
/**
 * �͂����̎����m�F�T���v���R�[�h
 *
 */
public class Hagaki implements Hagakivable{
	
	// �O���擾
	public String getZenbun(){
		return "LINE1";
	}

	// �{���擾
	public String getHonbun(){
		return "LINE2";
	}

	// �㕶�擾
	public String getAtobun(){
		return "LINE3";
	}
	
	// �{���o��
	public void outHagaki(){
		System.out.println("-----------------------------------------------");
		System.out.println(this.getZenbun());
		System.out.println(this.getHonbun());
		System.out.println(this.getAtobun());
	}
	
}
