/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="VisioRenderingOptions.java">
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
 * The Visio files processing documents view options.
 */
@ApiModel(description = "The Visio files processing documents view options.")
public class VisioRenderingOptions {
  @SerializedName("renderFiguresOnly")
  private Boolean renderFiguresOnly = null;

  @SerializedName("figureWidth")
  private Integer figureWidth = null;

  public VisioRenderingOptions renderFiguresOnly(Boolean renderFiguresOnly) {
    this.renderFiguresOnly = renderFiguresOnly;
    return this;
  }

   /**
   * Render only Visio figures, not a diagram.
   * @return renderFiguresOnly
  **/
  @ApiModelProperty(required = true, value = "Render only Visio figures, not a diagram.")
  public Boolean getRenderFiguresOnly() {
    return renderFiguresOnly;
  }

  public void setRenderFiguresOnly(Boolean renderFiguresOnly) {
    this.renderFiguresOnly = renderFiguresOnly;
  }

  public VisioRenderingOptions figureWidth(Integer figureWidth) {
    this.figureWidth = figureWidth;
    return this;
  }

   /**
   * Figure width, height will be calculated automatically. Default value is 100.
   * @return figureWidth
  **/
  @ApiModelProperty(required = true, value = "Figure width, height will be calculated automatically. Default value is 100.")
  public Integer getFigureWidth() {
    return figureWidth;
  }

  public void setFigureWidth(Integer figureWidth) {
    this.figureWidth = figureWidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisioRenderingOptions visioRenderingOptions = (VisioRenderingOptions) o;
    return Objects.equals(this.renderFiguresOnly, visioRenderingOptions.renderFiguresOnly) &&
        Objects.equals(this.figureWidth, visioRenderingOptions.figureWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renderFiguresOnly, figureWidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisioRenderingOptions {\n");
    
    sb.append("    renderFiguresOnly: ").append(toIndentedString(renderFiguresOnly)).append("\n");
    sb.append("    figureWidth: ").append(toIndentedString(figureWidth)).append("\n");
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

