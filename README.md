![GitHub release (latest by date)](https://img.shields.io/github/v/release/groupdocs-viewer-cloud/groupdocs-viewer-cloud-android) [![GitHub stars](https://img.shields.io/github/stars/groupdocs-viewer-cloud/groupdocs-viewer-cloud-android)](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-android/stargazers) [![GitHub license](https://img.shields.io/github/license/groupdocs-viewer-cloud/groupdocs-viewer-cloud-android)](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-android)

# Android Cloud REST API for Document Rendering

This repository contains [GroupDocs.Viewer Cloud SDK for Android](https://products.groupdocs.cloud/viewer/android) source code. This SDK allows you to work with GroupDocs.Viewer Cloud REST APIs in your Android applications via Java language.

## Cloud Document Viewer in a Nutshell

- Ability to [render 80+ file formats](https://docs.groupdocs.cloud/viewer/supported-document-formats/) including documents, images & spreadsheets.
- Support for HTML minification, [font exclusion](https://docs.groupdocs.cloud/viewer/html-viewer-exclude-fonts/) & responsive layout.
- Adjust [image size, JPG quality & text overlay](https://docs.groupdocs.cloud/viewer/image-viewer/) over images.
- Secure PDF documents by settings permissions and applying password.
- [Render](https://docs.groupdocs.cloud/viewer/common-rendering-options/) comments, notes, hidden pages, selected pages & custom fonts.
- Apply watermark, flip/rotate/reorder pages & replace missing fonts.
- Split CAD drawing into tiles & render single/all layouts.
- Adjust time unit & render time interval of MS Project files.
- [Render Outlook](https://docs.groupdocs.cloud/viewer/rendering-outlook-data-files/) data file folder & limit count of items to render.
- Ability to render grid lines, hidden columns/rows & print areas of [Excel sheets](https://docs.groupdocs.cloud/viewer/rendering-spreadsheets/).
- Support to render tracked changes in MS Word documents.

### Supported File Formats

**Word Processing:** DOC, DOCM, DOCX, DOT, DOTM, DOTX, ODT, OTT, RTF, TXT
**Spreadsheet:** CSV, ODS, OTS, TSV, XLS, XLSB, XLSM, XLSX
**Presentation:** ODP, OTP, POTM, POTX, PPS, PPSM, PPSX, PPT, PPTM, PPTX
**Project Management:** MPP, MPT
**Email:** EML, EMLX, MSG, OST, PST
**AutoCAD:** DGN, DWF, DWG, DXF, IFC, STL
**Markup:** HTML, MHT, MHTML
**Diagram:** VDW, VDX, VSD, VSDM, VSDX, VSS, VSSM, VSSX, VST, VSTM, VSTX, VSX, VTX
**Note:** ONE
**Page Layout:** PDF, TEX, XPS
**Image:** BMP, CGM, DCM, DJVU, DNG, EMF, EPS, GIF, ICO, JP2, JPG, JPEG, ODG, PCL, PNG, PS, PSD, SVG, TIF, TIFF, WEBP, WMF
**eBook:** EPUB, MOBI

## New Features & Enhancements ![GitHub release (latest by date)](https://img.shields.io/github/v/release/groupdocs-viewer-cloud/groupdocs-viewer-cloud-android)

- Added support for [Docker version of GroupDocs.Viewer Cloud](https://hub.docker.com/r/groupdocs/viewer-cloud) by SDKs.

Please visit [GroupDocs.Viewer Cloud 20.5 Release Notes](https://docs.groupdocs.cloud/viewer/groupdocs-viewer-cloud-20-5-release-notes/) for detailed release notes.

## Get Started with GroupDocs.Viewer Cloud SDK for Android

Create an account at [Aspose for Cloud](https://dashboard.aspose.cloud/#/apps) and get your application information for authentication.

### Installation

Add Internet permission in the `AndroidManifest.xml`. Example:

```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android" package="<package name>">
    <uses-permission android:name="android.permission.INTERNET" />
    ...
```

Add following repository and dependency to your android module's `build.gradle`
after **apply plugin: 'com.android.application'** section:

```java
repositories {
    maven {
        url "https://repository.groupdocs.cloud/repo/"
    }
}

...
dependencies {
    ...
    implementation 'com.groupdocs:groupdocs-viewer-cloud:19.5'
}
```

Please follow the [installation](#installation) instructions and use the following Java code:

```java
//TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).
        String appSid = "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX";
        String appKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

        Configuration configuration = new Configuration(appSid, appKey);

        InfoApi infoApi = new InfoApi(configuration);

        try {
            FormatsResult response = infoApi.getSupportedFileFormats();
            for (Format format : response.getFormats()) {
                System.out.println(format.getFileFormat());
            }

        } catch (ApiException e) {
            System.err.println("Failed to get supported file formats");
            e.printStackTrace();

        }
```

## Render Selected Pages of a DOCX File

```java
Configuration configuration = new Configuration(MyAppSid, MyAppKey);
ViewApi apiInstance = new ViewApi(configuration);

FileInfo fileInfo = new FileInfo();
fileInfo.setFilePath("SampleFiles/sample.docx");
ViewOptions viewOptions = new ViewOptions();
viewOptions.setFileInfo(fileInfo);
viewOptions.setViewFormat(ViewFormatEnum.HTML);
RenderOptions renderOptions = new RenderOptions();
renderOptions.addPagesToRenderItem(2);
renderOptions.addPagesToRenderItem(3);
viewOptions.setRenderOptions(renderOptions);

ViewResult response = apiInstance.createView(new CreateViewRequest(viewOptions));
```

## Other GroupDocs.Viewer Cloud SDKs

| .NET | Java | PHP | Python | Ruby | Node.js |
|---|---|---|---|---|---|
| [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-dotnet) | [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-java) | [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-php) | [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-python) | [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-ruby) | [GitHub](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-node) |
| [NuGet](https://www.nuget.org/packages/GroupDocs.Viewer-Cloud/) | [Maven](https://repository.groupdocs.cloud/webapp/#/artifacts/browse/tree/General/repo/com/groupdocs/groupdocs-viewer-cloud) | [Composer](https://packagist.org/packages/groupdocscloud/groupdocs-viewer-cloud) | [PIP](https://pypi.org/project/groupdocs-viewer-cloud/) | [GEM](https://rubygems.org/gems/groupdocs_viewer_cloud) | [NPM](https://www.npmjs.com/package/groupdocs-viewer-cloud) |

[Home](https://www.groupdocs.cloud/) | [Product Page](https://products.groupdocs.cloud/viewer/android) | [Docs](https://docs.groupdocs.cloud/viewer/) | [Demos](https://products.groupdocs.app/viewer/family) | [API Reference](https://apireference.groupdocs.cloud/viewer/) | [Source Code](https://github.com/groupdocs-viewer-cloud/groupdocs-viewer-cloud-android) | [Blog](https://blog.groupdocs.cloud/category/viewer/) | [Free Support](https://forum.groupdocs.cloud/c/viewer) | [Free Trial](https://purchase.groupdocs.cloud/trial)
