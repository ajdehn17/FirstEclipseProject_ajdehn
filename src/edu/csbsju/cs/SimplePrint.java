/**
 * 
 */
package edu.csbsju.cs;

/**
 * @author ajdehn
 *
 */
public class SimplePrint {

	private String pName;
	private String pAge;
	/**
	 * 
	 */
	public SimplePrint() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}

	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}

	/**
	 * @return the pAge
	 */
	public String getpAge() {
		return pAge;
	}

	/**
	 * @param pAge the pAge to set
	 */
	public void setpAge(String pAge) {
		this.pAge = pAge;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Aj Dehn");
		for(int i=0; i<args.length;i++){
			System.out.println("args[ " + i + " ] = " + args[i] );
			}
	}

}
