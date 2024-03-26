/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfDocumentOptions.java">
 *   Copyright (c) 2003-2024 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.viewer.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Provides options for rendering PDF documents
 */
@ApiModel(description = "Provides options for rendering PDF documents")
public class PdfDocumentOptions {
  @SerializedName("disableCharsGrouping")
  private Boolean disableCharsGrouping = null;

  @SerializedName("enableLayeredRendering")
  private Boolean enableLayeredRendering = null;

  @SerializedName("enableFontHinting")
  private Boolean enableFontHinting = null;

  @SerializedName("renderOriginalPageSize")
  private Boolean renderOriginalPageSize = null;

  /**
   * Specifies output image quality for image resources when rendering into HTML. The default value is Low
   */
  @JsonAdapter(ImageQualityEnum.Adapter.class)
  public enum ImageQualityEnum {
    LOW("Low"),
    
    MEDIUM("Medium"),
    
    HIGH("High");

    private String value;

    ImageQualityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImageQualityEnum fromValue(String text) {
      for (ImageQualityEnum b : ImageQualityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ImageQualityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImageQualityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImageQualityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ImageQualityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("imageQuality")
  private ImageQualityEnum imageQuality = null;

  @SerializedName("renderTextAsImage")
  private Boolean renderTextAsImage = null;

  @SerializedName("fixedLayout")
  private Boolean fixedLayout = null;

  @SerializedName("wrapImagesInSvg")
  private Boolean wrapImagesInSvg = null;

  @SerializedName("disableFontLicenseVerifications")
  private Boolean disableFontLicenseVerifications = null;

  public PdfDocumentOptions disableCharsGrouping(Boolean disableCharsGrouping) {
    this.disableCharsGrouping = disableCharsGrouping;
    return this;
  }

   /**
   * Disables chars grouping to keep maximum precision during chars positioning when rendering the page
   * @return disableCharsGrouping
  **/
  @ApiModelProperty(required = true, value = "Disables chars grouping to keep maximum precision during chars positioning when rendering the page")
  public Boolean getDisableCharsGrouping() {
    return disableCharsGrouping;
  }

  public void setDisableCharsGrouping(Boolean disableCharsGrouping) {
    this.disableCharsGrouping = disableCharsGrouping;
  }

  public PdfDocumentOptions enableLayeredRendering(Boolean enableLayeredRendering) {
    this.enableLayeredRendering = enableLayeredRendering;
    return this;
  }

   /**
   * Enables rendering of text and graphics according to z-order in original PDF document  when rendering into HTML
   * @return enableLayeredRendering
  **/
  @ApiModelProperty(required = true, value = "Enables rendering of text and graphics according to z-order in original PDF document  when rendering into HTML")
  public Boolean getEnableLayeredRendering() {
    return enableLayeredRendering;
  }

  public void setEnableLayeredRendering(Boolean enableLayeredRendering) {
    this.enableLayeredRendering = enableLayeredRendering;
  }

  public PdfDocumentOptions enableFontHinting(Boolean enableFontHinting) {
    this.enableFontHinting = enableFontHinting;
    return this;
  }

   /**
   * Enables font hinting. The font hinting adjusts the display of an outline font. Supported only for TTF fonts when these fonts are used in source document.
   * @return enableFontHinting
  **/
  @ApiModelProperty(required = true, value = "Enables font hinting. The font hinting adjusts the display of an outline font. Supported only for TTF fonts when these fonts are used in source document.")
  public Boolean getEnableFontHinting() {
    return enableFontHinting;
  }

  public void setEnableFontHinting(Boolean enableFontHinting) {
    this.enableFontHinting = enableFontHinting;
  }

  public PdfDocumentOptions renderOriginalPageSize(Boolean renderOriginalPageSize) {
    this.renderOriginalPageSize = renderOriginalPageSize;
    return this;
  }

   /**
   * When this option enabled the output pages will have the same size in pixels as page size in a source PDF document. By default GroupDocs.Viewer calculates output image page size for better rendering quality. This option is supported when rendering into PNG or JPG formats.
   * @return renderOriginalPageSize
  **/
  @ApiModelProperty(required = true, value = "When this option enabled the output pages will have the same size in pixels as page size in a source PDF document. By default GroupDocs.Viewer calculates output image page size for better rendering quality. This option is supported when rendering into PNG or JPG formats.")
  public Boolean getRenderOriginalPageSize() {
    return renderOriginalPageSize;
  }

  public void setRenderOriginalPageSize(Boolean renderOriginalPageSize) {
    this.renderOriginalPageSize = renderOriginalPageSize;
  }

  public PdfDocumentOptions imageQuality(ImageQualityEnum imageQuality) {
    this.imageQuality = imageQuality;
    return this;
  }

   /**
   * Specifies output image quality for image resources when rendering into HTML. The default value is Low
   * @return imageQuality
  **/
  @ApiModelProperty(required = true, value = "Specifies output image quality for image resources when rendering into HTML. The default value is Low")
  public ImageQualityEnum getImageQuality() {
    return imageQuality;
  }

  public void setImageQuality(ImageQualityEnum imageQuality) {
    this.imageQuality = imageQuality;
  }

  public PdfDocumentOptions renderTextAsImage(Boolean renderTextAsImage) {
    this.renderTextAsImage = renderTextAsImage;
    return this;
  }

   /**
   * When this option is set to true, the text is rendered as an image in the output HTML. Enable this option to make text unselectable or to fix characters rendering and make HTML look like PDF. The default value is false. This option is supported when rendering into HTML.
   * @return renderTextAsImage
  **/
  @ApiModelProperty(required = true, value = "When this option is set to true, the text is rendered as an image in the output HTML. Enable this option to make text unselectable or to fix characters rendering and make HTML look like PDF. The default value is false. This option is supported when rendering into HTML.")
  public Boolean getRenderTextAsImage() {
    return renderTextAsImage;
  }

  public void setRenderTextAsImage(Boolean renderTextAsImage) {
    this.renderTextAsImage = renderTextAsImage;
  }

  public PdfDocumentOptions fixedLayout(Boolean fixedLayout) {
    this.fixedLayout = fixedLayout;
    return this;
  }

   /**
   * Enables rendering the PDF and EPUB documents to HTML with a fixed layout.
   * @return fixedLayout
  **/
  @ApiModelProperty(required = true, value = "Enables rendering the PDF and EPUB documents to HTML with a fixed layout.")
  public Boolean getFixedLayout() {
    return fixedLayout;
  }

  public void setFixedLayout(Boolean fixedLayout) {
    this.fixedLayout = fixedLayout;
  }

  public PdfDocumentOptions wrapImagesInSvg(Boolean wrapImagesInSvg) {
    this.wrapImagesInSvg = wrapImagesInSvg;
    return this;
  }

   /**
   * Enables wrapping each image in the output HTML document in SVG tag to improve the output quality.
   * @return wrapImagesInSvg
  **/
  @ApiModelProperty(required = true, value = "Enables wrapping each image in the output HTML document in SVG tag to improve the output quality.")
  public Boolean getWrapImagesInSvg() {
    return wrapImagesInSvg;
  }

  public void setWrapImagesInSvg(Boolean wrapImagesInSvg) {
    this.wrapImagesInSvg = wrapImagesInSvg;
  }

  public PdfDocumentOptions disableFontLicenseVerifications(Boolean disableFontLicenseVerifications) {
    this.disableFontLicenseVerifications = disableFontLicenseVerifications;
    return this;
  }

   /**
   * Disables any license restrictions for all fonts in the current XPS/OXPS document.
   * @return disableFontLicenseVerifications
  **/
  @ApiModelProperty(required = true, value = "Disables any license restrictions for all fonts in the current XPS/OXPS document.")
  public Boolean getDisableFontLicenseVerifications() {
    return disableFontLicenseVerifications;
  }

  public void setDisableFontLicenseVerifications(Boolean disableFontLicenseVerifications) {
    this.disableFontLicenseVerifications = disableFontLicenseVerifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfDocumentOptions pdfDocumentOptions = (PdfDocumentOptions) o;
    return Objects.equals(this.disableCharsGrouping, pdfDocumentOptions.disableCharsGrouping) &&
        Objects.equals(this.enableLayeredRendering, pdfDocumentOptions.enableLayeredRendering) &&
        Objects.equals(this.enableFontHinting, pdfDocumentOptions.enableFontHinting) &&
        Objects.equals(this.renderOriginalPageSize, pdfDocumentOptions.renderOriginalPageSize) &&
        Objects.equals(this.imageQuality, pdfDocumentOptions.imageQuality) &&
        Objects.equals(this.renderTextAsImage, pdfDocumentOptions.renderTextAsImage) &&
        Objects.equals(this.fixedLayout, pdfDocumentOptions.fixedLayout) &&
        Objects.equals(this.wrapImagesInSvg, pdfDocumentOptions.wrapImagesInSvg) &&
        Objects.equals(this.disableFontLicenseVerifications, pdfDocumentOptions.disableFontLicenseVerifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disableCharsGrouping, enableLayeredRendering, enableFontHinting, renderOriginalPageSize, imageQuality, renderTextAsImage, fixedLayout, wrapImagesInSvg, disableFontLicenseVerifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfDocumentOptions {\n");
    
    sb.append("    disableCharsGrouping: ").append(toIndentedString(disableCharsGrouping)).append("\n");
    sb.append("    enableLayeredRendering: ").append(toIndentedString(enableLayeredRendering)).append("\n");
    sb.append("    enableFontHinting: ").append(toIndentedString(enableFontHinting)).append("\n");
    sb.append("    renderOriginalPageSize: ").append(toIndentedString(renderOriginalPageSize)).append("\n");
    sb.append("    imageQuality: ").append(toIndentedString(imageQuality)).append("\n");
    sb.append("    renderTextAsImage: ").append(toIndentedString(renderTextAsImage)).append("\n");
    sb.append("    fixedLayout: ").append(toIndentedString(fixedLayout)).append("\n");
    sb.append("    wrapImagesInSvg: ").append(toIndentedString(wrapImagesInSvg)).append("\n");
    sb.append("    disableFontLicenseVerifications: ").append(toIndentedString(disableFontLicenseVerifications)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

