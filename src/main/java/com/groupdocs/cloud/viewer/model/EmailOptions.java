/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="EmailOptions.java">
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
import com.groupdocs.cloud.viewer.model.FieldLabel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Rendering options for Email file formats. Email file formats include files with extensions: .msg, .eml, .emlx, .ifc, .stl
 */
@ApiModel(description = "Rendering options for Email file formats. Email file formats include files with extensions: .msg, .eml, .emlx, .ifc, .stl")
public class EmailOptions {
  /**
   * The size of the output page when rendering as PDF or image.
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

  @SerializedName("fieldLabels")
  private List<FieldLabel> fieldLabels = null;

  @SerializedName("dateTimeFormat")
  private String dateTimeFormat = null;

  @SerializedName("timeZoneOffset")
  private String timeZoneOffset = null;

  public EmailOptions pageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The size of the output page when rendering as PDF or image.
   * @return pageSize
  **/
  @ApiModelProperty(required = true, value = "The size of the output page when rendering as PDF or image.")
  public PageSizeEnum getPageSize() {
    return pageSize;
  }

  public void setPageSize(PageSizeEnum pageSize) {
    this.pageSize = pageSize;
  }

  public EmailOptions fieldLabels(List<FieldLabel> fieldLabels) {
    this.fieldLabels = fieldLabels;
    return this;
  }

  public EmailOptions addFieldLabelsItem(FieldLabel fieldLabelsItem) {
    if (this.fieldLabels == null) {
      this.fieldLabels = new ArrayList<FieldLabel>();
    }
    this.fieldLabels.add(fieldLabelsItem);
    return this;
  }

