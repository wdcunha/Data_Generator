import java.io.DataInputStream;
import java.io.IOException;

public class StartDataGen {

	public StartDataGen() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		NifValidation nv = new NifValidation();

		DataInputStream type = new DataInputStream (System.in);

		System.out.print("Add the NIF number: ");

		String entry = type.readLine();
		
		System.out.println("NIF number " + nv.nifValid(entry));
//		if (!nv.nifValid(entry)) {
//		}
	}

}
