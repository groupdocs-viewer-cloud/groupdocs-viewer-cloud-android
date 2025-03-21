/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WordProcessingOptions.java">
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
 * Provides options for rendering word processing documents
 */
@ApiModel(description = "Provides options for rendering word processing documents")
public class WordProcessingOptions {
  @SerializedName("renderTrackedChanges")
  private Boolean renderTrackedChanges = null;

  @SerializedName("leftMargin")
  private Double leftMargin = null;

  @SerializedName("rightMargin")
  private Double rightMargin = null;

  @SerializedName("topMargin")
  private Double topMargin = null;

  @SerializedName("bottomMargin")
  private Double bottomMargin = null;

  /**
   * The size of the page.
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

  @SerializedName("enableOpenTypeFeatures")
  private Boolean enableOpenTypeFeatures = null;

  @SerializedName("unlinkTableOfContents")
  private Boolean unlinkTableOfContents = null;

  @SerializedName("updateFields")
  private Boolean updateFields = null;

  public WordProcessingOptions renderTrackedChanges(Boolean renderTrackedChanges) {
    this.renderTrackedChanges = renderTrackedChanges;
    return this;
  }

   /**
   * Enables tracked changes (revisions) rendering
   * @return renderTrackedChanges
  **/
  @ApiModelProperty(required = true, value = "Enables tracked changes (revisions) rendering")
  public Boolean getRenderTrackedChanges() {
    return renderTrackedChanges;
  }

  public void setRenderTrackedChanges(Boolean renderTrackedChanges) {
    this.renderTrackedChanges = renderTrackedChanges;
  }

