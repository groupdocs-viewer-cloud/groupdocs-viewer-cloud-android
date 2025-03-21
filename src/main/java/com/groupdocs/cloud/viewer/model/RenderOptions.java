/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="RenderOptions.java">
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
import com.groupdocs.cloud.viewer.model.MailStorageOptions;
import com.groupdocs.cloud.viewer.model.OutlookOptions;
import com.groupdocs.cloud.viewer.model.PageRotation;
import com.groupdocs.cloud.viewer.model.PdfDocumentOptions;
import com.groupdocs.cloud.viewer.model.ProjectManagementOptions;
import com.groupdocs.cloud.viewer.model.SpreadsheetOptions;
import com.groupdocs.cloud.viewer.model.TextOptions;
import com.groupdocs.cloud.viewer.model.VisioRenderingOptions;
import com.groupdocs.cloud.viewer.model.WebDocumentOptions;
import com.groupdocs.cloud.viewer.model.WordProcessingOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Rendering options
 */
@ApiModel(description = "Rendering options")
public class RenderOptions {
  @SerializedName("startPageNumber")
  private Integer startPageNumber = null;

  @SerializedName("countPagesToRender")
  private Integer countPagesToRender = null;

  @SerializedName("pagesToRender")
  private List<Integer> pagesToRender = null;

  @SerializedName("pageRotations")
  private List<PageRotation> pageRotations = null;

  @SerializedName("defaultFontName")
  private String defaultFontName = null;

  @SerializedName("defaultEncoding")
  private String defaultEncoding = null;

  @SerializedName("detectEncoding")
  private Boolean detectEncoding = null;

  @SerializedName("renderComments")
  private Boolean renderComments = null;

  @SerializedName("renderNotes")
  private Boolean renderNotes = null;

  @SerializedName("renderHiddenPages")
  private Boolean renderHiddenPages = null;

  @SerializedName("spreadsheetOptions")
  private SpreadsheetOptions spreadsheetOptions = null;

  @SerializedName("cadOptions")
  private CadOptions cadOptions = null;

  @SerializedName("emailOptions")
  private EmailOptions emailOptions = null;

  @SerializedName("projectManagementOptions")
  private ProjectManagementOptions projectManagementOptions = null;

  @SerializedName("pdfDocumentOptions")
  private PdfDocumentOptions pdfDocumentOptions = null;

  @SerializedName("wordProcessingOptions")
  private WordProcessingOptions wordProcessingOptions = null;

  @SerializedName("outlookOptions")
  private OutlookOptions outlookOptions = null;

  @SerializedName("archiveOptions")
  private ArchiveOptions archiveOptions = null;

  @SerializedName("textOptions")
  private TextOptions textOptions = null;

  @SerializedName("mailStorageOptions")
  private MailStorageOptions mailStorageOptions = null;

  @SerializedName("visioRenderingOptions")
  private VisioRenderingOptions visioRenderingOptions = null;

  @SerializedName("webDocumentOptions")
  private WebDocumentOptions webDocumentOptions = null;

  public RenderOptions startPageNumber(Integer startPageNumber) {
    this.startPageNumber = startPageNumber;
    return this;
  }

   /**
   * Page number from which rendering should be started
   * @return startPageNumber
  **/
  @ApiModelProperty(required = true, value = "Page number from which rendering should be started")
  public Integer getStartPageNumber() {
    return startPageNumber;
  }

  public void setStartPageNumber(Integer startPageNumber) {
    this.startPageNumber = startPageNumber;
  }

  public RenderOptions countPagesToRender(Integer countPagesToRender) {
    this.countPagesToRender = countPagesToRender;
    return this;
  }

   /**
   * Count pages which should be rendered
   * @return countPagesToRender
  **/
  @ApiModelProperty(required = true, value = "Count pages which should be rendered")
  public Integer getCountPagesToRender() {
    return countPagesToRender;
  }

  public void setCountPagesToRender(Integer countPagesToRender) {
    this.countPagesToRender = countPagesToRender;
  }

  public RenderOptions pagesToRender(List<Integer> pagesToRender) {
    this.pagesToRender = pagesToRender;
    return this;
  }

  public RenderOptions addPagesToRenderItem(Integer pagesToRenderItem) {
    if (this.pagesToRender == null) {
      this.pagesToRender = new ArrayList<Integer>();
    }
    this.pagesToRender.add(pagesToRenderItem);
    return this;
  }

