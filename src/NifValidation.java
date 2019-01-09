
public class NifValidation {

	public boolean nifValid(String nifNumber) {
		try{
			final int nifLeng = 9;
			
			if (!nifNumber.matches("[0-9]+") || nifNumber.length() != nifLeng) {
				System.out.println("Invalid characters for NIF number added!!!");
				return false;
			} else if (nifNumber.charAt(0) != '1') {
				if (nifNumber.charAt(0) != '2') {
					System.out.println("Out of range NIF number (1 and 2)!!!");
					return false;
				}
			}
			int contrNum=0;
			
			// calculate control number sum
			for (int i=0; i < nifLeng-1; i++){
				
				contrNum += (nifNumber.charAt(i)-'0') * (nifLeng-i);
				System.out.println("contrNum: " + contrNum);
			}
			
			int checkContrNum = contrNum % 11;
			
			if (checkContrNum == 0) {
				checkContrNum = 0;
			} else if(checkContrNum == 1) {
				checkContrNum = 9;
			} else {
				checkContrNum = 11 - checkContrNum;
			}

			return checkContrNum == nifNumber.charAt(nifLeng-1)-'0';
			
		} catch (Exception e){
			return false;
		} 
	}
}
