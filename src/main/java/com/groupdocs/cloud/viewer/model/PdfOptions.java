/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfOptions.java">
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
import java.util.List;

/**
 * Options for rendering document into PDF
 */
@ApiModel(description = "Options for rendering document into PDF")
public class PdfOptions extends RenderOptions {
  @SerializedName("jpgQuality")
  private Integer jpgQuality = null;

  @SerializedName("documentOpenPassword")
  private String documentOpenPassword = null;

  @SerializedName("permissionsPassword")
  private String permissionsPassword = null;

  /**
   * The PDF document permissions such as printing, modification and data extraction
   */
  @JsonAdapter(PermissionsEnum.Adapter.class)
  public enum PermissionsEnum {
    ALLOWALL("AllowAll"),
    
    DENYPRINTING("DenyPrinting"),
    
    DENYMODIFICATION("DenyModification"),
    
    DENYDATAEXTRACTION("DenyDataExtraction"),
    
    DENYALL("DenyAll");

    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PermissionsEnum fromValue(String text) {
      for (PermissionsEnum b : PermissionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PermissionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PermissionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PermissionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PermissionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("permissions")
  private PermissionsEnum permissions = null;

  public PdfOptions jpgQuality(Integer jpgQuality) {
    this.jpgQuality = jpgQuality;
    return this;
  }

   /**
   * The quality of the JPG images contained by output PDF document; Valid values are between 1 and 100; Default value is 90
   * @return jpgQuality
  **/
  @ApiModelProperty(required = true, value = "The quality of the JPG images contained by output PDF document; Valid values are between 1 and 100; Default value is 90")
  public Integer getJpgQuality() {
    return jpgQuality;
  }

  public void setJpgQuality(Integer jpgQuality) {
    this.jpgQuality = jpgQuality;
  }

  public PdfOptions documentOpenPassword(String documentOpenPassword) {
    this.documentOpenPassword = documentOpenPassword;
    return this;
  }

   /**
   * The password required to open the PDF document
   * @return documentOpenPassword
  **/
  @ApiModelProperty(value = "The password required to open the PDF document")
  public String getDocumentOpenPassword() {
    return documentOpenPassword;
  }

  public void setDocumentOpenPassword(String documentOpenPassword) {
    this.documentOpenPassword = documentOpenPassword;
  }

  public PdfOptions permissionsPassword(String permissionsPassword) {
    this.permissionsPassword = permissionsPassword;
    return this;
  }

   /**
   * The password required to change permission settings; Using a permissions password  you can restrict printing, modification and data extraction
   * @return permissionsPassword
  **/
  @ApiModelProperty(value = "The password required to change permission settings; Using a permissions password  you can restrict printing, modification and data extraction")
  public String getPermissionsPassword() {
    return permissionsPassword;
  }

  public void setPermissionsPassword(String permissionsPassword) {
    this.permissionsPassword = permissionsPassword;
  }

  public PdfOptions permissions(PermissionsEnum permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * The PDF document permissions such as printing, modification and data extraction
   * @return permissions
  **/
  @ApiModelProperty(required = true, value = "The PDF document permissions such as printing, modification and data extraction")
  public PermissionsEnum getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsEnum permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfOptions pdfOptions = (PdfOptions) o;
    return Objects.equals(this.jpgQuality, pdfOptions.jpgQuality) &&
        Objects.equals(this.documentOpenPassword, pdfOptions.documentOpenPassword) &&
        Objects.equals(this.permissionsPassword, pdfOptions.permissionsPassword) &&
        Objects.equals(this.permissions, pdfOptions.permissions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jpgQuality, documentOpenPassword, permissionsPassword, permissions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    jpgQuality: ").append(toIndentedString(jpgQuality)).append("\n");
    sb.append("    documentOpenPassword: ").append(toIndentedString(documentOpenPassword)).append("\n");
    sb.append("    permissionsPassword: ").append(toIndentedString(permissionsPassword)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