   /**
   * Pages list to render. Ignored, if StartPageNumber and CountPagesToRender are provided
   * @return pagesToRender
  **/
  @ApiModelProperty(value = "Pages list to render. Ignored, if StartPageNumber and CountPagesToRender are provided")
  public List<Integer> getPagesToRender() {
    return pagesToRender;
  }

  public void setPagesToRender(List<Integer> pagesToRender) {
    this.pagesToRender = pagesToRender;
  }

  public RenderOptions pageRotations(List<PageRotation> pageRotations) {
    this.pageRotations = pageRotations;
    return this;
  }

  public RenderOptions addPageRotationsItem(PageRotation pageRotationsItem) {
    if (this.pageRotations == null) {
      this.pageRotations = new ArrayList<PageRotation>();
    }
    this.pageRotations.add(pageRotationsItem);
    return this;
  }

   /**
   * Page rotations
   * @return pageRotations
  **/
  @ApiModelProperty(value = "Page rotations")
  public List<PageRotation> getPageRotations() {
    return pageRotations;
  }

  public void setPageRotations(List<PageRotation> pageRotations) {
    this.pageRotations = pageRotations;
  }

  public RenderOptions defaultFontName(String defaultFontName) {
    this.defaultFontName = defaultFontName;
    return this;
  }

   /**
   * Default font name may be specified in following cases: - You want to generally specify the default font to fall back on, if particular font   in the document cannot be found during rendering. - Your document uses fonts, that contain non-English characters and you want to make sure   any missing font is replaced with one that has the same character set available.
   * @return defaultFontName
  **/
  @ApiModelProperty(value = "Default font name may be specified in following cases: - You want to generally specify the default font to fall back on, if particular font   in the document cannot be found during rendering. - Your document uses fonts, that contain non-English characters and you want to make sure   any missing font is replaced with one that has the same character set available.")
  public String getDefaultFontName() {
    return defaultFontName;
  }

  public void setDefaultFontName(String defaultFontName) {
    this.defaultFontName = defaultFontName;
  }

  public RenderOptions defaultEncoding(String defaultEncoding) {
    this.defaultEncoding = defaultEncoding;
    return this;
  }

   /**
   * Default encoding for the plain text files such as .csv, .txt and .eml files when encoding is not specified in header
   * @return defaultEncoding
  **/
  @ApiModelProperty(value = "Default encoding for the plain text files such as .csv, .txt and .eml files when encoding is not specified in header")
  public String getDefaultEncoding() {
    return defaultEncoding;
  }

  public void setDefaultEncoding(String defaultEncoding) {
    this.defaultEncoding = defaultEncoding;
  }

  public RenderOptions detectEncoding(Boolean detectEncoding) {
    this.detectEncoding = detectEncoding;
    return this;
  }

   /**
   * This option enables TXT, TSV, and CSV files encoding detection. In case the encoding can&#39;t be detected the DefaultEncoding is used.
   * @return detectEncoding
  **/
  @ApiModelProperty(value = "This option enables TXT, TSV, and CSV files encoding detection. In case the encoding can't be detected the DefaultEncoding is used.")
  public Boolean getDetectEncoding() {
    return detectEncoding;
  }

  public void setDetectEncoding(Boolean detectEncoding) {
    this.detectEncoding = detectEncoding;
  }

  public RenderOptions renderComments(Boolean renderComments) {
    this.renderComments = renderComments;
    return this;
  }

   /**
   * When enabled comments will be rendered to the output
   * @return renderComments
  **/
  @ApiModelProperty(required = true, value = "When enabled comments will be rendered to the output")
  public Boolean getRenderComments() {
    return renderComments;
  }

  public void setRenderComments(Boolean renderComments) {
    this.renderComments = renderComments;
  }

  public RenderOptions renderNotes(Boolean renderNotes) {
    this.renderNotes = renderNotes;
    return this;
  }

   /**
   * When enabled notes will be rendered to the output
   * @return renderNotes
  **/
  @ApiModelProperty(required = true, value = "When enabled notes will be rendered to the output")
  public Boolean getRenderNotes() {
    return renderNotes;
  }

  public void setRenderNotes(Boolean renderNotes) {
    this.renderNotes = renderNotes;
  }

