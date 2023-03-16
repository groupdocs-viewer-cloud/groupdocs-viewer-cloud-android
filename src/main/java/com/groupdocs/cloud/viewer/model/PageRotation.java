/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PageRotation.java">
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
 * Clockwise page rotation 
 */
@ApiModel(description = "Clockwise page rotation ")
public class PageRotation {
  @SerializedName("pageNumber")
  private Integer pageNumber = null;

  /**
   * Rotation angle
   */
  @JsonAdapter(RotationAngleEnum.Adapter.class)
  public enum RotationAngleEnum {
    ON90DEGREE("On90Degree"),
    
    ON180DEGREE("On180Degree"),
    
    ON270DEGREE("On270Degree");

    private String value;

    RotationAngleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RotationAngleEnum fromValue(String text) {
      for (RotationAngleEnum b : RotationAngleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RotationAngleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RotationAngleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RotationAngleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RotationAngleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("rotationAngle")
  private RotationAngleEnum rotationAngle = null;

  public PageRotation pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number to rotate
   * @return pageNumber
  **/
  @ApiModelProperty(required = true, value = "Page number to rotate")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PageRotation rotationAngle(RotationAngleEnum rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Rotation angle
   * @return rotationAngle
  **/
  @ApiModelProperty(required = true, value = "Rotation angle")
  public RotationAngleEnum getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(RotationAngleEnum rotationAngle) {
    this.rotationAngle = rotationAngle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageRotation pageRotation = (PageRotation) o;
    return Objects.equals(this.pageNumber, pageRotation.pageNumber) &&
        Objects.equals(this.rotationAngle, pageRotation.rotationAngle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, rotationAngle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageRotation {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
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

