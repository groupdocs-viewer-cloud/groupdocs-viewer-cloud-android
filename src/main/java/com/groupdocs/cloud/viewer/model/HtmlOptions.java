/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="HtmlOptions.java">
 *   Copyright (c) 2003-2020 Aspose Pty Ltd
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
import com.groupdocs.cloud.viewer.model.ArchiveOptions;
import com.groupdocs.cloud.viewer.model.CadOptions;
import com.groupdocs.cloud.viewer.model.EmailOptions;
import com.groupdocs.cloud.viewer.model.OutlookOptions;
import com.groupdocs.cloud.viewer.model.PageRotation;
import com.groupdocs.cloud.viewer.model.PdfDocumentOptions;
import com.groupdocs.cloud.viewer.model.ProjectManagementOptions;
import com.groupdocs.cloud.viewer.model.RenderOptions;
import com.groupdocs.cloud.viewer.model.SpreadsheetOptions;
import com.groupdocs.cloud.viewer.model.WordProcessingOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Options for rendering document into HTML
 */
@ApiModel(description = "Options for rendering document into HTML")
public class HtmlOptions extends RenderOptions {
  @SerializedName("externalResources")
  private Boolean externalResources = null;

  @SerializedName("resourcePath")
  private String resourcePath = null;

  @SerializedName("isResponsive")
  private Boolean isResponsive = null;

  @SerializedName("minify")
  private Boolean minify = null;

  @SerializedName("excludeFonts")
  private Boolean excludeFonts = null;

  @SerializedName("fontsToExclude")
  private List<String> fontsToExclude = null;

  public HtmlOptions externalResources(Boolean externalResources) {
    this.externalResources = externalResources;
    return this;
  }

   /**
   * Controls output HTML document resources (styles, images and fonts) linking. By default this option is disabled and all the resources are embedded into HTML document.
   * @return externalResources
  **/
  @ApiModelProperty(required = true, value = "Controls output HTML document resources (styles, images and fonts) linking. By default this option is disabled and all the resources are embedded into HTML document.")
  public Boolean getExternalResources() {
    return externalResources;
  }

  public void setExternalResources(Boolean externalResources) {
    this.externalResources = externalResources;
  }

  public HtmlOptions resourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
    return this;
  }

   /**
   * Path for the HTML resources (styles, images and fonts). For example when resource path is http://example.com/api/pages/{page-number}/resources/{resource-name} the {page-number} and {resource-name} templates will be replaced with page number and resource name accordingly. This option is ignored when ExternalResources option is disabled.
   * @return resourcePath
  **/
  @ApiModelProperty(value = "Path for the HTML resources (styles, images and fonts). For example when resource path is http://example.com/api/pages/{page-number}/resources/{resource-name} the {page-number} and {resource-name} templates will be replaced with page number and resource name accordingly. This option is ignored when ExternalResources option is disabled.")
  public String getResourcePath() {
    return resourcePath;
  }

  public void setResourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
  }

  public HtmlOptions isResponsive(Boolean isResponsive) {
    this.isResponsive = isResponsive;
    return this;
  }

   /**
   * Indicates whether rendering will provide responsive web pages, that look well on different device types. Default value is false.
   * @return isResponsive
  **/
  @ApiModelProperty(required = true, value = "Indicates whether rendering will provide responsive web pages, that look well on different device types. Default value is false.")
  public Boolean getIsResponsive() {
    return isResponsive;
  }

  public void setIsResponsive(Boolean isResponsive) {
    this.isResponsive = isResponsive;
  }

  public HtmlOptions minify(Boolean minify) {
    this.minify = minify;
    return this;
  }

   /**
   * Enables HTML content and HTML resources minification
   * @return minify
  **/
  @ApiModelProperty(required = true, value = "Enables HTML content and HTML resources minification")
  public Boolean getMinify() {
    return minify;
  }

  public void setMinify(Boolean minify) {
    this.minify = minify;
  }

  public HtmlOptions excludeFonts(Boolean excludeFonts) {
    this.excludeFonts = excludeFonts;
    return this;
  }

   /**
   * When enabled prevents adding any fonts into HTML document             
   * @return excludeFonts
  **/
  @ApiModelProperty(required = true, value = "When enabled prevents adding any fonts into HTML document             ")
  public Boolean getExcludeFonts() {
    return excludeFonts;
  }

  public void setExcludeFonts(Boolean excludeFonts) {
    this.excludeFonts = excludeFonts;
  }

  public HtmlOptions fontsToExclude(List<String> fontsToExclude) {
    this.fontsToExclude = fontsToExclude;
    return this;
  }

  public HtmlOptions addFontsToExcludeItem(String fontsToExcludeItem) {
    if (this.fontsToExclude == null) {
      this.fontsToExclude = new ArrayList<String>();
    }
    this.fontsToExclude.add(fontsToExcludeItem);
    return this;
  }

   /**
   * This option is supported for presentations only. The list of font names, to exclude from HTML document             
   * @return fontsToExclude
  **/
  @ApiModelProperty(value = "This option is supported for presentations only. The list of font names, to exclude from HTML document             ")
  public List<String> getFontsToExclude() {
    return fontsToExclude;
  }

  public void setFontsToExclude(List<String> fontsToExclude) {
    this.fontsToExclude = fontsToExclude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlOptions htmlOptions = (HtmlOptions) o;
    return Objects.equals(this.externalResources, htmlOptions.externalResources) &&
        Objects.equals(this.resourcePath, htmlOptions.resourcePath) &&
        Objects.equals(this.isResponsive, htmlOptions.isResponsive) &&
        Objects.equals(this.minify, htmlOptions.minify) &&
        Objects.equals(this.excludeFonts, htmlOptions.excludeFonts) &&
        Objects.equals(this.fontsToExclude, htmlOptions.fontsToExclude) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalResources, resourcePath, isResponsive, minify, excludeFonts, fontsToExclude, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalResources: ").append(toIndentedString(externalResources)).append("\n");
    sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
    sb.append("    isResponsive: ").append(toIndentedString(isResponsive)).append("\n");
    sb.append("    minify: ").append(toIndentedString(minify)).append("\n");
    sb.append("    excludeFonts: ").append(toIndentedString(excludeFonts)).append("\n");
    sb.append("    fontsToExclude: ").append(toIndentedString(fontsToExclude)).append("\n");
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