  public RenderOptions renderHiddenPages(Boolean renderHiddenPages) {
    this.renderHiddenPages = renderHiddenPages;
    return this;
  }

   /**
   * When enabled hidden pages, sheets or slides will be rendered to the output
   * @return renderHiddenPages
  **/
  @ApiModelProperty(required = true, value = "When enabled hidden pages, sheets or slides will be rendered to the output")
  public Boolean getRenderHiddenPages() {
    return renderHiddenPages;
  }

  public void setRenderHiddenPages(Boolean renderHiddenPages) {
    this.renderHiddenPages = renderHiddenPages;
  }

  public RenderOptions spreadsheetOptions(SpreadsheetOptions spreadsheetOptions) {
    this.spreadsheetOptions = spreadsheetOptions;
    return this;
  }

   /**
   * Rendering options for Spreadsheet source file formats Spreadsheet file formats include files with extensions: .xls, .xlsx, .xlsm, .xlsb, .csv, .ods, .ots, .xltx, .xltm, .tsv 
   * @return spreadsheetOptions
  **/
  @ApiModelProperty(value = "Rendering options for Spreadsheet source file formats Spreadsheet file formats include files with extensions: .xls, .xlsx, .xlsm, .xlsb, .csv, .ods, .ots, .xltx, .xltm, .tsv ")
  public SpreadsheetOptions getSpreadsheetOptions() {
    return spreadsheetOptions;
  }

  public void setSpreadsheetOptions(SpreadsheetOptions spreadsheetOptions) {
    this.spreadsheetOptions = spreadsheetOptions;
  }

  public RenderOptions cadOptions(CadOptions cadOptions) {
    this.cadOptions = cadOptions;
    return this;
  }

   /**
   * Rendering options for CAD source file formats CAD file formats include files with extensions: .dwg, .dxf, .dgn, .ifc, .stl
   * @return cadOptions
  **/
  @ApiModelProperty(value = "Rendering options for CAD source file formats CAD file formats include files with extensions: .dwg, .dxf, .dgn, .ifc, .stl")
  public CadOptions getCadOptions() {
    return cadOptions;
  }

  public void setCadOptions(CadOptions cadOptions) {
    this.cadOptions = cadOptions;
  }

  public RenderOptions emailOptions(EmailOptions emailOptions) {
    this.emailOptions = emailOptions;
    return this;
  }

   /**
   * Rendering options for Email source file formats Email file formats include files with extensions: .msg, .eml, .emlx, .ifc, .stl
   * @return emailOptions
  **/
  @ApiModelProperty(value = "Rendering options for Email source file formats Email file formats include files with extensions: .msg, .eml, .emlx, .ifc, .stl")
  public EmailOptions getEmailOptions() {
    return emailOptions;
  }

  public void setEmailOptions(EmailOptions emailOptions) {
    this.emailOptions = emailOptions;
  }

  public RenderOptions projectManagementOptions(ProjectManagementOptions projectManagementOptions) {
    this.projectManagementOptions = projectManagementOptions;
    return this;
  }

   /**
   * Rendering options for MS Project source file formats Project file formats include files with extensions: .mpt, .mpp
   * @return projectManagementOptions
  **/
  @ApiModelProperty(value = "Rendering options for MS Project source file formats Project file formats include files with extensions: .mpt, .mpp")
  public ProjectManagementOptions getProjectManagementOptions() {
    return projectManagementOptions;
  }

  public void setProjectManagementOptions(ProjectManagementOptions projectManagementOptions) {
    this.projectManagementOptions = projectManagementOptions;
  }

  public RenderOptions pdfDocumentOptions(PdfDocumentOptions pdfDocumentOptions) {
    this.pdfDocumentOptions = pdfDocumentOptions;
    return this;
  }

   /**
   * Rendering options for PDF source file formats
   * @return pdfDocumentOptions
  **/
  @ApiModelProperty(value = "Rendering options for PDF source file formats")
  public PdfDocumentOptions getPdfDocumentOptions() {
    return pdfDocumentOptions;
  }

  public void setPdfDocumentOptions(PdfDocumentOptions pdfDocumentOptions) {
    this.pdfDocumentOptions = pdfDocumentOptions;
  }

