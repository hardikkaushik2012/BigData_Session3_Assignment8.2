package udf;

import org.apache.hadoop.hive.ql.exec.UDF;
import java.io.*;

public class concat_ws extends UDF{
	public String string concat_ws(string SEP, string array[]){
		for ( int i=0 ; i <= array.length() ; i++)
		{
			array[i]=array[i].concat(SEP);
			return(array[i]);
		}
	}
}