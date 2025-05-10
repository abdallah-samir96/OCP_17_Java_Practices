package concurrency.pargma.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Path;

public class App {
    private static final String FILE_NAME = "file.png";
    public static void main(String[] args) throws WriterException, IOException {

        String data = """
                Encoded using Google Matrix API
                """;
        BitMatrix bitMatrix =
                new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 250, 250);
        MatrixToImageWriter.writeToPath(bitMatrix, "png", Path.of(FILE_NAME));

    }
}
