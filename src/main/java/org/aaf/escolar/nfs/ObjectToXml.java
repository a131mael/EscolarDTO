package org.aaf.escolar.nfs;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;

public class ObjectToXml implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static int HTTP_COD_SUCESSO = 200;

	public static void main(String[] args) throws Exception {
		JAXBContext contextObj = JAXBContext.newInstance(NFSeDTO.class);

		Marshaller marshallerObj = contextObj.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		NF nf = new NF();
		nf.setValor_total("290,00");
		PrestadorNFS prestador = new PrestadorNFS();

		TomadorNFS tomador = new TomadorNFS();
		tomador.setCpfcnpj("06660604952");

		tomador.setBairro("Bela Vista");
		tomador.setCep("88104200");
		tomador.setCidade("Palhoca");
		tomador.setEmail("a131mael@gmail.com");
		tomador.setNome_razao_social("Abimael Aldevino Fidencio");
		tomador.setLogradouro("Rua assis brasil , 6714");

		ListaItensNFS listaItem = new ListaItensNFS();
		listaItem.setValor_tributavel("290,00");
		listaItem.setUnidade_valor_unitario("290,00");
		ItemNFS item = new ItemNFS();
		item.setLista(listaItem);
		NFSeDTO nfs = new NFSeDTO();

		nfs.setPrestador(prestador);
		nfs.setTomador(tomador);
		nfs.setNf(nf);
		nfs.setItens(item);

		nfs.setTeste(null);

		marshallerObj.marshal(nfs, new FileOutputStream("C:\\Sicoobnet\\RetornoCNAB\\question.xml"));

		enviarNFS("", "03660921000179", "stratus01");

	}

	private static void enviar() {
		try {
			String endereco = "http://sync.nfs-e.net/datacenter/include/nfw/importa_nfw/nfw_import_upload.php";

			URL url = new URL(endereco);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			if (con.getResponseCode() != HTTP_COD_SUCESSO) {
				throw new RuntimeException("HTTP error code : " + con.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((con.getInputStream())));

			System.out.println("------  Dados da Banda  -------- \n");
			System.out.println("Nome da Banda : " + br);

			con.disconnect();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static synchronized void enviarNFS(String pasta,String login,String senha) {
		System.out.println("ENVIANDO NOTAS FISCAIS  ........");
		
		try {
			DefaultHttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost(
					"http://sync.nfs-e.net/datacenter/include/nfw/importa_nfw/nfw_import_upload.php");
			File file = new File("C:\\Sicoobnet\\RetornoCNAB\\question.xml");
			MultipartEntity mpEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
			ContentBody cbFile = new FileBody(file);
			mpEntity.addPart("f1", cbFile);
			mpEntity.addPart("login", new StringBody(login));
			mpEntity.addPart("senha", new StringBody(senha));
			mpEntity.addPart("cidade", new StringBody("8223"));
			httppost.setEntity(mpEntity);
			System.out.println("executing request " + httppost.getRequestLine());
			System.out.println("Now uploading your file into uploadbox.com");
			HttpResponse response = httpclient.execute(httppost);
			System.out.println(response.getStatusLine());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

}