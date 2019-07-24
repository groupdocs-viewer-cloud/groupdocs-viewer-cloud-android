/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Row.java">
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
import java.util.ArrayList;
import java.util.List;

/**
 * Page row with text
 */
@ApiModel(description = "Page row with text")
public class Row {
  @SerializedName("text")
  private String text = null;

  @SerializedName("rowLeft")
  private Double rowLeft = null;

  @SerializedName("rowTop")
  private Double rowTop = null;

  @SerializedName("rowWidth")
  private Double rowWidth = null;

  @SerializedName("rowHeight")
  private Double rowHeight = null;

  @SerializedName("textCoordinates")
  private List<Double> textCoordinates = null;

  @SerializedName("characterCoordinates")
  private List<Double> characterCoordinates = null;

  public Row text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Row text
   * @return text
  **/
  @ApiModelProperty(value = "Row text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Row rowLeft(Double rowLeft) {
    this.rowLeft = rowLeft;
    return this;
  }

   /**
   * Row left coordinate
   * @return rowLeft
  **/
  @ApiModelProperty(required = true, value = "Row left coordinate")
  public Double getRowLeft() {
    return rowLeft;
  }

  public void setRowLeft(Double rowLeft) {
    this.rowLeft = rowLeft;
  }

  public Row rowTop(Double rowTop) {
    this.rowTop = rowTop;
    return this;
  }

   /**
   * Row top coordinate
   * @return rowTop
  **/
  @ApiModelProperty(required = true, value = "Row top coordinate")
  public Double getRowTop() {
    return rowTop;
  }

  public void setRowTop(Double rowTop) {
    this.rowTop = rowTop;
  }

  public Row rowWidth(Double rowWidth) {
    this.rowWidth = rowWidth;
    return this;
  }

   /**
   * Row width
   * @return rowWidth
  **/
  @ApiModelProperty(required = true, value = "Row width")
  public Double getRowWidth() {
    return rowWidth;
  }

  public void setRowWidth(Double rowWidth) {
    this.rowWidth = rowWidth;
  }

  public Row rowHeight(Double rowHeight) {
    this.rowHeight = rowHeight;
    return this;
  }

   /**
   * Row height
   * @return rowHeight
  **/
  @ApiModelProperty(required = true, value = "Row height")
  public Double getRowHeight() {
    return rowHeight;
  }

  public void setRowHeight(Double rowHeight) {
    this.rowHeight = rowHeight;
  }

  public Row textCoordinates(List<Double> textCoordinates) {
    this.textCoordinates = textCoordinates;
    return this;
  }

  public Row addTextCoordinatesItem(Double textCoordinatesItem) {
    if (this.textCoordinates == null) {
      this.textCoordinates = new ArrayList<Double>();
    }
    this.textCoordinates.add(textCoordinatesItem);
    return this;
  }

   /**
   * Text coordinates
   * @return textCoordinates
  **/
  @ApiModelProperty(value = "Text coordinates")
  public List<Double> getTextCoordinates() {
    return textCoordinates;
  }

  public void setTextCoordinates(List<Double> textCoordinates) {
    this.textCoordinates = textCoordinates;
  }

  public Row characterCoordinates(List<Double> characterCoordinates) {
    this.characterCoordinates = characterCoordinates;
    return this;
  }

  public Row addCharacterCoordinatesItem(Double characterCoordinatesItem) {
    if (this.characterCoordinates == null) {
      this.characterCoordinates = new ArrayList<Double>();
    }
    this.characterCoordinates.add(characterCoordinatesItem);
    return this;
  }

   /**
   * Characters coordinates
   * @return characterCoordinates
  **/
  @ApiModelProperty(value = "Characters coordinates")
  public List<Double> getCharacterCoordinates() {
    return characterCoordinates;
  }

  public void setCharacterCoordinates(List<Double> characterCoordinates) {
    this.characterCoordinates = characterCoordinates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Row row = (Row) o;
    return Objects.equals(this.text, row.text) &&
        Objects.equals(this.rowLeft, row.rowLeft) &&
        Objects.equals(this.rowTop, row.rowTop) &&
        Objects.equals(this.rowWidth, row.rowWidth) &&
        Objects.equals(this.rowHeight, row.rowHeight) &&
        Objects.equals(this.textCoordinates, row.textCoordinates) &&
        Objects.equals(this.characterCoordinates, row.characterCoordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, rowLeft, rowTop, rowWidth, rowHeight, textCoordinates, characterCoordinates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Row {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    rowLeft: ").append(toIndentedString(rowLeft)).append("\n");
    sb.append("    rowTop: ").append(toIndentedString(rowTop)).append("\n");
    sb.append("    rowWidth: ").append(toIndentedString(rowWidth)).append("\n");
    sb.append("    rowHeight: ").append(toIndentedString(rowHeight)).append("\n");
    sb.append("    textCoordinates: ").append(toIndentedString(textCoordinates)).append("\n");
    sb.append("    characterCoordinates: ").append(toIndentedString(characterCoordinates)).append("\n");
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

