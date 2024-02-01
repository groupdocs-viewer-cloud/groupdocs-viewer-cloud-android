/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ViewResult.java">
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
import com.groupdocs.cloud.viewer.model.AttachmentView;
import com.groupdocs.cloud.viewer.model.PageView;
import com.groupdocs.cloud.viewer.model.Resource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * View result information
 */
@ApiModel(description = "View result information")
public class ViewResult {
  @SerializedName("pages")
  private List<PageView> pages = null;

  @SerializedName("attachments")
  private List<AttachmentView> attachments = null;

  @SerializedName("file")
  private Resource file = null;

  public ViewResult pages(List<PageView> pages) {
    this.pages = pages;
    return this;
  }

  public ViewResult addPagesItem(PageView pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<PageView>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * View result pages
   * @return pages
  **/
  @ApiModelProperty(value = "View result pages")
  public List<PageView> getPages() {
    return pages;
  }

  public void setPages(List<PageView> pages) {
    this.pages = pages;
  }

  public ViewResult attachments(List<AttachmentView> attachments) {
    this.attachments = attachments;
    return this;
  }

  public ViewResult addAttachmentsItem(AttachmentView attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<AttachmentView>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "Attachments")
  public List<AttachmentView> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentView> attachments) {
    this.attachments = attachments;
  }

  public ViewResult file(Resource file) {
    this.file = file;
    return this;
  }

   /**
   * ULR to retrieve file.
   * @return file
  **/
  @ApiModelProperty(value = "ULR to retrieve file.")
  public Resource getFile() {
    return file;
  }

  public void setFile(Resource file) {
    this.file = file;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewResult viewResult = (ViewResult) o;
    return Objects.equals(this.pages, viewResult.pages) &&
        Objects.equals(this.attachments, viewResult.attachments) &&
        Objects.equals(this.file, viewResult.file);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pages, attachments, file);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewResult {\n");
    
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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

