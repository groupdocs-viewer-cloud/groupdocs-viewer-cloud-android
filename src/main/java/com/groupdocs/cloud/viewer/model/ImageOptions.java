/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImageOptions.java">
 *   Copyright (c) 2003-2023 Aspose Pty Ltd
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
import com.groupdocs.cloud.viewer.model.ArchiveOptions;
import com.groupdocs.cloud.viewer.model.CadOptions;
import com.groupdocs.cloud.viewer.model.EmailOptions;
import com.groupdocs.cloud.viewer.model.MailStorageOptions;
import com.groupdocs.cloud.viewer.model.OutlookOptions;
import com.groupdocs.cloud.viewer.model.PageRotation;
import com.groupdocs.cloud.viewer.model.PdfDocumentOptions;
import com.groupdocs.cloud.viewer.model.ProjectManagementOptions;
import com.groupdocs.cloud.viewer.model.RenderOptions;
import com.groupdocs.cloud.viewer.model.SpreadsheetOptions;
import com.groupdocs.cloud.viewer.model.TextOptions;
import com.groupdocs.cloud.viewer.model.VisioRenderingOptions;
import com.groupdocs.cloud.viewer.model.WebDocumentOptions;
import com.groupdocs.cloud.viewer.model.WordProcessingOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Options for rendering document into image
 */
@ApiModel(description = "Options for rendering document into image")
public class ImageOptions extends RenderOptions {
  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("extractText")
  private Boolean extractText = null;

  @SerializedName("jpegQuality")
  private Integer jpegQuality = null;

  @SerializedName("maxWidth")
  private Integer maxWidth = null;

  @SerializedName("maxHeight")
  private Integer maxHeight = null;

  public ImageOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Allows to specify output image width.  Specify image width in case when you want to change output image dimensions. When Width has value and Height value is 0 then Height value will be calculated  to save image proportions. 
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Allows to specify output image width.  Specify image width in case when you want to change output image dimensions. When Width has value and Height value is 0 then Height value will be calculated  to save image proportions. ")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public ImageOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Allows to specify output image height.  Specify image height in case when you want to change output image dimensions. When Height has value and Width value is 0 then Width value will be calculated  to save image proportions.
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Allows to specify output image height.  Specify image height in case when you want to change output image dimensions. When Height has value and Width value is 0 then Width value will be calculated  to save image proportions.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ImageOptions extractText(Boolean extractText) {
    this.extractText = extractText;
    return this;
  }

   /**
   * When enabled Viewer will extract text when it&#39;s possible (e.g. raster formats don&#39;t have text layer) and return it in the viewing result. This option might be useful when you want to add selectable text layer over the image. 
   * @return extractText
  **/
  @ApiModelProperty(required = true, value = "When enabled Viewer will extract text when it's possible (e.g. raster formats don't have text layer) and return it in the viewing result. This option might be useful when you want to add selectable text layer over the image. ")
  public Boolean getExtractText() {
    return extractText;
  }

  public void setExtractText(Boolean extractText) {
    this.extractText = extractText;
  }

  public ImageOptions jpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
    return this;
  }

   /**
   * Allows to specify quality when rendering as JPG. Valid values are between 1 and 100.  Default value is 90.
   * @return jpegQuality
  **/
  @ApiModelProperty(required = true, value = "Allows to specify quality when rendering as JPG. Valid values are between 1 and 100.  Default value is 90.")
  public Integer getJpegQuality() {
    return jpegQuality;
  }

  public void setJpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
  }

  public ImageOptions maxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
    return this;
  }

   /**
   * Max width of an output image in pixels
   * @return maxWidth
  **/
  @ApiModelProperty(required = true, value = "Max width of an output image in pixels")
  public Integer getMaxWidth() {
    return maxWidth;
  }

  public void setMaxWidth(Integer maxWidth) {
    this.maxWidth = maxWidth;
  }

  public ImageOptions maxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
    return this;
  }

   /**
   * Max height of an output image in pixels
   * @return maxHeight
  **/
  @ApiModelProperty(required = true, value = "Max height of an output image in pixels")
  public Integer getMaxHeight() {
    return maxHeight;
  }

  public void setMaxHeight(Integer maxHeight) {
    this.maxHeight = maxHeight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageOptions imageOptions = (ImageOptions) o;
    return Objects.equals(this.width, imageOptions.width) &&
        Objects.equals(this.height, imageOptions.height) &&
        Objects.equals(this.extractText, imageOptions.extractText) &&
        Objects.equals(this.jpegQuality, imageOptions.jpegQuality) &&
        Objects.equals(this.maxWidth, imageOptions.maxWidth) &&
        Objects.equals(this.maxHeight, imageOptions.maxHeight) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, extractText, jpegQuality, maxWidth, maxHeight, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    extractText: ").append(toIndentedString(extractText)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
    sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
    sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
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

