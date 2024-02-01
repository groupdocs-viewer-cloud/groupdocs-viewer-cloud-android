/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SpreadsheetOptions.java">
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
 * Rendering options for Spreadsheet file formats. Spreadsheet file formats include files with extensions: .xls, .xlsx, .xlsm, .xlsb, .csv, .ods, .ots, .xltx, .xltm, .tsv 
 */
@ApiModel(description = "Rendering options for Spreadsheet file formats. Spreadsheet file formats include files with extensions: .xls, .xlsx, .xlsm, .xlsb, .csv, .ods, .ots, .xltx, .xltm, .tsv ")
public class SpreadsheetOptions {
  @SerializedName("paginateSheets")
  private Boolean paginateSheets = null;

  @SerializedName("countRowsPerPage")
  private Integer countRowsPerPage = null;

  @SerializedName("countColumnsPerPage")
  private Integer countColumnsPerPage = null;

  @SerializedName("renderGridLines")
  private Boolean renderGridLines = null;

  @SerializedName("renderEmptyRows")
  private Boolean renderEmptyRows = null;

  @SerializedName("renderEmptyColumns")
  private Boolean renderEmptyColumns = null;

  @SerializedName("renderHiddenRows")
  private Boolean renderHiddenRows = null;

  @SerializedName("renderHiddenColumns")
  private Boolean renderHiddenColumns = null;

  @SerializedName("renderHeadings")
  private Boolean renderHeadings = null;

  @SerializedName("renderPrintAreaOnly")
  private Boolean renderPrintAreaOnly = null;

  /**
   * The text overflow mode for rendering spreadsheet documents into HTML
   */
  @JsonAdapter(TextOverflowModeEnum.Adapter.class)
  public enum TextOverflowModeEnum {
    OVERLAY("Overlay"),
    
    OVERLAYIFNEXTISEMPTY("OverlayIfNextIsEmpty"),
    
    AUTOFITCOLUMN("AutoFitColumn"),
    
    HIDETEXT("HideText");

    private String value;

    TextOverflowModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextOverflowModeEnum fromValue(String text) {
      for (TextOverflowModeEnum b : TextOverflowModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextOverflowModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextOverflowModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextOverflowModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextOverflowModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("textOverflowMode")
  private TextOverflowModeEnum textOverflowMode = null;

  public SpreadsheetOptions paginateSheets(Boolean paginateSheets) {
    this.paginateSheets = paginateSheets;
    return this;
  }

   /**
   * Allows to enable worksheets pagination. By default one worksheet is rendered into one page.
   * @return paginateSheets
  **/
  @ApiModelProperty(required = true, value = "Allows to enable worksheets pagination. By default one worksheet is rendered into one page.")
  public Boolean getPaginateSheets() {
    return paginateSheets;
  }

  public void setPaginateSheets(Boolean paginateSheets) {
    this.paginateSheets = paginateSheets;
  }

  public SpreadsheetOptions countRowsPerPage(Integer countRowsPerPage) {
    this.countRowsPerPage = countRowsPerPage;
    return this;
  }

   /**
   * The number of rows rendered into one page when PaginateSheets is enabled. Default value is 50.
   * @return countRowsPerPage
  **/
  @ApiModelProperty(required = true, value = "The number of rows rendered into one page when PaginateSheets is enabled. Default value is 50.")
  public Integer getCountRowsPerPage() {
    return countRowsPerPage;
  }

  public void setCountRowsPerPage(Integer countRowsPerPage) {
    this.countRowsPerPage = countRowsPerPage;
  }

  public SpreadsheetOptions countColumnsPerPage(Integer countColumnsPerPage) {
    this.countColumnsPerPage = countColumnsPerPage;
    return this;
  }

   /**
   * The columns count to include into each page when splitting worksheet into pages.
   * @return countColumnsPerPage
  **/
  @ApiModelProperty(required = true, value = "The columns count to include into each page when splitting worksheet into pages.")
  public Integer getCountColumnsPerPage() {
    return countColumnsPerPage;
  }

  public void setCountColumnsPerPage(Integer countColumnsPerPage) {
    this.countColumnsPerPage = countColumnsPerPage;
  }

  public SpreadsheetOptions renderGridLines(Boolean renderGridLines) {
    this.renderGridLines = renderGridLines;
    return this;
  }

   /**
   * Indicates whether to render grid lines
   * @return renderGridLines
  **/
  @ApiModelProperty(required = true, value = "Indicates whether to render grid lines")
  public Boolean getRenderGridLines() {
    return renderGridLines;
  }

  public void setRenderGridLines(Boolean renderGridLines) {
    this.renderGridLines = renderGridLines;
  }

  public SpreadsheetOptions renderEmptyRows(Boolean renderEmptyRows) {
    this.renderEmptyRows = renderEmptyRows;
    return this;
  }

   /**
   * By default empty rows are skipped. Enable this option in case you want to render empty rows.
   * @return renderEmptyRows
  **/
  @ApiModelProperty(required = true, value = "By default empty rows are skipped. Enable this option in case you want to render empty rows.")
  public Boolean getRenderEmptyRows() {
    return renderEmptyRows;
  }

  public void setRenderEmptyRows(Boolean renderEmptyRows) {
    this.renderEmptyRows = renderEmptyRows;
  }

  public SpreadsheetOptions renderEmptyColumns(Boolean renderEmptyColumns) {
    this.renderEmptyColumns = renderEmptyColumns;
    return this;
  }

   /**
   * By default empty columns are skipped. Enable this option in case you want to render empty columns.
   * @return renderEmptyColumns
  **/
  @ApiModelProperty(required = true, value = "By default empty columns are skipped. Enable this option in case you want to render empty columns.")
  public Boolean getRenderEmptyColumns() {
    return renderEmptyColumns;
  }

  public void setRenderEmptyColumns(Boolean renderEmptyColumns) {
    this.renderEmptyColumns = renderEmptyColumns;
  }

  public SpreadsheetOptions renderHiddenRows(Boolean renderHiddenRows) {
    this.renderHiddenRows = renderHiddenRows;
    return this;
  }

   /**
   * Enables rendering of hidden rows.
   * @return renderHiddenRows
  **/
  @ApiModelProperty(required = true, value = "Enables rendering of hidden rows.")
  public Boolean getRenderHiddenRows() {
    return renderHiddenRows;
  }

  public void setRenderHiddenRows(Boolean renderHiddenRows) {
    this.renderHiddenRows = renderHiddenRows;
  }

  public SpreadsheetOptions renderHiddenColumns(Boolean renderHiddenColumns) {
    this.renderHiddenColumns = renderHiddenColumns;
    return this;
  }

   /**
   * Enables rendering of hidden columns.
   * @return renderHiddenColumns
  **/
  @ApiModelProperty(required = true, value = "Enables rendering of hidden columns.")
  public Boolean getRenderHiddenColumns() {
    return renderHiddenColumns;
  }

  public void setRenderHiddenColumns(Boolean renderHiddenColumns) {
    this.renderHiddenColumns = renderHiddenColumns;
  }

  public SpreadsheetOptions renderHeadings(Boolean renderHeadings) {
    this.renderHeadings = renderHeadings;
    return this;
  }

   /**
   * Enables headings rendering.
   * @return renderHeadings
  **/
  @ApiModelProperty(required = true, value = "Enables headings rendering.")
  public Boolean getRenderHeadings() {
    return renderHeadings;
  }

  public void setRenderHeadings(Boolean renderHeadings) {
    this.renderHeadings = renderHeadings;
  }

  public SpreadsheetOptions renderPrintAreaOnly(Boolean renderPrintAreaOnly) {
    this.renderPrintAreaOnly = renderPrintAreaOnly;
    return this;
  }

   /**
   * Enables rendering worksheet(s) sections which is defined as print area. Renders each print area in a worksheet as a separate page.
   * @return renderPrintAreaOnly
  **/
  @ApiModelProperty(required = true, value = "Enables rendering worksheet(s) sections which is defined as print area. Renders each print area in a worksheet as a separate page.")
  public Boolean getRenderPrintAreaOnly() {
    return renderPrintAreaOnly;
  }

  public void setRenderPrintAreaOnly(Boolean renderPrintAreaOnly) {
    this.renderPrintAreaOnly = renderPrintAreaOnly;
  }

  public SpreadsheetOptions textOverflowMode(TextOverflowModeEnum textOverflowMode) {
    this.textOverflowMode = textOverflowMode;
    return this;
  }

   /**
   * The text overflow mode for rendering spreadsheet documents into HTML
   * @return textOverflowMode
  **/
  @ApiModelProperty(required = true, value = "The text overflow mode for rendering spreadsheet documents into HTML")
  public TextOverflowModeEnum getTextOverflowMode() {
    return textOverflowMode;
  }

  public void setTextOverflowMode(TextOverflowModeEnum textOverflowMode) {
    this.textOverflowMode = textOverflowMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpreadsheetOptions spreadsheetOptions = (SpreadsheetOptions) o;
    return Objects.equals(this.paginateSheets, spreadsheetOptions.paginateSheets) &&
        Objects.equals(this.countRowsPerPage, spreadsheetOptions.countRowsPerPage) &&
        Objects.equals(this.countColumnsPerPage, spreadsheetOptions.countColumnsPerPage) &&
        Objects.equals(this.renderGridLines, spreadsheetOptions.renderGridLines) &&
        Objects.equals(this.renderEmptyRows, spreadsheetOptions.renderEmptyRows) &&
        Objects.equals(this.renderEmptyColumns, spreadsheetOptions.renderEmptyColumns) &&
        Objects.equals(this.renderHiddenRows, spreadsheetOptions.renderHiddenRows) &&
        Objects.equals(this.renderHiddenColumns, spreadsheetOptions.renderHiddenColumns) &&
        Objects.equals(this.renderHeadings, spreadsheetOptions.renderHeadings) &&
        Objects.equals(this.renderPrintAreaOnly, spreadsheetOptions.renderPrintAreaOnly) &&
        Objects.equals(this.textOverflowMode, spreadsheetOptions.textOverflowMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paginateSheets, countRowsPerPage, countColumnsPerPage, renderGridLines, renderEmptyRows, renderEmptyColumns, renderHiddenRows, renderHiddenColumns, renderHeadings, renderPrintAreaOnly, textOverflowMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpreadsheetOptions {\n");
    
    sb.append("    paginateSheets: ").append(toIndentedString(paginateSheets)).append("\n");
    sb.append("    countRowsPerPage: ").append(toIndentedString(countRowsPerPage)).append("\n");
    sb.append("    countColumnsPerPage: ").append(toIndentedString(countColumnsPerPage)).append("\n");
    sb.append("    renderGridLines: ").append(toIndentedString(renderGridLines)).append("\n");
    sb.append("    renderEmptyRows: ").append(toIndentedString(renderEmptyRows)).append("\n");
    sb.append("    renderEmptyColumns: ").append(toIndentedString(renderEmptyColumns)).append("\n");
    sb.append("    renderHiddenRows: ").append(toIndentedString(renderHiddenRows)).append("\n");
    sb.append("    renderHiddenColumns: ").append(toIndentedString(renderHiddenColumns)).append("\n");
    sb.append("    renderHeadings: ").append(toIndentedString(renderHeadings)).append("\n");
    sb.append("    renderPrintAreaOnly: ").append(toIndentedString(renderPrintAreaOnly)).append("\n");
    sb.append("    textOverflowMode: ").append(toIndentedString(textOverflowMode)).append("\n");
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

