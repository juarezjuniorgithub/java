package com.juarezjunior.fastserialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.compress.compressors.CompressorException;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.compressors.CompressorOutputStream;
import org.apache.commons.compress.compressors.CompressorStreamFactory;
import org.apache.commons.compress.utils.IOUtils;
import org.nustaq.serialization.FSTConfiguration;

public class FastSerializationAndCompressionHelper {

	private static FSTConfiguration conf = null;
	private static final Logger LOGGER = Logger.getLogger(FastSerializationAndCompressionHelper.class.getName());

	public static byte[] fromObjectToFastSerializationByteArray(Object toConvert) {
		if (conf == null) {
			conf = FSTConfiguration.createDefaultConfiguration();
		}
		byte[] byteArrayConverted = conf.asByteArray(toConvert);
		if (LOGGER.isLoggable(Level.INFO)) {
			LOGGER.log(Level.INFO, new StringBuilder("fromObjectToFastSerializationByteArray - SIZE: ")
					.append(byteArrayConverted.length).toString());
		}

		return byteArrayConverted;
	}

	public static Object fromFastSerializationByteArrayToObject(byte[] toConvert) {
		if (conf == null) {
			conf = FSTConfiguration.createDefaultConfiguration();
		}
		Object obj = null;
		obj = conf.asObject(toConvert);
		String objNull = obj == null ? "Object was not built, result is null" : obj.toString();
		if (LOGGER.isLoggable(Level.INFO)) {
			LOGGER.log(Level.INFO,
					new StringBuilder("fromFastSerializationToCollection - toString: ").append(objNull).toString());
		}
		return obj;
	}

	public static Object[] fromFastSerializationToCollection(byte[] arrayToConvert) {
		if (conf == null) {
			conf = FSTConfiguration.createDefaultConfiguration();
		}
		Object[] convertedCollectionToBeReturned = null;
		convertedCollectionToBeReturned = (Object[]) conf.asObject(arrayToConvert);
		if (LOGGER.isLoggable(Level.INFO)) {
			LOGGER.log(Level.INFO, new StringBuilder("fromFastSerializationToCollection - SIZE: ")
					.append(convertedCollectionToBeReturned.length).toString());
		}
		return convertedCollectionToBeReturned;
	}

	public static byte[] fromCollectionToFastSerializationBytes(Object collectionToConvert) {
		if (conf == null) {
			conf = FSTConfiguration.createDefaultConfiguration();
		}
		byte[] convertedCollectionFastSerializationArray = conf.asByteArray(collectionToConvert);
		LOGGER.log(Level.INFO, new StringBuilder("fromCollectionToFastSerializationBytes - SIZE: ")
				.append(convertedCollectionFastSerializationArray.length).toString());
		return convertedCollectionFastSerializationArray;
	}

	public static byte[] fromFastSerializationToGzipArray(byte[] convertedArrayToCompact)
			throws CompressorException, IOException {
		ByteArrayInputStream convertedInputStream = new ByteArrayInputStream(convertedArrayToCompact);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		final CompressorOutputStream outZipped = new CompressorStreamFactory()
				.createCompressorOutputStream(CompressorStreamFactory.GZIP, baos);
		IOUtils.copy(convertedInputStream, outZipped);
		outZipped.flush();
		outZipped.close();
		if (LOGGER.isLoggable(Level.INFO)) {
			LOGGER.log(Level.INFO, new StringBuilder("fromFastSerializationToGzipArray - GZIPPED SIZE: ")
					.append(baos.toByteArray().length).toString());
		}
		return baos.toByteArray();
	}

	public static byte[] fromGizpArrayToFastSerialization(byte[] compressedArraytoDecompress)
			throws CompressorException, IOException {
		ByteArrayInputStream compressedInputStream = new ByteArrayInputStream(compressedArraytoDecompress);
		CompressorInputStream inZipped = new CompressorStreamFactory()
				.createCompressorInputStream(CompressorStreamFactory.GZIP, compressedInputStream);
		ByteArrayOutputStream bosUnzipped = new ByteArrayOutputStream();
		IOUtils.copy(inZipped, bosUnzipped);
		inZipped.close();
		if (LOGGER.isLoggable(Level.INFO)) {
			LOGGER.log(Level.INFO, new StringBuilder("fromGizpArrayToFastSerialization - FST SIZE: ")
					.append(bosUnzipped.toByteArray().length).toString());
		}
		return bosUnzipped.toByteArray();
	}

}
