/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ViewOptions.java">
 *   Copyright (c) Aspose Pty Ltd
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
import com.groupdocs.cloud.viewer.model.FileInfo;
import com.groupdocs.cloud.viewer.model.RenderOptions;
import com.groupdocs.cloud.viewer.model.Watermark;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * View options
 */
@ApiModel(description = "View options")
public class ViewOptions {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  /**
   * View format (HTML, PNG, JPG, or PDF) Default value is HTML.
   */
  @JsonAdapter(ViewFormatEnum.Adapter.class)
  public enum ViewFormatEnum {
    HTML("HTML"),
    
    PNG("PNG"),
    
    JPG("JPG"),
    
    PDF("PDF");

    private String value;

    ViewFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ViewFormatEnum fromValue(String text) {
      for (ViewFormatEnum b : ViewFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ViewFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ViewFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ViewFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ViewFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("viewFormat")
  private ViewFormatEnum viewFormat = null;

  @SerializedName("outputPath")
  private String outputPath = null;

  @SerializedName("fontsPath")
  private String fontsPath = null;

  @SerializedName("watermark")
  private Watermark watermark = null;

  @SerializedName("renderOptions")
  private RenderOptions renderOptions = null;

  public ViewOptions fileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * File info
   * @return fileInfo
  **/
  @ApiModelProperty(value = "File info")
  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }

  public ViewOptions viewFormat(ViewFormatEnum viewFormat) {
    this.viewFormat = viewFormat;
    return this;
  }

   /**
   * View format (HTML, PNG, JPG, or PDF) Default value is HTML.
   * @return viewFormat
  **/
  @ApiModelProperty(required = true, value = "View format (HTML, PNG, JPG, or PDF) Default value is HTML.")
  public ViewFormatEnum getViewFormat() {
    return viewFormat;
  }

  public void setViewFormat(ViewFormatEnum viewFormat) {
    this.viewFormat = viewFormat;
  }

  public ViewOptions outputPath(String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

   /**
   * The output path Default value is &#39;viewer\\{input file path}_{file extension}\\&#39;
   * @return outputPath
  **/
  @ApiModelProperty(value = "The output path Default value is 'viewer\\{input file path}_{file extension}\\'")
  public String getOutputPath() {
    return outputPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }

  public ViewOptions fontsPath(String fontsPath) {
    this.fontsPath = fontsPath;
    return this;
  }

   /**
   * The path to directory containing custom fonts in storage
   * @return fontsPath
  **/
  @ApiModelProperty(value = "The path to directory containing custom fonts in storage")
  public String getFontsPath() {
    return fontsPath;
  }

  public void setFontsPath(String fontsPath) {
    this.fontsPath = fontsPath;
  }

  public ViewOptions watermark(Watermark watermark) {
    this.watermark = watermark;
    return this;
  }

   /**
   * Text watermark
   * @return watermark
  **/
  @ApiModelProperty(value = "Text watermark")
  public Watermark getWatermark() {
    return watermark;
  }

  public void setWatermark(Watermark watermark) {
    this.watermark = watermark;
  }

  public ViewOptions renderOptions(RenderOptions renderOptions) {
    this.renderOptions = renderOptions;
    return this;
  }

   /**
   * Rendering options
   * @return renderOptions
  **/
  @ApiModelProperty(value = "Rendering options")
  public RenderOptions getRenderOptions() {
    return renderOptions;
  }

  public void setRenderOptions(RenderOptions renderOptions) {
    this.renderOptions = renderOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewOptions viewOptions = (ViewOptions) o;
    return Objects.equals(this.fileInfo, viewOptions.fileInfo) &&
        Objects.equals(this.viewFormat, viewOptions.viewFormat) &&
        Objects.equals(this.outputPath, viewOptions.outputPath) &&
        Objects.equals(this.fontsPath, viewOptions.fontsPath) &&
        Objects.equals(this.watermark, viewOptions.watermark) &&
        Objects.equals(this.renderOptions, viewOptions.renderOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, viewFormat, outputPath, fontsPath, watermark, renderOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewOptions {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    viewFormat: ").append(toIndentedString(viewFormat)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
    sb.append("    fontsPath: ").append(toIndentedString(fontsPath)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
    sb.append("    renderOptions: ").append(toIndentedString(renderOptions)).append("\n");
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

