/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="InfoResult.java">
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
import com.groupdocs.cloud.viewer.model.ArchiveViewInfo;
import com.groupdocs.cloud.viewer.model.AttachmentInfo;
import com.groupdocs.cloud.viewer.model.CadViewInfo;
import com.groupdocs.cloud.viewer.model.OutlookViewInfo;
import com.groupdocs.cloud.viewer.model.PageInfo;
import com.groupdocs.cloud.viewer.model.PdfViewInfo;
import com.groupdocs.cloud.viewer.model.ProjectManagementViewInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * View result information
 */
@ApiModel(description = "View result information")
public class InfoResult {
  @SerializedName("formatExtension")
  private String formatExtension = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("pages")
  private List<PageInfo> pages = null;

  @SerializedName("attachments")
  private List<AttachmentInfo> attachments = null;

  @SerializedName("archiveViewInfo")
  private ArchiveViewInfo archiveViewInfo = null;

  @SerializedName("cadViewInfo")
  private CadViewInfo cadViewInfo = null;

  @SerializedName("projectManagementViewInfo")
  private ProjectManagementViewInfo projectManagementViewInfo = null;

  @SerializedName("outlookViewInfo")
  private OutlookViewInfo outlookViewInfo = null;

  @SerializedName("pdfViewInfo")
  private PdfViewInfo pdfViewInfo = null;

  public InfoResult formatExtension(String formatExtension) {
    this.formatExtension = formatExtension;
    return this;
  }

   /**
   * File format extension
   * @return formatExtension
  **/
  @ApiModelProperty(value = "File format extension")
  public String getFormatExtension() {
    return formatExtension;
  }

  public void setFormatExtension(String formatExtension) {
    this.formatExtension = formatExtension;
  }

  public InfoResult format(String format) {
    this.format = format;
    return this;
  }

   /**
   * File format
   * @return format
  **/
  @ApiModelProperty(value = "File format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public InfoResult pages(List<PageInfo> pages) {
    this.pages = pages;
    return this;
  }

  public InfoResult addPagesItem(PageInfo pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<PageInfo>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * View result pages
   * @return pages
  **/
  @ApiModelProperty(value = "View result pages")
  public List<PageInfo> getPages() {
    return pages;
  }

  public void setPages(List<PageInfo> pages) {
    this.pages = pages;
  }

  public InfoResult attachments(List<AttachmentInfo> attachments) {
    this.attachments = attachments;
    return this;
  }

  public InfoResult addAttachmentsItem(AttachmentInfo attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<AttachmentInfo>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "Attachments")
  public List<AttachmentInfo> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentInfo> attachments) {
    this.attachments = attachments;
  }

  public InfoResult archiveViewInfo(ArchiveViewInfo archiveViewInfo) {
    this.archiveViewInfo = archiveViewInfo;
    return this;
  }

   /**
   * Represents view information for archive file
   * @return archiveViewInfo
  **/
  @ApiModelProperty(value = "Represents view information for archive file")
  public ArchiveViewInfo getArchiveViewInfo() {
    return archiveViewInfo;
  }

  public void setArchiveViewInfo(ArchiveViewInfo archiveViewInfo) {
    this.archiveViewInfo = archiveViewInfo;
  }

  public InfoResult cadViewInfo(CadViewInfo cadViewInfo) {
    this.cadViewInfo = cadViewInfo;
    return this;
  }

   /**
   * Represents view information for CAD drawing
   * @return cadViewInfo
  **/
  @ApiModelProperty(value = "Represents view information for CAD drawing")
  public CadViewInfo getCadViewInfo() {
    return cadViewInfo;
  }

  public void setCadViewInfo(CadViewInfo cadViewInfo) {
    this.cadViewInfo = cadViewInfo;
  }

  public InfoResult projectManagementViewInfo(ProjectManagementViewInfo projectManagementViewInfo) {
    this.projectManagementViewInfo = projectManagementViewInfo;
    return this;
  }

   /**
   * Represents view information for MS Project document
   * @return projectManagementViewInfo
  **/
  @ApiModelProperty(value = "Represents view information for MS Project document")
  public ProjectManagementViewInfo getProjectManagementViewInfo() {
    return projectManagementViewInfo;
  }

  public void setProjectManagementViewInfo(ProjectManagementViewInfo projectManagementViewInfo) {
    this.projectManagementViewInfo = projectManagementViewInfo;
  }

  public InfoResult outlookViewInfo(OutlookViewInfo outlookViewInfo) {
    this.outlookViewInfo = outlookViewInfo;
    return this;
  }

   /**
   * Represents view information for Outlook Data file
   * @return outlookViewInfo
  **/
  @ApiModelProperty(value = "Represents view information for Outlook Data file")
  public OutlookViewInfo getOutlookViewInfo() {
    return outlookViewInfo;
  }

  public void setOutlookViewInfo(OutlookViewInfo outlookViewInfo) {
    this.outlookViewInfo = outlookViewInfo;
  }

  public InfoResult pdfViewInfo(PdfViewInfo pdfViewInfo) {
    this.pdfViewInfo = pdfViewInfo;
    return this;
  }

   /**
   * Represents view information for PDF document
   * @return pdfViewInfo
  **/
  @ApiModelProperty(value = "Represents view information for PDF document")
  public PdfViewInfo getPdfViewInfo() {
    return pdfViewInfo;
  }

  public void setPdfViewInfo(PdfViewInfo pdfViewInfo) {
    this.pdfViewInfo = pdfViewInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoResult infoResult = (InfoResult) o;
    return Objects.equals(this.formatExtension, infoResult.formatExtension) &&
        Objects.equals(this.format, infoResult.format) &&
        Objects.equals(this.pages, infoResult.pages) &&
        Objects.equals(this.attachments, infoResult.attachments) &&
        Objects.equals(this.archiveViewInfo, infoResult.archiveViewInfo) &&
        Objects.equals(this.cadViewInfo, infoResult.cadViewInfo) &&
        Objects.equals(this.projectManagementViewInfo, infoResult.projectManagementViewInfo) &&
        Objects.equals(this.outlookViewInfo, infoResult.outlookViewInfo) &&
        Objects.equals(this.pdfViewInfo, infoResult.pdfViewInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatExtension, format, pages, attachments, archiveViewInfo, cadViewInfo, projectManagementViewInfo, outlookViewInfo, pdfViewInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoResult {\n");
    
    sb.append("    formatExtension: ").append(toIndentedString(formatExtension)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    archiveViewInfo: ").append(toIndentedString(archiveViewInfo)).append("\n");
    sb.append("    cadViewInfo: ").append(toIndentedString(cadViewInfo)).append("\n");
    sb.append("    projectManagementViewInfo: ").append(toIndentedString(projectManagementViewInfo)).append("\n");
    sb.append("    outlookViewInfo: ").append(toIndentedString(outlookViewInfo)).append("\n");
    sb.append("    pdfViewInfo: ").append(toIndentedString(pdfViewInfo)).append("\n");
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

