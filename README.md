# GroupDocs.Viewer Cloud SDK for Android

This repository contains GroupDocs.Viewer Cloud SDK for Android source code. This SDK siplify using GroupDocs.Viewer Cloud REST APIs in your Android applications on Java language. This allows rendering any type of documents - Word, Excel, Presentation, Cad, Email, etc, to HTML, image or PDF format with the flexibility to render the whole document or custom range of pages.

## Installation

Add Internet permission in the AndroidManifest.xml. Example:

```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android" package="<package name>">
    <uses-permission android:name="android.permission.INTERNET" />
    ...
```

Add following repository and dependency to your android module's build.gradle
after "apply plugin: 'com.android.application'" section:

```gradle
repositories {
    maven {
        url "https://repository.groupdocs.cloud/repo/"
    }
}

...
dependencies {
    ...
    implementation 'com.groupdocs:groupdocs-viewer-cloud-android:25.7'
}
```

## Getting Started

* Please follow the [installation](#installation) instruction
* Get your AppSID and AppKey at [Dashboard](https://dashboard.groupdocs.cloud) and use them in your code
* Build and execute
* Explore more samples at [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-java-samples)

Below is an example demonstrating how to preview document using GroupDocs.Viewer Cloud SDK for Android:

```java
import com.groupdocs.cloud.viewer.api.ViewApi;
import com.groupdocs.cloud.viewer.client.Configuration;
import com.groupdocs.cloud.viewer.model.requests.ConvertAndDownloadRequest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class Example {

    public static void main(String[] args) {
        // For complete examples and data files, please go to https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-java-samples
        String myClientId = ""; // Get Client Id from https://dashboard.groupdocs.cloud
        String myClientSecret = ""; // Get Client Secret from https://dashboard.groupdocs.cloud

        Configuration configuration = new Configuration(myClientId, myClientSecret);
        ViewApi viewApi = new ViewApi(configuration);

        String format = "jpg";
        try (InputStream fileStream = new FileInputStream("myfile.docx")) {
            ConvertAndDownloadRequest request = new ConvertAndDownloadRequest(format, fileStream);
            InputStream result = viewApi.convertAndDownload(request);

            // Save the resulting stream (a *.jpg file) for your purpose
            try (OutputStream outStream = new FileOutputStream("output.jpg")) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = result.read(buffer)) != -1) {
                    outStream.write(buffer, 0, bytesRead);
                }
            }
            result.close();
        } catch (Exception e) {
            System.err.println("Failed to convert and download the document");
            e.printStackTrace();
        }
    }
}
```

And here is an example demonstrating how to upload the document, render it, and download the result using GroupDocs.Viewer Cloud SDK for Android:

```java
import com.groupdocs.cloud.viewer.api.ViewApi;
import com.groupdocs.cloud.viewer.api.FileApi;
import com.groupdocs.cloud.viewer.client.Configuration;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class Example {

    public static void main(String[] args) {
        // For complete examples and data files, please go to https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-java-samples
        String myClientId = ""; // Get Client Id from https://dashboard.groupdocs.cloud
        String myClientSecret = ""; // Get Client Secret from https://dashboard.groupdocs.cloud

        Configuration configuration = new Configuration(myClientId, myClientSecret);

        try {
            // Upload a file to cloud storage
            FileApi fileApi = new FileApi(configuration);
            try (InputStream uploadStream = new FileInputStream("myfile.docx")) {
                UploadFileRequest uploadRequest = new UploadFileRequest("myfile.docx", uploadStream, null);
                fileApi.uploadFile(uploadRequest);
            }

            // Render it to HTML
            ViewApi viewApi = new ViewApi(configuration);
            FileInfo fileInfo = new FileInfo();
            fileInfo.setFilePath("myfile.docx");

            ViewOptions viewOptions = new ViewOptions();
            viewOptions.setFileInfo(fileInfo);
            viewOptions.setViewFormat(ViewOptions.ViewFormatEnum.HTML);
            viewOptions.setOutputPath("myfile.html");

            CreateViewRequest viewRequest = new CreateViewRequest(viewOptions);
            viewApi.createView(viewRequest);

            // Download the result
            DownloadFileRequest downloadRequest = new DownloadFileRequest("myfile.html", null, null);
            InputStream result = fileApi.downloadFile(downloadRequest);

            // Use resulting stream (a *.html file in this example) for your purpose
            try (OutputStream outStream = new FileOutputStream("output.html")) {
                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = result.read(buffer)) != -1) {
                    outStream.write(buffer, 0, bytesRead);
                }
            }
            result.close();

        } catch (Exception e) {
            System.err.println("Failed to upload, render, or download the document");
            e.printStackTrace();
        }
    }
}
```

## Licensing

All GroupDocs.Viewer Cloud SDKs are licensed under [MIT License](LICENSE).

## Resources

+ [**Website**](https://www.groupdocs.cloud)
+ [**Product Home**](https://products.groupdocs.cloud/viewer)
+ [**Documentation**](https://docs.groupdocs.cloud/viewer)
+ [**Free Support Forum**](https://forum.groupdocs.cloud/c/viewer)
+ [**Blog**](https://blog.groupdocs.cloud/category/viewer)

## Contact Us

Your feedback is very important to us. Please feel free to contact us using our [Support Forums](https://forum.groupdocs.cloud/c/viewer).
