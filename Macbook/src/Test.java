import java.math.BigDecimal;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.DecimalDataArea;
import com.ibm.as400.access.QSYSObjectPathName;

public class Test {
	 public static void main(java.lang.String[] args) 
			    throws Exception
			    {
	
	 AS400 system = new AS400("ctciha9x.rchland.ibm.com","davidyu","taiwan12");
     // Create a DecimalDataArea object.
  QSYSObjectPathName path = new QSYSObjectPathName("testlib", "MYDATA", "DTAARA");
  path.setAspName("iasp02");
  DecimalDataArea dataArea = new DecimalDataArea(system, path.getPath());
  System.out.println("what is path="+path.getPath());
 

 
  
     // Create the decimal data area on the server using default values.
  dataArea.create();
     // Clear the data area.
  dataArea.clear();
     // Write to the data area.
  dataArea.write(new BigDecimal("1.2"));
     // Read from the data area.
  BigDecimal data = dataArea.read();
     // Delete the data area from the server.
//  dataArea.delete();
}
}
