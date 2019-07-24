/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="RenderOptions.java">
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
import com.groupdocs.cloud.viewer.model.CadOptions;
import com.groupdocs.cloud.viewer.model.EmailOptions;
import com.groupdocs.cloud.viewer.model.ProjectManagementOptions;
import com.groupdocs.cloud.viewer.model.SpreadsheetOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Rendering options
 */
@ApiModel(description = "Rendering options")
public class RenderOptions {
  @SerializedName("startPageNumber")
  private Integer startPageNumber = null;

  @SerializedName("countPagesToRender")
  private Integer countPagesToRender = null;

  @SerializedName("defaultFontName")
  private String defaultFontName = null;

  @SerializedName("defaultEncoding")
  private String defaultEncoding = null;

  @SerializedName("renderComments")
  private Boolean renderComments = null;

  @SerializedName("renderHiddenPages")
  private Boolean renderHiddenPages = null;

  @SerializedName("spreadsheetOptions")
  private SpreadsheetOptions spreadsheetOptions = null;

  @SerializedName("cadOptions")
  private CadOptions cadOptions = null;

  @SerializedName("emailOptions")
  private EmailOptions emailOptions = null;

  @SerializedName("projectManagementOptions")
  private ProjectManagementOptions projectManagementOptions = null;

  public RenderOptions startPageNumber(Integer startPageNumber) {
    this.startPageNumber = startPageNumber;
    return this;
  }

   /**
   * Page number from which rendering should be started
   * @return startPageNumber
  **/
  @ApiModelProperty(required = true, value = "Page number from which rendering should be started")
  public Integer getStartPageNumber() {
    return startPageNumber;
  }

  public void setStartPageNumber(Integer startPageNumber) {
    this.startPageNumber = startPageNumber;
  }

  public RenderOptions countPagesToRender(Integer countPagesToRender) {
    this.countPagesToRender = countPagesToRender;
    return this;
  }

   /**
   * Count pages which should be rendered
   * @return countPagesToRender
  **/
  @ApiModelProperty(required = true, value = "Count pages which should be rendered")
  public Integer getCountPagesToRender() {
    return countPagesToRender;
  }

  public void setCountPagesToRender(Integer countPagesToRender) {
    this.countPagesToRender = countPagesToRender;
  }

  public RenderOptions defaultFontName(String defaultFontName) {
    this.defaultFontName = defaultFontName;
    return this;
  }

   /**
   * Default font name may be specified in following cases: - You want to generally specify the default font to fall back on, if particular font   in the document cannot be found during rendering. - Your document uses fonts, that contain non-English characters and you want to make sure   any missing font is replaced with one that has the same character set available.
   * @return defaultFontName
  **/
  @ApiModelProperty(value = "Default font name may be specified in following cases: - You want to generally specify the default font to fall back on, if particular font   in the document cannot be found during rendering. - Your document uses fonts, that contain non-English characters and you want to make sure   any missing font is replaced with one that has the same character set available.")
  public String getDefaultFontName() {
    return defaultFontName;
  }

  public void setDefaultFontName(String defaultFontName) {
    this.defaultFontName = defaultFontName;
  }

  public RenderOptions defaultEncoding(String defaultEncoding) {
    this.defaultEncoding = defaultEncoding;
    return this;
  }

   /**
   * Default encoding for the plain text files such as .csv, .txt and .eml files when encoding is not specified in header
   * @return defaultEncoding
  **/
  @ApiModelProperty(value = "Default encoding for the plain text files such as .csv, .txt and .eml files when encoding is not specified in header")
  public String getDefaultEncoding() {
    return defaultEncoding;
  }

  public void setDefaultEncoding(String defaultEncoding) {
    this.defaultEncoding = defaultEncoding;
  }

  public RenderOptions renderComments(Boolean renderComments) {
    this.renderComments = renderComments;
    return this;
  }

   /**
   * When enabled comments will be rendered to the output.
   * @return renderComments
  **/
  @ApiModelProperty(required = true, value = "When enabled comments will be rendered to the output.")
  public Boolean getRenderComments() {
    return renderComments;
  }

  public void setRenderComments(Boolean renderComments) {
    this.renderComments = renderComments;
  }

  public RenderOptions renderHiddenPages(Boolean renderHiddenPages) {
    this.renderHiddenPages = renderHiddenPages;
    return this;
  }

   /**
   * When enabled hidden pages, sheets or slides will be rendered to the output
   * @return renderHiddenPages
  **/
  @ApiModelProperty(required = true, value = "When enabled hidden pages, sheets or slides will be rendered to the output")
  public Boolean getRenderHiddenPages() {
    return renderHiddenPages;
  }

  public void setRenderHiddenPages(Boolean renderHiddenPages) {
    this.renderHiddenPages = renderHiddenPages;
  }

  public RenderOptions spreadsheetOptions(SpreadsheetOptions spreadsheetOptions) {
    this.spreadsheetOptions = spreadsheetOptions;
    return this;
  }