  public RenderOptions wordProcessingOptions(WordProcessingOptions wordProcessingOptions) {
    this.wordProcessingOptions = wordProcessingOptions;
    return this;
  }

   /**
   * Rendering options for WordProcessing source file formats
   * @return wordProcessingOptions
  **/
  @ApiModelProperty(value = "Rendering options for WordProcessing source file formats")
  public WordProcessingOptions getWordProcessingOptions() {
    return wordProcessingOptions;
  }

  public void setWordProcessingOptions(WordProcessingOptions wordProcessingOptions) {
    this.wordProcessingOptions = wordProcessingOptions;
  }

  public RenderOptions outlookOptions(OutlookOptions outlookOptions) {
    this.outlookOptions = outlookOptions;
    return this;
  }

   /**
   * Rendering options for Outlook source file formats
   * @return outlookOptions
  **/
  @ApiModelProperty(value = "Rendering options for Outlook source file formats")
  public OutlookOptions getOutlookOptions() {
    return outlookOptions;
  }

  public void setOutlookOptions(OutlookOptions outlookOptions) {
    this.outlookOptions = outlookOptions;
  }

  public RenderOptions archiveOptions(ArchiveOptions archiveOptions) {
    this.archiveOptions = archiveOptions;
    return this;
  }

   /**
   * Rendering options for Archive source file formats
   * @return archiveOptions
  **/
  @ApiModelProperty(value = "Rendering options for Archive source file formats")
  public ArchiveOptions getArchiveOptions() {
    return archiveOptions;
  }

  public void setArchiveOptions(ArchiveOptions archiveOptions) {
    this.archiveOptions = archiveOptions;
  }

  public RenderOptions textOptions(TextOptions textOptions) {
    this.textOptions = textOptions;
    return this;
  }

   /**
   * Rendering options for Text source file formats
   * @return textOptions
  **/
  @ApiModelProperty(value = "Rendering options for Text source file formats")
  public TextOptions getTextOptions() {
    return textOptions;
  }

  public void setTextOptions(TextOptions textOptions) {
    this.textOptions = textOptions;
  }

  public RenderOptions mailStorageOptions(MailStorageOptions mailStorageOptions) {
    this.mailStorageOptions = mailStorageOptions;
    return this;
  }

   /**
   * Rendering options for Mail storage (Lotus Notes, MBox) data files.
   * @return mailStorageOptions
  **/
  @ApiModelProperty(value = "Rendering options for Mail storage (Lotus Notes, MBox) data files.")
  public MailStorageOptions getMailStorageOptions() {
    return mailStorageOptions;
  }

  public void setMailStorageOptions(MailStorageOptions mailStorageOptions) {
    this.mailStorageOptions = mailStorageOptions;
  }

  public RenderOptions visioRenderingOptions(VisioRenderingOptions visioRenderingOptions) {
    this.visioRenderingOptions = visioRenderingOptions;
    return this;
  }

   /**
   * Rendering options for Visio source file formats
   * @return visioRenderingOptions
  **/
  @ApiModelProperty(value = "Rendering options for Visio source file formats")
  public VisioRenderingOptions getVisioRenderingOptions() {
    return visioRenderingOptions;
  }

  public void setVisioRenderingOptions(VisioRenderingOptions visioRenderingOptions) {
    this.visioRenderingOptions = visioRenderingOptions;
  }

  public RenderOptions webDocumentOptions(WebDocumentOptions webDocumentOptions) {
    this.webDocumentOptions = webDocumentOptions;
    return this;
  }

   /**
   * This rendering options enables you to customize the appearance of the output HTML/PDF/PNG/JPEG when rendering Web documents.
   * @return webDocumentOptions
  **/
  @ApiModelProperty(value = "This rendering options enables you to customize the appearance of the output HTML/PDF/PNG/JPEG when rendering Web documents.")
  public WebDocumentOptions getWebDocumentOptions() {
    return webDocumentOptions;
  }