  public WordProcessingOptions leftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
    return this;
  }

   /**
   * Left page margin (for HTML rendering only)
   * @return leftMargin
  **/
  @ApiModelProperty(required = true, value = "Left page margin (for HTML rendering only)")
  public Double getLeftMargin() {
    return leftMargin;
  }

  public void setLeftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
  }

  public WordProcessingOptions rightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
    return this;
  }

   /**
   * Right page margin (for HTML rendering only)
   * @return rightMargin
  **/
  @ApiModelProperty(required = true, value = "Right page margin (for HTML rendering only)")
  public Double getRightMargin() {
    return rightMargin;
  }

  public void setRightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
  }

  public WordProcessingOptions topMargin(Double topMargin) {
    this.topMargin = topMargin;
    return this;
  }

   /**
   * Top page margin (for HTML rendering only)
   * @return topMargin
  **/
  @ApiModelProperty(required = true, value = "Top page margin (for HTML rendering only)")
  public Double getTopMargin() {
    return topMargin;
  }

  public void setTopMargin(Double topMargin) {
    this.topMargin = topMargin;
  }

  public WordProcessingOptions bottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
    return this;
  }

   /**
   * Bottom page margin (for HTML rendering only)
   * @return bottomMargin
  **/
  @ApiModelProperty(required = true, value = "Bottom page margin (for HTML rendering only)")
  public Double getBottomMargin() {
    return bottomMargin;
  }

  public void setBottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
  }

  public WordProcessingOptions pageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The size of the page.
   * @return pageSize
  **/
  @ApiModelProperty(required = true, value = "The size of the page.")
  public PageSizeEnum getPageSize() {
    return pageSize;
  }

  public void setPageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
  }

  public WordProcessingOptions enableOpenTypeFeatures(Boolean enableOpenTypeFeatures) {
    this.enableOpenTypeFeatures = enableOpenTypeFeatures;
    return this;
  }

   /**
   * This option enables kerning and other OpenType Features when rendering Arabic, Hebrew, Indian Latin-based, or Cyrillic-based scripts.
   * @return enableOpenTypeFeatures
  **/
  @ApiModelProperty(required = true, value = "This option enables kerning and other OpenType Features when rendering Arabic, Hebrew, Indian Latin-based, or Cyrillic-based scripts.")
  public Boolean getEnableOpenTypeFeatures() {
    return enableOpenTypeFeatures;
  }

  public void setEnableOpenTypeFeatures(Boolean enableOpenTypeFeatures) {
    this.enableOpenTypeFeatures = enableOpenTypeFeatures;
  }

  public WordProcessingOptions unlinkTableOfContents(Boolean unlinkTableOfContents) {
    this.unlinkTableOfContents = unlinkTableOfContents;
    return this;
  }

   /**
   * When rendering to HTML or PDF, you can set this option to &#x60;true&#x60; to disable navigation from the table of contents. For HTML rendering, &#x60;a&#x60; tags with relative links will be replaced with &#x60;span&#x60; tags, removing functionality but preserving visual appearance. For PDF rendering, the table of contents will be rendered as plain text without links to document sections.             
   * @return unlinkTableOfContents
  **/
  @ApiModelProperty(required = true, value = "When rendering to HTML or PDF, you can set this option to `true` to disable navigation from the table of contents. For HTML rendering, `a` tags with relative links will be replaced with `span` tags, removing functionality but preserving visual appearance. For PDF rendering, the table of contents will be rendered as plain text without links to document sections.             ")
  public Boolean getUnlinkTableOfContents() {
    return unlinkTableOfContents;
  }

  public void setUnlinkTableOfContents(Boolean unlinkTableOfContents) {
    this.unlinkTableOfContents = unlinkTableOfContents;
  }

  public WordProcessingOptions updateFields(Boolean updateFields) {
    this.updateFields = updateFields;
    return this;
  }

   /**
   * Determines if fields of certain types should be updated before saving the input WordProcessing document to the HTML, PDF, PNG, or JPEG output formats. Default value for this property is true — fields will be updated before saving.             
   * @return updateFields
  **/
  @ApiModelProperty(required = true, value = "Determines if fields of certain types should be updated before saving the input WordProcessing document to the HTML, PDF, PNG, or JPEG output formats. Default value for this property is true — fields will be updated before saving.             ")
  public Boolean getUpdateFields() {
    return updateFields;
  }

  public void setUpdateFields(Boolean updateFields) {
    this.updateFields = updateFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordProcessingOptions wordProcessingOptions = (WordProcessingOptions) o;
    return Objects.equals(this.renderTrackedChanges, wordProcessingOptions.renderTrackedChanges) &&
        Objects.equals(this.leftMargin, wordProcessingOptions.leftMargin) &&
        Objects.equals(this.rightMargin, wordProcessingOptions.rightMargin) &&
        Objects.equals(this.topMargin, wordProcessingOptions.topMargin) &&
        Objects.equals(this.bottomMargin, wordProcessingOptions.bottomMargin) &&
        Objects.equals(this.pageSize, wordProcessingOptions.pageSize) &&
        Objects.equals(this.enableOpenTypeFeatures, wordProcessingOptions.enableOpenTypeFeatures) &&
        Objects.equals(this.unlinkTableOfContents, wordProcessingOptions.unlinkTableOfContents) &&
        Objects.equals(this.updateFields, wordProcessingOptions.updateFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renderTrackedChanges, leftMargin, rightMargin, topMargin, bottomMargin, pageSize, enableOpenTypeFeatures, unlinkTableOfContents, updateFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WordProcessingOptions {\n");
    
    sb.append("    renderTrackedChanges: ").append(toIndentedString(renderTrackedChanges)).append("\n");
    sb.append("    leftMargin: ").append(toIndentedString(leftMargin)).append("\n");
    sb.append("    rightMargin: ").append(toIndentedString(rightMargin)).append("\n");
    sb.append("    topMargin: ").append(toIndentedString(topMargin)).append("\n");
    sb.append("    bottomMargin: ").append(toIndentedString(bottomMargin)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    enableOpenTypeFeatures: ").append(toIndentedString(enableOpenTypeFeatures)).append("\n");
    sb.append("    unlinkTableOfContents: ").append(toIndentedString(unlinkTableOfContents)).append("\n");
    sb.append("    updateFields: ").append(toIndentedString(updateFields)).append("\n");
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

