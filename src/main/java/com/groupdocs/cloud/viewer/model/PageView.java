/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PageView.java">
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
import com.groupdocs.cloud.viewer.model.HtmlResource;
import com.groupdocs.cloud.viewer.model.Resource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Page information
 */
@ApiModel(description = "Page information")
public class PageView extends Resource {
  @SerializedName("number")
  private Integer number = null;

  @SerializedName("resources")
  private List<HtmlResource> resources = null;

  public PageView number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Page number
   * @return number
  **/
  @ApiModelProperty(required = true, value = "Page number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PageView resources(List<HtmlResource> resources) {
    this.resources = resources;
    return this;
  }

  public PageView addResourcesItem(HtmlResource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<HtmlResource>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * HTML resources.
   * @return resources
  **/
  @ApiModelProperty(value = "HTML resources.")
  public List<HtmlResource> getResources() {
    return resources;
  }

  public void setResources(List<HtmlResource> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageView pageView = (PageView) o;
    return Objects.equals(this.number, pageView.number) &&
        Objects.equals(this.resources, pageView.resources) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, resources, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageView {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

