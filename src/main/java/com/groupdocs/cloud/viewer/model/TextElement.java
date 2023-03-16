/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TextElement.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Text element
 */
@ApiModel(description = "Text element")
public class TextElement {
  @SerializedName("x")
  private Double X = null;

  @SerializedName("y")
  private Double Y = null;

  @SerializedName("width")
  private Double width = null;

  @SerializedName("height")
  private Double height = null;

  @SerializedName("value")
  private String value = null;

  public TextElement X(Double X) {
    this.X = X;
    return this;
  }

   /**
   * The X coordinate of the highest left point on the page layout where the rectangle that contains element begins.             
   * @return X
  **/
  @ApiModelProperty(required = true, value = "The X coordinate of the highest left point on the page layout where the rectangle that contains element begins.             ")
  public Double getX() {
    return X;
  }

  public void setX(Double X) {
    this.X = X;
  }

  public TextElement Y(Double Y) {
    this.Y = Y;
    return this;
  }

   /**
   * The Y coordinate of the highest left point on the page layout where the rectangle that contains element begins.             
   * @return Y
  **/
  @ApiModelProperty(required = true, value = "The Y coordinate of the highest left point on the page layout where the rectangle that contains element begins.             ")
  public Double getY() {
    return Y;
  }

  public void setY(Double Y) {
    this.Y = Y;
  }

  public TextElement width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the rectangle which contains the element (in pixels).              
   * @return width
  **/
  @ApiModelProperty(required = true, value = "The width of the rectangle which contains the element (in pixels).              ")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public TextElement height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the rectangle which contains the element (in pixels).              
   * @return height
  **/
  @ApiModelProperty(required = true, value = "The height of the rectangle which contains the element (in pixels).              ")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public TextElement value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The element value
   * @return value
  **/
  @ApiModelProperty(value = "The element value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextElement textElement = (TextElement) o;
    return Objects.equals(this.X, textElement.X) &&
        Objects.equals(this.Y, textElement.Y) &&
        Objects.equals(this.width, textElement.width) &&
        Objects.equals(this.height, textElement.height) &&
        Objects.equals(this.value, textElement.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y, width, height, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextElement {\n");
    
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

