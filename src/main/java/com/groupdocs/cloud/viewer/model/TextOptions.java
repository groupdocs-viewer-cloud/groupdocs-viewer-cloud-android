/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TextOptions.java">
 *   Copyright (c) 2003-2021 Aspose Pty Ltd
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
 * Provides options for rendering text documents
 */
@ApiModel(description = "Provides options for rendering text documents")
public class TextOptions {
  @SerializedName("maxCharsPerRow")
  private Integer maxCharsPerRow = null;

  @SerializedName("maxRowsPerPage")
  private Integer maxRowsPerPage = null;

  public TextOptions maxCharsPerRow(Integer maxCharsPerRow) {
    this.maxCharsPerRow = maxCharsPerRow;
    return this;
  }

   /**
   * Max chars per row on page. Default value is 85.
   * @return maxCharsPerRow
  **/
  @ApiModelProperty(required = true, value = "Max chars per row on page. Default value is 85.")
  public Integer getMaxCharsPerRow() {
    return maxCharsPerRow;
  }

  public void setMaxCharsPerRow(Integer maxCharsPerRow) {
    this.maxCharsPerRow = maxCharsPerRow;
  }

  public TextOptions maxRowsPerPage(Integer maxRowsPerPage) {
    this.maxRowsPerPage = maxRowsPerPage;
    return this;
  }

   /**
   * Max rows per page. Default value is 55.
   * @return maxRowsPerPage
  **/
  @ApiModelProperty(required = true, value = "Max rows per page. Default value is 55.")
  public Integer getMaxRowsPerPage() {
    return maxRowsPerPage;
  }

  public void setMaxRowsPerPage(Integer maxRowsPerPage) {
    this.maxRowsPerPage = maxRowsPerPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextOptions textOptions = (TextOptions) o;
    return Objects.equals(this.maxCharsPerRow, textOptions.maxCharsPerRow) &&
        Objects.equals(this.maxRowsPerPage, textOptions.maxRowsPerPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxCharsPerRow, maxRowsPerPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextOptions {\n");
    
    sb.append("    maxCharsPerRow: ").append(toIndentedString(maxCharsPerRow)).append("\n");
    sb.append("    maxRowsPerPage: ").append(toIndentedString(maxRowsPerPage)).append("\n");
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

