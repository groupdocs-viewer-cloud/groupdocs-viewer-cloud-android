/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ConvertAndDownloadRequest.java">
 *   Copyright (c) Aspose Pty Ltd
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

package com.groupdocs.cloud.viewer.model.requests;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.viewer.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.File;

/**
 * Request model for convertAndDownload method.
 */
public class ConvertAndDownloadRequest {
    
    /**
    * Initializes a new instance of the ConvertAndDownloadRequest class.
    */      
    public ConvertAndDownloadRequest()
    {
    }

    /**
    * Initializes a new instance of the ConvertAndDownloadRequest class.    
    * @param format Requested conversion format: HTML, JPG, PNG or PDF
    * @param file Input file to convert
    * @param pages Pages range to render, like \"1,2\" or \"3-5,10\"
    * @param password Input document password
    */
    public ConvertAndDownloadRequest(String format, File file, String pages, String password)
    {
        this.format = format;
        this.file = file;
        this.pages = pages;
        this.password = password;
    }

  @SerializedName("format")
  private String format = null;

  @SerializedName("file")
  private File file = null;

  @SerializedName("pages")
  private String pages = null;

  @SerializedName("password")
  private String password = null;

  /**
   * Requested conversion format: HTML, JPG, PNG or PDF
   * @return Requested conversion format: HTML, JPG, PNG or PDF
  **/
  @ApiModelProperty(example = "format_example", required = true, value = "Requested conversion format: HTML, JPG, PNG or PDF")
  public String getformat() {
    return format;
  }

  public void setformat(String format) {
    this.format = format;
  }

  /**
   * Input file to convert
   * @return Input file to convert
  **/
  @ApiModelProperty(example = "new File(&quot;/path/to/file.txt&quot;)", required = true, value = "Input file to convert")
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  /**
   * Pages range to render, like \"1,2\" or \"3-5,10\"
   * @return Pages range to render, like \"1,2\" or \"3-5,10\"
  **/
  @ApiModelProperty(example = "pages_example", value = "Pages range to render, like \"1,2\" or \"3-5,10\"")
  public String getpages() {
    return pages;
  }

  public void setpages(String pages) {
    this.pages = pages;
  }

  /**
   * Input document password
   * @return Input document password
  **/
  @ApiModelProperty(example = "password_example", value = "Input document password")
  public String getpassword() {
    return password;
  }

  public void setpassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    ConvertAndDownloadRequest request = (ConvertAndDownloadRequest) o;
    return Objects.equals(this.format, request.format) &&
        Objects.equals(this.file, request.file) &&
        Objects.equals(this.pages, request.pages) &&
        Objects.equals(this.password, request.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, file, pages, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertAndDownload {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