   /**
   * The list of supported email message field labels: 1. Field: \&quot;Anniversary\&quot; - default label is \&quot;Anniversary\&quot;. 2. Field: \&quot;Attachments\&quot; - default label is \&quot;Attachments\&quot;. 3. Field: \&quot;Bcc\&quot; - default label is \&quot;Bcc\&quot;. 4. Field: \&quot;Birthday\&quot; - default label is \&quot;Birthday\&quot;. 5. Field: \&quot;Business\&quot; - default label is \&quot;Business\&quot;. 6. Field: \&quot;BusinessAddress\&quot; - default label is \&quot;Business Address\&quot;. 7. Field: \&quot;BusinessFax\&quot; - default label is \&quot;Business Fax\&quot;. 8. Field: \&quot;BusinessHomepage\&quot; - default label is \&quot;BusinessHomePage\&quot;. 9. Field: \&quot;Cc\&quot; - default label is \&quot;Cc\&quot;. 10. Field: \&quot;Company\&quot; - default label is \&quot;Company\&quot;. 11. Field: \&quot;Department\&quot; - default label is \&quot;Department\&quot;. 12. Field: \&quot;Email\&quot; - default label is \&quot;Email\&quot;. 13. Field: \&quot;EmailDisplayAs\&quot; - default label is \&quot;Email Display As\&quot;. 14. Field: \&quot;Email2\&quot; - default label is \&quot;Email2\&quot;. 15. Field: \&quot;Email2DisplayAs\&quot; - default label is \&quot;Email2 Display As\&quot;. 16. Field: \&quot;Email3\&quot; - default label is \&quot;Email3\&quot;. 17. Field: \&quot;Email3DisplayAs\&quot; - default label is \&quot;Email3 Display As\&quot;. 18. Field: \&quot;End\&quot; - default label is \&quot;End\&quot;. 19. Field: \&quot;FirstName\&quot; - default label is \&quot;First Name\&quot;. 20. Field: \&quot;From\&quot; - default label is \&quot;From\&quot;. 21. Field: \&quot;FullName\&quot; - default label is \&quot;Full Name\&quot;. 22. Field: \&quot;Gender\&quot; - default label is \&quot;Gender\&quot;. 23. Field: \&quot;Hobbies\&quot; - default label is \&quot;Hobbies\&quot;. 24. Field: \&quot;Home\&quot; - default label is \&quot;Home\&quot;. 25. Field: \&quot;HomeAddress\&quot; - default label is \&quot;Home Address\&quot;. 26. Field: \&quot;Importance\&quot; - default label is \&quot;Importance\&quot;. 27. Field: \&quot;JobTitle\&quot; - default label is \&quot;Job Title\&quot;. 28. Field: \&quot;LastName\&quot; - default label is \&quot;Last Name\&quot;. 29. Field: \&quot;Location\&quot; - default label is \&quot;Location\&quot;. 30. Field: \&quot;MiddleName\&quot; - default label is \&quot;Middle Name\&quot;. 31. Field: \&quot;Mobile\&quot; - default label is \&quot;Mobile\&quot;. 32. Field: \&quot;Organizer\&quot; - default label is \&quot;Organizer\&quot;. 33. Field: \&quot;OtherAddress\&quot; - default label is \&quot;Other Address\&quot;. 34. Field: \&quot;PersonalHomepage\&quot; - default label is \&quot;PersonalHomePage\&quot;. 35. Field: \&quot;Profession\&quot; - default label is \&quot;Profession\&quot;. 36. Field: \&quot;Recurrence\&quot; - default label is \&quot;Recurrence\&quot;. 37. Field: \&quot;RecurrencePattern\&quot; - default label is \&quot;Recurrence Pattern\&quot;. 38. Field: \&quot;RequiredAttendees\&quot; - default label is \&quot;Required Attendees\&quot;. 39. Field: \&quot;Sent\&quot; - default label is \&quot;Sent\&quot;. 40. Field: \&quot;ShowTimeAs\&quot; - default label is \&quot;Show Time As\&quot;. 41. Field: \&quot;SpousePartner\&quot; - default label is \&quot;Spouse/Partner\&quot;. 42. Field: \&quot;Start\&quot; - default label is \&quot;Start\&quot;. 43. Field: \&quot;Subject\&quot; - default label is \&quot;Subject\&quot;. 44. Field: \&quot;To\&quot; - default label is \&quot;To\&quot;. 45. Field: \&quot;UserField1\&quot; - default label is \&quot;User Field 1\&quot;. 46. Field: \&quot;UserField2\&quot; - default label is \&quot;User Field 2\&quot;. 47. Field: \&quot;UserField3\&quot; - default label is \&quot;User Field 3\&quot;. 48. Field: \&quot;UserField4\&quot; - default label is \&quot;User Field 4\&quot;.
   * @return fieldLabels
  **/
  @ApiModelProperty(value = "The list of supported email message field labels: 1. Field: \"Anniversary\" - default label is \"Anniversary\". 2. Field: \"Attachments\" - default label is \"Attachments\". 3. Field: \"Bcc\" - default label is \"Bcc\". 4. Field: \"Birthday\" - default label is \"Birthday\". 5. Field: \"Business\" - default label is \"Business\". 6. Field: \"BusinessAddress\" - default label is \"Business Address\". 7. Field: \"BusinessFax\" - default label is \"Business Fax\". 8. Field: \"BusinessHomepage\" - default label is \"BusinessHomePage\". 9. Field: \"Cc\" - default label is \"Cc\". 10. Field: \"Company\" - default label is \"Company\". 11. Field: \"Department\" - default label is \"Department\". 12. Field: \"Email\" - default label is \"Email\". 13. Field: \"EmailDisplayAs\" - default label is \"Email Display As\". 14. Field: \"Email2\" - default label is \"Email2\". 15. Field: \"Email2DisplayAs\" - default label is \"Email2 Display As\". 16. Field: \"Email3\" - default label is \"Email3\". 17. Field: \"Email3DisplayAs\" - default label is \"Email3 Display As\". 18. Field: \"End\" - default label is \"End\". 19. Field: \"FirstName\" - default label is \"First Name\". 20. Field: \"From\" - default label is \"From\". 21. Field: \"FullName\" - default label is \"Full Name\". 22. Field: \"Gender\" - default label is \"Gender\". 23. Field: \"Hobbies\" - default label is \"Hobbies\". 24. Field: \"Home\" - default label is \"Home\". 25. Field: \"HomeAddress\" - default label is \"Home Address\". 26. Field: \"Importance\" - default label is \"Importance\". 27. Field: \"JobTitle\" - default label is \"Job Title\". 28. Field: \"LastName\" - default label is \"Last Name\". 29. Field: \"Location\" - default label is \"Location\". 30. Field: \"MiddleName\" - default label is \"Middle Name\". 31. Field: \"Mobile\" - default label is \"Mobile\". 32. Field: \"Organizer\" - default label is \"Organizer\". 33. Field: \"OtherAddress\" - default label is \"Other Address\". 34. Field: \"PersonalHomepage\" - default label is \"PersonalHomePage\". 35. Field: \"Profession\" - default label is \"Profession\". 36. Field: \"Recurrence\" - default label is \"Recurrence\". 37. Field: \"RecurrencePattern\" - default label is \"Recurrence Pattern\". 38. Field: \"RequiredAttendees\" - default label is \"Required Attendees\". 39. Field: \"Sent\" - default label is \"Sent\". 40. Field: \"ShowTimeAs\" - default label is \"Show Time As\". 41. Field: \"SpousePartner\" - default label is \"Spouse/Partner\". 42. Field: \"Start\" - default label is \"Start\". 43. Field: \"Subject\" - default label is \"Subject\". 44. Field: \"To\" - default label is \"To\". 45. Field: \"UserField1\" - default label is \"User Field 1\". 46. Field: \"UserField2\" - default label is \"User Field 2\". 47. Field: \"UserField3\" - default label is \"User Field 3\". 48. Field: \"UserField4\" - default label is \"User Field 4\".")
  public List<FieldLabel> getFieldLabels() {
    return fieldLabels;
  }

