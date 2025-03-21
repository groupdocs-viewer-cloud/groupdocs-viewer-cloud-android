/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WebDocumentOptions.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * This rendering options enables you to customize the appearance of the output HTML/PDF/PNG/JPEG when rendering Web documents.
 */
@ApiModel(description = "This rendering options enables you to customize the appearance of the output HTML/PDF/PNG/JPEG when rendering Web documents.")
public class WebDocumentOptions {
  /**
   * The size of the output page. The default value is GroupDocs.Viewer.Options.PageSize.Letter 792 x 612 points. When contents does not fit set a larger page size e.g. GroupDocs.Viewer.Options.PageSize.A3.             
   */
  @JsonAdapter(PageSizeEnum.Adapter.class)
  public enum PageSizeEnum {
    UNSPECIFIED("Unspecified"),
    
    LETTER("Letter"),
    
    LEDGER("Ledger"),
    
    A0("A0"),
    
    A1("A1"),
    
    A2("A2"),
    
    A3("A3"),
    
    A4("A4");

    private String value;

    PageSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PageSizeEnum fromValue(String text) {
      for (PageSizeEnum b : PageSizeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PageSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PageSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PageSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PageSizeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("pageSize")
  private PageSizeEnum pageSize = null;

  @SerializedName("leftMargin")
  private Double leftMargin = null;

  @SerializedName("rightMargin")
  private Double rightMargin = null;

  @SerializedName("topMargin")
  private Double topMargin = null;

  @SerializedName("bottomMargin")
  private Double bottomMargin = null;

  public WebDocumentOptions pageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The size of the output page. The default value is GroupDocs.Viewer.Options.PageSize.Letter 792 x 612 points. When contents does not fit set a larger page size e.g. GroupDocs.Viewer.Options.PageSize.A3.             
   * @return pageSize
  **/
  @ApiModelProperty(required = true, value = "The size of the output page. The default value is GroupDocs.Viewer.Options.PageSize.Letter 792 x 612 points. When contents does not fit set a larger page size e.g. GroupDocs.Viewer.Options.PageSize.A3.             ")
  public PageSizeEnum getPageSize() {
    return pageSize;
  }

  public void setPageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
  }

  public WebDocumentOptions leftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
    return this;
  }

   /**
   * The distance (in points) between the left edge of the page and the left boundary  of the body text. The default value is 5 points.
   * @return leftMargin
  **/
  @ApiModelProperty(required = true, value = "The distance (in points) between the left edge of the page and the left boundary  of the body text. The default value is 5 points.")
  public Double getLeftMargin() {
    return leftMargin;
  }

  public void setLeftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
  }

  public WebDocumentOptions rightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
    return this;
  }

   /**
   * The distance (in points) between the right edge of the page and the right boundary of the body text. The default value is 5 points.
   * @return rightMargin
  **/
  @ApiModelProperty(required = true, value = "The distance (in points) between the right edge of the page and the right boundary of the body text. The default value is 5 points.")
  public Double getRightMargin() {
    return rightMargin;
  }

  public void setRightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
  }

  public WebDocumentOptions topMargin(Double topMargin) {
    this.topMargin = topMargin;
    return this;
  }

   /**
   * The distance (in points) between the top edge of the page and the top boundary of the body text. The default value is 72 points.
   * @return topMargin
  **/
  @ApiModelProperty(required = true, value = "The distance (in points) between the top edge of the page and the top boundary of the body text. The default value is 72 points.")
  public Double getTopMargin() {
    return topMargin;
  }

  public void setTopMargin(Double topMargin) {
    this.topMargin = topMargin;
  }

  public WebDocumentOptions bottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
    return this;
  }

   /**
   * The distance (in points) between the bottom edge of the page and the bottom boundary of the body text. The default value is 72 points.
   * @return bottomMargin
  **/
  @ApiModelProperty(required = true, value = "The distance (in points) between the bottom edge of the page and the bottom boundary of the body text. The default value is 72 points.")
  public Double getBottomMargin() {
    return bottomMargin;
  }

  public void setBottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebDocumentOptions webDocumentOptions = (WebDocumentOptions) o;
    return Objects.equals(this.pageSize, webDocumentOptions.pageSize) &&
        Objects.equals(this.leftMargin, webDocumentOptions.leftMargin) &&
        Objects.equals(this.rightMargin, webDocumentOptions.rightMargin) &&
        Objects.equals(this.topMargin, webDocumentOptions.topMargin) &&
        Objects.equals(this.bottomMargin, webDocumentOptions.bottomMargin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, leftMargin, rightMargin, topMargin, bottomMargin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebDocumentOptions {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    leftMargin: ").append(toIndentedString(leftMargin)).append("\n");
    sb.append("    rightMargin: ").append(toIndentedString(rightMargin)).append("\n");
    sb.append("    topMargin: ").append(toIndentedString(topMargin)).append("\n");
    sb.append("    bottomMargin: ").append(toIndentedString(bottomMargin)).append("\n");
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

