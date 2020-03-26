/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="CopyFileRequest.java">
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
 * Request model for copyFile method.
 */
public class CopyFileRequest {
    
    /**
    * Initializes a new instance of the CopyFileRequest class.
    */      
    public CopyFileRequest()
    {
    }

    /**
    * Initializes a new instance of the CopyFileRequest class.    
    * @param srcPath Source file path e.g. '/folder/file.ext'
    * @param destPath Destination file path
    * @param srcStorageName Source storage name
    * @param destStorageName Destination storage name
    * @param versionId File version ID to copy
    */
    public CopyFileRequest(String srcPath, String destPath, String srcStorageName, String destStorageName, String versionId)
    {
        this.srcPath = srcPath;
        this.destPath = destPath;
        this.srcStorageName = srcStorageName;
        this.destStorageName = destStorageName;
        this.versionId = versionId;
    }

  @SerializedName("srcPath")
  private String srcPath = null;

  @SerializedName("destPath")
  private String destPath = null;

  @SerializedName("srcStorageName")
  private String srcStorageName = null;

  @SerializedName("destStorageName")
  private String destStorageName = null;

  @SerializedName("versionId")
  private String versionId = null;

  /**
   * Source file path e.g. '/folder/file.ext'
   * @return Source file path e.g. '/folder/file.ext'
  **/
  @ApiModelProperty(example = "srcPath_example", required = true, value = "Source file path e.g. '/folder/file.ext'")
  public String getsrcPath() {
    return srcPath;
  }

  public void setsrcPath(String srcPath) {
    this.srcPath = srcPath;
  }

  /**
   * Destination file path
   * @return Destination file path
  **/
  @ApiModelProperty(example = "destPath_example", required = true, value = "Destination file path")
  public String getdestPath() {
    return destPath;
  }

  public void setdestPath(String destPath) {
    this.destPath = destPath;
  }

  /**
   * Source storage name
   * @return Source storage name
  **/
  @ApiModelProperty(example = "srcStorageName_example", value = "Source storage name")
  public String getsrcStorageName() {
    return srcStorageName;
  }

  public void setsrcStorageName(String srcStorageName) {
    this.srcStorageName = srcStorageName;
  }

  /**
   * Destination storage name
   * @return Destination storage name
  **/
  @ApiModelProperty(example = "destStorageName_example", value = "Destination storage name")
  public String getdestStorageName() {
    return destStorageName;
  }

  public void setdestStorageName(String destStorageName) {
    this.destStorageName = destStorageName;
  }

  /**
   * File version ID to copy
   * @return File version ID to copy
  **/
  @ApiModelProperty(example = "versionId_example", value = "File version ID to copy")
  public String getversionId() {
    return versionId;
  }

  public void setversionId(String versionId) {
    this.versionId = versionId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    CopyFileRequest request = (CopyFileRequest) o;
    return Objects.equals(this.srcPath, request.srcPath) &&
        Objects.equals(this.destPath, request.destPath) &&
        Objects.equals(this.srcStorageName, request.srcStorageName) &&
        Objects.equals(this.destStorageName, request.destStorageName) &&
        Objects.equals(this.versionId, request.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srcPath, destPath, srcStorageName, destStorageName, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopyFile {\n");
    sb.append("    srcPath: ").append(toIndentedString(srcPath)).append("\n");
    sb.append("    destPath: ").append(toIndentedString(destPath)).append("\n");
    sb.append("    srcStorageName: ").append(toIndentedString(srcStorageName)).append("\n");
    sb.append("    destStorageName: ").append(toIndentedString(destStorageName)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