  public void setFieldLabels(List<FieldLabel> fieldLabels) {
    this.fieldLabels = fieldLabels;
  }

  public EmailOptions dateTimeFormat(String dateTimeFormat) {
    this.dateTimeFormat = dateTimeFormat;
    return this;
  }

   /**
   * Time Format (can be include TimeZone) for example: &#39;MM d yyyy HH:mm tt&#39;, if not set - current system format is used
   * @return dateTimeFormat
  **/
  @ApiModelProperty(value = "Time Format (can be include TimeZone) for example: 'MM d yyyy HH:mm tt', if not set - current system format is used")
  public String getDateTimeFormat() {
    return dateTimeFormat;
  }

  public void setDateTimeFormat(String dateTimeFormat) {
    this.dateTimeFormat = dateTimeFormat;
  }

  public EmailOptions timeZoneOffset(String timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
    return this;
  }

   /**
   * Message time zone offset. Format should be compatible with .net TimeSpan
   * @return timeZoneOffset
  **/
  @ApiModelProperty(value = "Message time zone offset. Format should be compatible with .net TimeSpan")
  public String getTimeZoneOffset() {
    return timeZoneOffset;
  }

  public void setTimeZoneOffset(String timeZoneOffset) {
    this.timeZoneOffset = timeZoneOffset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailOptions emailOptions = (EmailOptions) o;
    return Objects.equals(this.pageSize, emailOptions.pageSize) &&
        Objects.equals(this.fieldLabels, emailOptions.fieldLabels) &&
        Objects.equals(this.dateTimeFormat, emailOptions.dateTimeFormat) &&
        Objects.equals(this.timeZoneOffset, emailOptions.timeZoneOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, fieldLabels, dateTimeFormat, timeZoneOffset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailOptions {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    fieldLabels: ").append(toIndentedString(fieldLabels)).append("\n");
    sb.append("    dateTimeFormat: ").append(toIndentedString(dateTimeFormat)).append("\n");
    sb.append("    timeZoneOffset: ").append(toIndentedString(timeZoneOffset)).append("\n");
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

