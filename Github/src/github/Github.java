package github;

import java.io.FileNotFoundException;

import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQPreparedExpression;
import javax.xml.xquery.XQResultSequence;

import com.saxonica.xqj.SaxonXQDataSource;

public class Github {

	public static void main(String[] args) {
		
		//Hola Mundo
		//AnthonyAnthony
		
		
		String fichero = "gimnasio.xml";
		String query = "for $x in doc(\"" + fichero + "\") /clases/clase return $x";
		
		//String query = "for $x in doc(\"gimnasio.xml\")/clases/clase return $x";
		
		try {
			lanzarQuery(query);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (XQException e) {
			e.printStackTrace();
		}

	}
	
	private static void lanzarQuery(String query) throws FileNotFoundException, XQException{
		
		XQDataSource datasource = new SaxonXQDataSource();
		XQConnection conexion = datasource.getConnection();
		
		XQPreparedExpression expresion = conexion.prepareExpression(query);
		XQResultSequence resultado = expresion.executeQuery();
		
		while (resultado.next()) {
			System.out.println(resultado.getItemAsString(null));
		}
	}

}
