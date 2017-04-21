package com.pethelpapp.messageformat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.compress.compressors.CompressorException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FSTAndGzipCompressionSample {

	public static void main(String[] args) {
		FSTAndGzipCompressionSample test = new FSTAndGzipCompressionSample();
		try {
			InputStream is = FSTAndGzipCompressionSample.class.getResourceAsStream("/fornecedores.json");
			File file = new File("fornecedores.json");
			test.InputStreamToFile(is, file);
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader(file));
			JSONObject jsonObject = (JSONObject) obj;
			String jsonString = jsonObject.toJSONString();
			// 1
			byte[] fstArray = FastSerializationAndCompressionHelper.fromObjectToFastSerializationByteArray(jsonString);
			// 2
			byte[] gzipArray = FastSerializationAndCompressionHelper.fromFastSerializationToGzipArray(fstArray);
			// 3
			@SuppressWarnings("unused")
			byte[] retrievedFsArray = FastSerializationAndCompressionHelper.fromGizpArrayToFastSerialization(gzipArray);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (CompressorException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void InputStreamToFile(InputStream in, File file) {
		try {
			OutputStream out = new FileOutputStream(file);
			byte[] buf = new byte[in.available()];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
