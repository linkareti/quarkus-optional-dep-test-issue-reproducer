package org.acme.acme.dep;

import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfStamper;

public class HelloWorld {

    public void hello() {
        try {
            PdfStamper stamper = PdfStamper.createSignature(null, null, '\0');
        } catch (IOException | DocumentException e) {
            e.printStackTrace();;
        }
    }

}