   /**
   * Rendering options for Spreadsheet file formats. Spreadsheet file formats include files with extensions: .xls, .xlsx, .xlsm, .xlsb, .csv, .ods, .ots, .xltx, .xltm, .tsv 
   * @return spreadsheetOptions
  **/
  @ApiModelProperty(value = "Rendering options for Spreadsheet file formats. Spreadsheet file formats include files with extensions: .xls, .xlsx, .xlsm, .xlsb, .csv, .ods, .ots, .xltx, .xltm, .tsv ")
  public SpreadsheetOptions getSpreadsheetOptions() {
    return spreadsheetOptions;
  }

  public void setSpreadsheetOptions(SpreadsheetOptions spreadsheetOptions) {
    this.spreadsheetOptions = spreadsheetOptions;
  }

  public RenderOptions cadOptions(CadOptions cadOptions) {
    this.cadOptions = cadOptions;
    return this;
  }

   /**
   * Rendering options for CAD file formats. CAD file formats include files with extensions: .dwg, .dxf, .dgn, .ifc, .stl
   * @return cadOptions
  **/
  @ApiModelProperty(value = "Rendering options for CAD file formats. CAD file formats include files with extensions: .dwg, .dxf, .dgn, .ifc, .stl")
  public CadOptions getCadOptions() {
    return cadOptions;
  }

  public void setCadOptions(CadOptions cadOptions) {
    this.cadOptions = cadOptions;
  }

  public RenderOptions emailOptions(EmailOptions emailOptions) {
    this.emailOptions = emailOptions;
    return this;
  }

   /**
   * Rendering options for Email file formats. Email file formats include files with extensions: .msg, .eml, .emlx, .ifc, .stl
   * @return emailOptions
  **/
  @ApiModelProperty(value = "Rendering options for Email file formats. Email file formats include files with extensions: .msg, .eml, .emlx, .ifc, .stl")
  public EmailOptions getEmailOptions() {
    return emailOptions;
  }

  public void setEmailOptions(EmailOptions emailOptions) {
    this.emailOptions = emailOptions;
  }

  public RenderOptions projectManagementOptions(ProjectManagementOptions projectManagementOptions) {
    this.projectManagementOptions = projectManagementOptions;
    return this;
  }

   /**
   * Rendering options for Project file formats. Project file formats include files with extensions: .mpt, .mpp
   * @return projectManagementOptions
  **/
  @ApiModelProperty(value = "Rendering options for Project file formats. Project file formats include files with extensions: .mpt, .mpp")
  public ProjectManagementOptions getProjectManagementOptions() {
    return projectManagementOptions;
  }

  public void setProjectManagementOptions(ProjectManagementOptions projectManagementOptions) {
    this.projectManagementOptions = projectManagementOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderOptions renderOptions = (RenderOptions) o;
    return Objects.equals(this.startPageNumber, renderOptions.startPageNumber) &&
        Objects.equals(this.countPagesToRender, renderOptions.countPagesToRender) &&
        Objects.equals(this.defaultFontName, renderOptions.defaultFontName) &&
        Objects.equals(this.defaultEncoding, renderOptions.defaultEncoding) &&
        Objects.equals(this.renderComments, renderOptions.renderComments) &&
        Objects.equals(this.renderHiddenPages, renderOptions.renderHiddenPages) &&
        Objects.equals(this.spreadsheetOptions, renderOptions.spreadsheetOptions) &&
        Objects.equals(this.cadOptions, renderOptions.cadOptions) &&
        Objects.equals(this.emailOptions, renderOptions.emailOptions) &&
        Objects.equals(this.projectManagementOptions, renderOptions.projectManagementOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startPageNumber, countPagesToRender, defaultFontName, defaultEncoding, renderComments, renderHiddenPages, spreadsheetOptions, cadOptions, emailOptions, projectManagementOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderOptions {\n");
    
    sb.append("    startPageNumber: ").append(toIndentedString(startPageNumber)).append("\n");
    sb.append("    countPagesToRender: ").append(toIndentedString(countPagesToRender)).append("\n");
    sb.append("    defaultFontName: ").append(toIndentedString(defaultFontName)).append("\n");
    sb.append("    defaultEncoding: ").append(toIndentedString(defaultEncoding)).append("\n");
    sb.append("    renderComments: ").append(toIndentedString(renderComments)).append("\n");
    sb.append("    renderHiddenPages: ").append(toIndentedString(renderHiddenPages)).append("\n");
    sb.append("    spreadsheetOptions: ").append(toIndentedString(spreadsheetOptions)).append("\n");
    sb.append("    cadOptions: ").append(toIndentedString(cadOptions)).append("\n");
    sb.append("    emailOptions: ").append(toIndentedString(emailOptions)).append("\n");
    sb.append("    projectManagementOptions: ").append(toIndentedString(projectManagementOptions)).append("\n");
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

