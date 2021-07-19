package decoratorPattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {

	private int compressionLevel = 6;

	public CompressionDecorator(DataSource dataSource) {
		super(dataSource);
	}

	public int getCompressionLevel() {
		return compressionLevel;
	}

	public void setCompressionLevel(int compressionLevel) {
		this.compressionLevel = compressionLevel;
	}

	public void writeData(String data) {
		super.writeData(compressData(data));
	}

	public String readData() {
		return decompressData(super.readData());
	}

	private String compressData(String input) {
		byte[] data = input.getBytes();
		try {
			ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
			DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compressionLevel));
			dos.write(data);
			dos.close();
			bout.close();
			return Base64.getEncoder().encodeToString(bout.toByteArray());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	private String decompressData(String input) {
		byte[] data = Base64.getDecoder().decode(input);
		try {
			InputStream in = new ByteArrayInputStream(data);
			InflaterInputStream iin = new InflaterInputStream(in);
			ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
			int b;
			while ((b = iin.read()) != -1) {
				bout.write(b);
			}
			in.close();
			iin.close();
			bout.close();
			return new String(bout.toByteArray());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
