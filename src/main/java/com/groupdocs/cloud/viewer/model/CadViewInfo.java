/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="CadViewInfo.java">
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
import com.groupdocs.cloud.viewer.model.Layer;
import com.groupdocs.cloud.viewer.model.Layout;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents view information for CAD drawing
 */
@ApiModel(description = "Represents view information for CAD drawing")
public class CadViewInfo {
  @SerializedName("layers")
  private List<Layer> layers = null;

  @SerializedName("layouts")
  private List<Layout> layouts = null;

  public CadViewInfo layers(List<Layer> layers) {
    this.layers = layers;
    return this;
  }

  public CadViewInfo addLayersItem(Layer layersItem) {
    if (this.layers == null) {
      this.layers = new ArrayList<Layer>();
    }
    this.layers.add(layersItem);
    return this;
  }

   /**
   * The list of layers contained by the CAD drawing
   * @return layers
  **/
  @ApiModelProperty(value = "The list of layers contained by the CAD drawing")
  public List<Layer> getLayers() {
    return layers;
  }

  public void setLayers(List<Layer> layers) {
    this.layers = layers;
  }

  public CadViewInfo layouts(List<Layout> layouts) {
    this.layouts = layouts;
    return this;
  }

  public CadViewInfo addLayoutsItem(Layout layoutsItem) {
    if (this.layouts == null) {
      this.layouts = new ArrayList<Layout>();
    }
    this.layouts.add(layoutsItem);
    return this;
  }

   /**
   * The list of layouts contained by the CAD drawing
   * @return layouts
  **/
  @ApiModelProperty(value = "The list of layouts contained by the CAD drawing")
  public List<Layout> getLayouts() {
    return layouts;
  }

  public void setLayouts(List<Layout> layouts) {
    this.layouts = layouts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CadViewInfo cadViewInfo = (CadViewInfo) o;
    return Objects.equals(this.layers, cadViewInfo.layers) &&
        Objects.equals(this.layouts, cadViewInfo.layouts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layers, layouts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadViewInfo {\n");
    
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
    sb.append("    layouts: ").append(toIndentedString(layouts)).append("\n");
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

