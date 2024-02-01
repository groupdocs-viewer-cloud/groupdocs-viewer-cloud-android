/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfOptimizationOptions.java">
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
 * Contains the PDF optimization options to apply to the output PDF file.
 */
@ApiModel(description = "Contains the PDF optimization options to apply to the output PDF file.")
public class PdfOptimizationOptions {
  @SerializedName("lineriaze")
  private Boolean lineriaze = null;

  @SerializedName("removeAnnotations")
  private Boolean removeAnnotations = null;

  @SerializedName("removeFormFields")
  private Boolean removeFormFields = null;

  @SerializedName("convertToGrayScale")
  private Boolean convertToGrayScale = null;

  @SerializedName("subsetFonts")
  private Boolean subsetFonts = null;

  @SerializedName("compressImages")
  private Boolean compressImages = null;

  @SerializedName("imageQuality")
  private Integer imageQuality = null;

  @SerializedName("resizeImages")
  private Boolean resizeImages = null;

  @SerializedName("maxResolution")
  private Integer maxResolution = null;

  @SerializedName("optimizeSpreadsheets")
  private Boolean optimizeSpreadsheets = null;

  public PdfOptimizationOptions lineriaze(Boolean lineriaze) {
    this.lineriaze = lineriaze;
    return this;
  }

   /**
   * Enables optimization the output PDF file for viewing online with a web browser. This optimization allows a browser to display the first pages of a PDF file when     you open the document, instead of waiting for the entire file to download.
   * @return lineriaze
  **/
  @ApiModelProperty(required = true, value = "Enables optimization the output PDF file for viewing online with a web browser. This optimization allows a browser to display the first pages of a PDF file when     you open the document, instead of waiting for the entire file to download.")
  public Boolean getLineriaze() {
    return lineriaze;
  }

  public void setLineriaze(Boolean lineriaze) {
    this.lineriaze = lineriaze;
  }

  public PdfOptimizationOptions removeAnnotations(Boolean removeAnnotations) {
    this.removeAnnotations = removeAnnotations;
    return this;
  }

   /**
   * Enables removing annotation from the output PDF file.
   * @return removeAnnotations
  **/
  @ApiModelProperty(required = true, value = "Enables removing annotation from the output PDF file.")
  public Boolean getRemoveAnnotations() {
    return removeAnnotations;
  }

  public void setRemoveAnnotations(Boolean removeAnnotations) {
    this.removeAnnotations = removeAnnotations;
  }

  public PdfOptimizationOptions removeFormFields(Boolean removeFormFields) {
    this.removeFormFields = removeFormFields;
    return this;
  }

   /**
   * Enables removing form fields from a PDF file.
   * @return removeFormFields
  **/
  @ApiModelProperty(required = true, value = "Enables removing form fields from a PDF file.")
  public Boolean getRemoveFormFields() {
    return removeFormFields;
  }

  public void setRemoveFormFields(Boolean removeFormFields) {
    this.removeFormFields = removeFormFields;
  }

  public PdfOptimizationOptions convertToGrayScale(Boolean convertToGrayScale) {
    this.convertToGrayScale = convertToGrayScale;
    return this;
  }

   /**
   * Enables converting the output PDF file to a grayscale.
   * @return convertToGrayScale
  **/
  @ApiModelProperty(required = true, value = "Enables converting the output PDF file to a grayscale.")
  public Boolean getConvertToGrayScale() {
    return convertToGrayScale;
  }

  public void setConvertToGrayScale(Boolean convertToGrayScale) {
    this.convertToGrayScale = convertToGrayScale;
  }

  public PdfOptimizationOptions subsetFonts(Boolean subsetFonts) {
    this.subsetFonts = subsetFonts;
    return this;
  }

   /**
   * Subsets fonts in the output PDF file. If the file uses embedded fonts, it contains all font data. GroupDocs.Viewer can subset embedded fonts to reduce the file size.
   * @return subsetFonts
  **/
  @ApiModelProperty(required = true, value = "Subsets fonts in the output PDF file. If the file uses embedded fonts, it contains all font data. GroupDocs.Viewer can subset embedded fonts to reduce the file size.")
  public Boolean getSubsetFonts() {
    return subsetFonts;
  }

  public void setSubsetFonts(Boolean subsetFonts) {
    this.subsetFonts = subsetFonts;
  }

  public PdfOptimizationOptions compressImages(Boolean compressImages) {
    this.compressImages = compressImages;
    return this;
  }

   /**
   * Enables compressing images in the output PDF file. Use this option to allow other compressing options: PdfOptimizationOptions.ImageQuality and PdfOptimizationOptions.MaxResolution.
   * @return compressImages
  **/
  @ApiModelProperty(required = true, value = "Enables compressing images in the output PDF file. Use this option to allow other compressing options: PdfOptimizationOptions.ImageQuality and PdfOptimizationOptions.MaxResolution.")
  public Boolean getCompressImages() {
    return compressImages;
  }

  public void setCompressImages(Boolean compressImages) {
    this.compressImages = compressImages;
  }

  public PdfOptimizationOptions imageQuality(Integer imageQuality) {
    this.imageQuality = imageQuality;
    return this;
  }

   /**
   * Sets the image quality in the output PDF file (in percent). To change the image quality, first set the PdfOptimizationOptions.CompressImages property to true.
   * @return imageQuality
  **/
  @ApiModelProperty(required = true, value = "Sets the image quality in the output PDF file (in percent). To change the image quality, first set the PdfOptimizationOptions.CompressImages property to true.")
  public Integer getImageQuality() {
    return imageQuality;
  }

