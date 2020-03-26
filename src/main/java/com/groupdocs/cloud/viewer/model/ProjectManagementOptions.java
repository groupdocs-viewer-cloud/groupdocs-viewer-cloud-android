/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ProjectManagementOptions.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Rendering options for Project file formats. Project file formats include files with extensions: .mpt, .mpp
 */
@ApiModel(description = "Rendering options for Project file formats. Project file formats include files with extensions: .mpt, .mpp")
public class ProjectManagementOptions {
  /**
   * The size of the page.
   */
  @JsonAdapter(PageSizeEnum.Adapter.class)
  public enum PageSizeEnum {
    UNSPECIFIED("Unspecified"),
    
    LETTER("Letter"),
    
    LEDGER("Ledger"),
    
    A0("A0"),
    
    A1("A1"),
    
    A2("A2"),
    
    A3("A3"),
    
    A4("A4");

    private String value;

    PageSizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PageSizeEnum fromValue(String text) {
      for (PageSizeEnum b : PageSizeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PageSizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PageSizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PageSizeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PageSizeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("pageSize")
  private PageSizeEnum pageSize = null;

  /**
   * The time unit to use as minimal point.
   */
  @JsonAdapter(TimeUnitEnum.Adapter.class)
  public enum TimeUnitEnum {
    UNSPECIFIED("Unspecified"),
    
    DAYS("Days"),
    
    THIRDSOFMONTHS("ThirdsOfMonths"),
    
    MONTHS("Months");

    private String value;

    TimeUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeUnitEnum fromValue(String text) {
      for (TimeUnitEnum b : TimeUnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TimeUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TimeUnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("timeUnit")
  private TimeUnitEnum timeUnit = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  public ProjectManagementOptions pageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The size of the page.
   * @return pageSize
  **/
  @ApiModelProperty(required = true, value = "The size of the page.")
  public PageSizeEnum getPageSize() {
    return pageSize;
  }

  public void setPageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
  }

  public ProjectManagementOptions timeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * The time unit to use as minimal point.
   * @return timeUnit
  **/
  @ApiModelProperty(required = true, value = "The time unit to use as minimal point.")
  public TimeUnitEnum getTimeUnit() {
    return timeUnit;
  }

  public void setTimeUnit(TimeUnitEnum timeUnit) {
    this.timeUnit = timeUnit;
  }

  public ProjectManagementOptions startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of a Gantt Chart View to render.        
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "The start date of a Gantt Chart View to render.        ")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public ProjectManagementOptions endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of a Gantt Chart View to render.
   * @return endDate
  **/
  @ApiModelProperty(required = true, value = "The end date of a Gantt Chart View to render.")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectManagementOptions projectManagementOptions = (ProjectManagementOptions) o;
    return Objects.equals(this.pageSize, projectManagementOptions.pageSize) &&
        Objects.equals(this.timeUnit, projectManagementOptions.timeUnit) &&
        Objects.equals(this.startDate, projectManagementOptions.startDate) &&
        Objects.equals(this.endDate, projectManagementOptions.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, timeUnit, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectManagementOptions {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

