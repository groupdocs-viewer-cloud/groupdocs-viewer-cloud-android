/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="OutlookOptions.java">
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
 * Provides options for rendering Outlook data files
 */
@ApiModel(description = "Provides options for rendering Outlook data files")
public class OutlookOptions {
  @SerializedName("folder")
  private String folder = null;

  @SerializedName("textFilter")
  private String textFilter = null;

  @SerializedName("addressFilter")
  private String addressFilter = null;

  @SerializedName("maxItemsInFolder")
  private Integer maxItemsInFolder = null;

  public OutlookOptions folder(String folder) {
    this.folder = folder;
    return this;
  }

   /**
   * The name of the folder (e.g. Inbox, Sent Item or Deleted Items) to render
   * @return folder
  **/
  @ApiModelProperty(value = "The name of the folder (e.g. Inbox, Sent Item or Deleted Items) to render")
  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public OutlookOptions textFilter(String textFilter) {
    this.textFilter = textFilter;
    return this;
  }

   /**
   * The keywords used to filter messages
   * @return textFilter
  **/
  @ApiModelProperty(value = "The keywords used to filter messages")
  public String getTextFilter() {
    return textFilter;
  }

  public void setTextFilter(String textFilter) {
    this.textFilter = textFilter;
  }

  public OutlookOptions addressFilter(String addressFilter) {
    this.addressFilter = addressFilter;
    return this;
  }

   /**
   * The email-address used to filter messages by sender or recipient
   * @return addressFilter
  **/
  @ApiModelProperty(value = "The email-address used to filter messages by sender or recipient")
  public String getAddressFilter() {
    return addressFilter;
  }

  public void setAddressFilter(String addressFilter) {
    this.addressFilter = addressFilter;
  }

  public OutlookOptions maxItemsInFolder(Integer maxItemsInFolder) {
    this.maxItemsInFolder = maxItemsInFolder;
    return this;
  }

   /**
   * The maximum number of messages or items, that can be rendered from one folder
   * @return maxItemsInFolder
  **/
  @ApiModelProperty(required = true, value = "The maximum number of messages or items, that can be rendered from one folder")
  public Integer getMaxItemsInFolder() {
    return maxItemsInFolder;
  }

  public void setMaxItemsInFolder(Integer maxItemsInFolder) {
    this.maxItemsInFolder = maxItemsInFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutlookOptions outlookOptions = (OutlookOptions) o;
    return Objects.equals(this.folder, outlookOptions.folder) &&
        Objects.equals(this.textFilter, outlookOptions.textFilter) &&
        Objects.equals(this.addressFilter, outlookOptions.addressFilter) &&
        Objects.equals(this.maxItemsInFolder, outlookOptions.maxItemsInFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folder, textFilter, addressFilter, maxItemsInFolder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutlookOptions {\n");
    
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    textFilter: ").append(toIndentedString(textFilter)).append("\n");
    sb.append("    addressFilter: ").append(toIndentedString(addressFilter)).append("\n");
    sb.append("    maxItemsInFolder: ").append(toIndentedString(maxItemsInFolder)).append("\n");
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

