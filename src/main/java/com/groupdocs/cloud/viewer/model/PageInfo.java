/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PageInfo.java">
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
import com.groupdocs.cloud.viewer.model.Line;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Page information
 */
@ApiModel(description = "Page information")
public class PageInfo {
  @SerializedName("number")
  private Integer number = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("visible")
  private Boolean visible = null;

  @SerializedName("lines")
  private List<Line> lines = null;

  public PageInfo number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * The page number
   * @return number
  **/
  @ApiModelProperty(required = true, value = "The page number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PageInfo width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the page in pixels when viewing as JPG or PNG
   * @return width
  **/
  @ApiModelProperty(required = true, value = "The width of the page in pixels when viewing as JPG or PNG")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public PageInfo height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the page in pixels when viewing as JPG or PNG
   * @return height
  **/
  @ApiModelProperty(required = true, value = "The height of the page in pixels when viewing as JPG or PNG")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PageInfo visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * The page visibility indicator
   * @return visible
  **/
  @ApiModelProperty(required = true, value = "The page visibility indicator")
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public PageInfo lines(List<Line> lines) {
    this.lines = lines;
    return this;
  }

  public PageInfo addLinesItem(Line linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<Line>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * The lines contained by the page when viewing as JPG or PNG with enabled Text Extraction
   * @return lines
  **/
  @ApiModelProperty(value = "The lines contained by the page when viewing as JPG or PNG with enabled Text Extraction")
  public List<Line> getLines() {
    return lines;
  }

  public void setLines(List<Line> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageInfo pageInfo = (PageInfo) o;
    return Objects.equals(this.number, pageInfo.number) &&
        Objects.equals(this.width, pageInfo.width) &&
        Objects.equals(this.height, pageInfo.height) &&
        Objects.equals(this.visible, pageInfo.visible) &&
        Objects.equals(this.lines, pageInfo.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, width, height, visible, lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageInfo {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