  public void setImageQuality(Integer imageQuality) {
    this.imageQuality = imageQuality;
  }

  public PdfOptimizationOptions resizeImages(Boolean resizeImages) {
    this.resizeImages = resizeImages;
    return this;
  }

   /**
   * Enables setting the maximum resolution in the output PDF file. To allow this option, set the GroupDocs.Viewer.Options.PdfOptimizationOptions.CompressImages property to true. This option allows setting the GroupDocs.Viewer.Options.PdfOptimizationOptions.MaxResolution property.
   * @return resizeImages
  **/
  @ApiModelProperty(required = true, value = "Enables setting the maximum resolution in the output PDF file. To allow this option, set the GroupDocs.Viewer.Options.PdfOptimizationOptions.CompressImages property to true. This option allows setting the GroupDocs.Viewer.Options.PdfOptimizationOptions.MaxResolution property.")
  public Boolean getResizeImages() {
    return resizeImages;
  }

  public void setResizeImages(Boolean resizeImages) {
    this.resizeImages = resizeImages;
  }

  public PdfOptimizationOptions maxResolution(Integer maxResolution) {
    this.maxResolution = maxResolution;
    return this;
  }

   /**
   * Sets the maximum resolution in the output PDF file. To allow this option, set the GroupDocs.Viewer.Options.PdfOptimizationOptions.CompressImages and GroupDocs.Viewer.Options.PdfOptimizationOptions.MaxResolution properties to true. The default value is 300.
   * @return maxResolution
  **/
  @ApiModelProperty(required = true, value = "Sets the maximum resolution in the output PDF file. To allow this option, set the GroupDocs.Viewer.Options.PdfOptimizationOptions.CompressImages and GroupDocs.Viewer.Options.PdfOptimizationOptions.MaxResolution properties to true. The default value is 300.")
  public Integer getMaxResolution() {
    return maxResolution;
  }

  public void setMaxResolution(Integer maxResolution) {
    this.maxResolution = maxResolution;
  }

  public PdfOptimizationOptions optimizeSpreadsheets(Boolean optimizeSpreadsheets) {
    this.optimizeSpreadsheets = optimizeSpreadsheets;
    return this;
  }

   /**
   * Enables optimization of spreadsheets in the PDF files. This optimization allows to reduce the output file size by setting up border lines. Besides that, it removes the Arial and Times New Roman characters of 32-127 codes.
   * @return optimizeSpreadsheets
  **/
  @ApiModelProperty(required = true, value = "Enables optimization of spreadsheets in the PDF files. This optimization allows to reduce the output file size by setting up border lines. Besides that, it removes the Arial and Times New Roman characters of 32-127 codes.")
  public Boolean getOptimizeSpreadsheets() {
    return optimizeSpreadsheets;
  }

  public void setOptimizeSpreadsheets(Boolean optimizeSpreadsheets) {
    this.optimizeSpreadsheets = optimizeSpreadsheets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfOptimizationOptions pdfOptimizationOptions = (PdfOptimizationOptions) o;
    return Objects.equals(this.lineriaze, pdfOptimizationOptions.lineriaze) &&
        Objects.equals(this.removeAnnotations, pdfOptimizationOptions.removeAnnotations) &&
        Objects.equals(this.removeFormFields, pdfOptimizationOptions.removeFormFields) &&
        Objects.equals(this.convertToGrayScale, pdfOptimizationOptions.convertToGrayScale) &&
        Objects.equals(this.subsetFonts, pdfOptimizationOptions.subsetFonts) &&
        Objects.equals(this.compressImages, pdfOptimizationOptions.compressImages) &&
        Objects.equals(this.imageQuality, pdfOptimizationOptions.imageQuality) &&
        Objects.equals(this.resizeImages, pdfOptimizationOptions.resizeImages) &&
        Objects.equals(this.maxResolution, pdfOptimizationOptions.maxResolution) &&
        Objects.equals(this.optimizeSpreadsheets, pdfOptimizationOptions.optimizeSpreadsheets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineriaze, removeAnnotations, removeFormFields, convertToGrayScale, subsetFonts, compressImages, imageQuality, resizeImages, maxResolution, optimizeSpreadsheets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfOptimizationOptions {\n");
    
    sb.append("    lineriaze: ").append(toIndentedString(lineriaze)).append("\n");
    sb.append("    removeAnnotations: ").append(toIndentedString(removeAnnotations)).append("\n");
    sb.append("    removeFormFields: ").append(toIndentedString(removeFormFields)).append("\n");
    sb.append("    convertToGrayScale: ").append(toIndentedString(convertToGrayScale)).append("\n");
    sb.append("    subsetFonts: ").append(toIndentedString(subsetFonts)).append("\n");
    sb.append("    compressImages: ").append(toIndentedString(compressImages)).append("\n");
    sb.append("    imageQuality: ").append(toIndentedString(imageQuality)).append("\n");
    sb.append("    resizeImages: ").append(toIndentedString(resizeImages)).append("\n");
    sb.append("    maxResolution: ").append(toIndentedString(maxResolution)).append("\n");
    sb.append("    optimizeSpreadsheets: ").append(toIndentedString(optimizeSpreadsheets)).append("\n");
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

