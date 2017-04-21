package com.juarezjunior.fastserialization;

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
			File file = new File("fornecedores.json");
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

}