  public void setWebDocumentOptions(WebDocumentOptions webDocumentOptions) {
    this.webDocumentOptions = webDocumentOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderOptions renderOptions = (RenderOptions) o;
    return Objects.equals(this.startPageNumber, renderOptions.startPageNumber) &&
        Objects.equals(this.countPagesToRender, renderOptions.countPagesToRender) &&
        Objects.equals(this.pagesToRender, renderOptions.pagesToRender) &&
        Objects.equals(this.pageRotations, renderOptions.pageRotations) &&
        Objects.equals(this.defaultFontName, renderOptions.defaultFontName) &&
        Objects.equals(this.defaultEncoding, renderOptions.defaultEncoding) &&
        Objects.equals(this.detectEncoding, renderOptions.detectEncoding) &&
        Objects.equals(this.renderComments, renderOptions.renderComments) &&
        Objects.equals(this.renderNotes, renderOptions.renderNotes) &&
        Objects.equals(this.renderHiddenPages, renderOptions.renderHiddenPages) &&
        Objects.equals(this.spreadsheetOptions, renderOptions.spreadsheetOptions) &&
        Objects.equals(this.cadOptions, renderOptions.cadOptions) &&
        Objects.equals(this.emailOptions, renderOptions.emailOptions) &&
        Objects.equals(this.projectManagementOptions, renderOptions.projectManagementOptions) &&
        Objects.equals(this.pdfDocumentOptions, renderOptions.pdfDocumentOptions) &&
        Objects.equals(this.wordProcessingOptions, renderOptions.wordProcessingOptions) &&
        Objects.equals(this.outlookOptions, renderOptions.outlookOptions) &&
        Objects.equals(this.archiveOptions, renderOptions.archiveOptions) &&
        Objects.equals(this.textOptions, renderOptions.textOptions) &&
        Objects.equals(this.mailStorageOptions, renderOptions.mailStorageOptions) &&
        Objects.equals(this.visioRenderingOptions, renderOptions.visioRenderingOptions) &&
        Objects.equals(this.webDocumentOptions, renderOptions.webDocumentOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startPageNumber, countPagesToRender, pagesToRender, pageRotations, defaultFontName, defaultEncoding, detectEncoding, renderComments, renderNotes, renderHiddenPages, spreadsheetOptions, cadOptions, emailOptions, projectManagementOptions, pdfDocumentOptions, wordProcessingOptions, outlookOptions, archiveOptions, textOptions, mailStorageOptions, visioRenderingOptions, webDocumentOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderOptions {\n");
    
    sb.append("    startPageNumber: ").append(toIndentedString(startPageNumber)).append("\n");
    sb.append("    countPagesToRender: ").append(toIndentedString(countPagesToRender)).append("\n");
    sb.append("    pagesToRender: ").append(toIndentedString(pagesToRender)).append("\n");
    sb.append("    pageRotations: ").append(toIndentedString(pageRotations)).append("\n");
    sb.append("    defaultFontName: ").append(toIndentedString(defaultFontName)).append("\n");
    sb.append("    defaultEncoding: ").append(toIndentedString(defaultEncoding)).append("\n");
    sb.append("    detectEncoding: ").append(toIndentedString(detectEncoding)).append("\n");
    sb.append("    renderComments: ").append(toIndentedString(renderComments)).append("\n");
    sb.append("    renderNotes: ").append(toIndentedString(renderNotes)).append("\n");
    sb.append("    renderHiddenPages: ").append(toIndentedString(renderHiddenPages)).append("\n");
    sb.append("    spreadsheetOptions: ").append(toIndentedString(spreadsheetOptions)).append("\n");
    sb.append("    cadOptions: ").append(toIndentedString(cadOptions)).append("\n");
    sb.append("    emailOptions: ").append(toIndentedString(emailOptions)).append("\n");
    sb.append("    projectManagementOptions: ").append(toIndentedString(projectManagementOptions)).append("\n");
    sb.append("    pdfDocumentOptions: ").append(toIndentedString(pdfDocumentOptions)).append("\n");
    sb.append("    wordProcessingOptions: ").append(toIndentedString(wordProcessingOptions)).append("\n");
    sb.append("    outlookOptions: ").append(toIndentedString(outlookOptions)).append("\n");
    sb.append("    archiveOptions: ").append(toIndentedString(archiveOptions)).append("\n");
    sb.append("    textOptions: ").append(toIndentedString(textOptions)).append("\n");
    sb.append("    mailStorageOptions: ").append(toIndentedString(mailStorageOptions)).append("\n");
    sb.append("    visioRenderingOptions: ").append(toIndentedString(visioRenderingOptions)).append("\n");
    sb.append("    webDocumentOptions: ").append(toIndentedString(webDocumentOptions)).append("\n");
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

