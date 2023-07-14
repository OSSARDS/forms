package com.vaadin.demo.component;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;
import com.vaadin.flow.router.Route;

import java.io.IOException;
import java.io.InputStream;

@Route("upload-basic")
public class UploadBasic extends Div {

    public UploadBasic() {
        // tag::snippet[]
        MultiFileMemoryBuffer buffer = new MultiFileMemoryBuffer();
        Upload upload = new Upload(buffer);

        upload.addSucceededListener(event -> {
            String fileName = event.getFileName();
            try (InputStream inputStream = buffer.getInputStream(fileName)) {
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // Do something with the file data
            // processFile(inputStream, fileName);
        });
        // end::snippet[]


        add(upload);
    }

}
