/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Watermark.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
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
 * Text watermark
 */
@ApiModel(description = "Text watermark")
public class Watermark {
  @SerializedName("text")
  private String text = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("position")
  private String position = null;

  @SerializedName("size")
  private Integer size = null;

  public Watermark text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Watermark text.
   * @return text
  **/
  @ApiModelProperty(value = "Watermark text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Watermark color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Watermark color. Supported formats {Magenta|(112,222,11)|(50,112,222,11)}. Default value is \&quot;Red\&quot;.
   * @return color
  **/
  @ApiModelProperty(value = "Watermark color. Supported formats {Magenta|(112,222,11)|(50,112,222,11)}. Default value is \"Red\".")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Watermark position(String position) {
    this.position = position;
    return this;
  }

   /**
   * Watermark position. Supported positions {Diagonal|TopLeft|TopCenter|TopRight|BottomLeft|BottomCenter|BottomRight}. Default value is \&quot;Diagonal\&quot;.
   * @return position
  **/
  @ApiModelProperty(value = "Watermark position. Supported positions {Diagonal|TopLeft|TopCenter|TopRight|BottomLeft|BottomCenter|BottomRight}. Default value is \"Diagonal\".")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Watermark size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Watermark size in percents. Default value is 100.
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Watermark size in percents. Default value is 100.")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Watermark watermark = (Watermark) o;
    return Objects.equals(this.text, watermark.text) &&
        Objects.equals(this.color, watermark.color) &&
        Objects.equals(this.position, watermark.position) &&
        Objects.equals(this.size, watermark.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, color, position, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Watermark {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

