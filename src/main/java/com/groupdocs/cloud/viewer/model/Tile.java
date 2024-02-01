/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Tile.java">
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
 * Represents drawing region
 */
@ApiModel(description = "Represents drawing region")
public class Tile {
  @SerializedName("startPointX")
  private Integer startPointX = null;

  @SerializedName("startPointY")
  private Integer startPointY = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  public Tile startPointX(Integer startPointX) {
    this.startPointX = startPointX;
    return this;
  }

   /**
   * The X coordinate of the lowest left point on the drawing where the tile begins
   * @return startPointX
  **/
  @ApiModelProperty(required = true, value = "The X coordinate of the lowest left point on the drawing where the tile begins")
  public Integer getStartPointX() {
    return startPointX;
  }

  public void setStartPointX(Integer startPointX) {
    this.startPointX = startPointX;
  }

  public Tile startPointY(Integer startPointY) {
    this.startPointY = startPointY;
    return this;
  }

   /**
   * The Y coordinate of the lowest left point on the drawing where the tile begins
   * @return startPointY
  **/
  @ApiModelProperty(required = true, value = "The Y coordinate of the lowest left point on the drawing where the tile begins")
  public Integer getStartPointY() {
    return startPointY;
  }

  public void setStartPointY(Integer startPointY) {
    this.startPointY = startPointY;
  }

  public Tile width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the tile in pixels
   * @return width
  **/
  @ApiModelProperty(required = true, value = "The width of the tile in pixels")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Tile height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the tile in pixels
   * @return height
  **/
  @ApiModelProperty(required = true, value = "The height of the tile in pixels")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tile tile = (Tile) o;
    return Objects.equals(this.startPointX, tile.startPointX) &&
        Objects.equals(this.startPointY, tile.startPointY) &&
        Objects.equals(this.width, tile.width) &&
        Objects.equals(this.height, tile.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startPointX, startPointY, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tile {\n");
    
    sb.append("    startPointX: ").append(toIndentedString(startPointX)).append("\n");
    sb.append("    startPointY: ").append(toIndentedString(startPointY)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

