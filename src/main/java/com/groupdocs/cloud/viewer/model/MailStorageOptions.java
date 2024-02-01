/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="MailStorageOptions.java">
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
 * Provides options for rendering Mail storage (Lotus Notes, MBox) data files.
 */
@ApiModel(description = "Provides options for rendering Mail storage (Lotus Notes, MBox) data files.")
public class MailStorageOptions {
  @SerializedName("textFilter")
  private String textFilter = null;

  @SerializedName("addressFilter")
  private String addressFilter = null;

  @SerializedName("maxItems")
  private Integer maxItems = null;

  public MailStorageOptions textFilter(String textFilter) {
    this.textFilter = textFilter;
    return this;
  }

   /**
   * The keywords used to filter messages.
   * @return textFilter
  **/
  @ApiModelProperty(value = "The keywords used to filter messages.")
  public String getTextFilter() {
    return textFilter;
  }

  public void setTextFilter(String textFilter) {
    this.textFilter = textFilter;
  }

  public MailStorageOptions addressFilter(String addressFilter) {
    this.addressFilter = addressFilter;
    return this;
  }

   /**
   * The email-address used to filter messages by sender or recipient.
   * @return addressFilter
  **/
  @ApiModelProperty(value = "The email-address used to filter messages by sender or recipient.")
  public String getAddressFilter() {
    return addressFilter;
  }

  public void setAddressFilter(String addressFilter) {
    this.addressFilter = addressFilter;
  }

  public MailStorageOptions maxItems(Integer maxItems) {
    this.maxItems = maxItems;
    return this;
  }

   /**
   * The maximum number of messages or items for render. Default value is 0 - all messages will be rendered
   * @return maxItems
  **/
  @ApiModelProperty(required = true, value = "The maximum number of messages or items for render. Default value is 0 - all messages will be rendered")
  public Integer getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Integer maxItems) {
    this.maxItems = maxItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailStorageOptions mailStorageOptions = (MailStorageOptions) o;
    return Objects.equals(this.textFilter, mailStorageOptions.textFilter) &&
        Objects.equals(this.addressFilter, mailStorageOptions.addressFilter) &&
        Objects.equals(this.maxItems, mailStorageOptions.maxItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textFilter, addressFilter, maxItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailStorageOptions {\n");
    
    sb.append("    textFilter: ").append(toIndentedString(textFilter)).append("\n");
    sb.append("    addressFilter: ").append(toIndentedString(addressFilter)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
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

