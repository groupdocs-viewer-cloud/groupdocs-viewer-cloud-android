/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.*;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.requests.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;

import org.junit.Test;
import org.threeten.bp.OffsetDateTime;


public class ViewerGetInfoApiTests extends BaseApiTest {

    @Test
    public void TestGetInfoReturnsMissingFileInfo()
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert  
        try {
            infoApi.getInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Parameter 'FileInfo' is not specified.", ex.getMessage());
        }          
    }

    @Test
    public void TestGetInfoReturnsFileNotFound()
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.NotExist.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert  
        try {
            infoApi.getInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'some-folder/NotExist.docx'.", ex.getMessage());
        }  
    }

    @Test
    public void TestGetInfoPasswordProtected()
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.PasswordProtectedDocx.ToFileInfo());
        viewOptions.getFileInfo().setPassword(null);
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert  
        try {
            infoApi.getInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Please specify password to load the document.", ex.getMessage());
        }  
    }    

    @Test
    public void TestGetInfoWithMinimalViewOptions() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.PasswordProtectedDocx.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert
        InfoResult infoResult = infoApi.getInfo(request);

        assertEquals(4, infoResult.getPages().size());
        assertEquals(0, infoResult.getAttachments().size());
    }

    @Test
    public void TestGetInfoWithDefaultViewFormat() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.OnePageDocx.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert
        InfoResult infoResult = infoApi.getInfo(request);

        assertEquals(1, infoResult.getPages().size());
        assertEquals(0, infoResult.getAttachments().size());
        PageInfo page = infoResult.getPages().get(0);
        assertEquals(1, (int)page.getNumber());
    }

    @Test
    public void TestGetInfoWithHtmlViewFormat() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.OnePageDocx.ToFileInfo());
        viewOptions.setViewFormat(ViewFormatEnum.HTML);
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert
        InfoResult infoResult = infoApi.getInfo(request);

        assertEquals(1, infoResult.getPages().size());
        assertEquals(0, infoResult.getAttachments().size());
        PageInfo page = infoResult.getPages().get(0);
        assertEquals(1, (int)page.getNumber());
    }

    @Test
    public void TestGetInfoWithImageViewFormat() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.OnePageDocx.ToFileInfo());
        viewOptions.setViewFormat(ViewFormatEnum.PNG);
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert
        InfoResult infoResult = infoApi.getInfo(request);

        assertEquals(1, infoResult.getPages().size());
        assertEquals(0, infoResult.getAttachments().size());
        PageInfo page = infoResult.getPages().get(0);
        assertEquals(1, (int)page.getNumber());
        assertTrue(page.getNumber() > 0);
    }

    @Test
    public void TestGetInfoWithRenderHiddenPages() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.TwoHiddenPagesVsd.ToFileInfo());
        RenderOptions renderOptions = new RenderOptions();
        renderOptions.setRenderHiddenPages(true);
        viewOptions.setRenderOptions(renderOptions);
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert
        InfoResult infoResult = infoApi.getInfo(request);

        assertEquals(3, infoResult.getPages().size());
    }

    @Test
    public void TestGetInfoWithSpreadsheetPaginateSheetsOption() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.WithHiddenRowsAndColumns.ToFileInfo());
        RenderOptions renderOptions = new RenderOptions();
        SpreadsheetOptions spreadsheetOptions = new SpreadsheetOptions();
        spreadsheetOptions.setPaginateSheets(true);
        spreadsheetOptions.setCountRowsPerPage(5);        
        renderOptions.setSpreadsheetOptions(spreadsheetOptions);
        viewOptions.setRenderOptions(renderOptions);
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert
        InfoResult infoResult = infoApi.getInfo(request);

        assertEquals(3, infoResult.getPages().size());
    }

    @Test
    public void TestGetInfoWithSpreadsheetRenderHiddenRowsOption() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.WithHiddenRowsAndColumns.ToFileInfo());
        RenderOptions renderOptions = new RenderOptions();
        SpreadsheetOptions spreadsheetOptions = new SpreadsheetOptions();
        spreadsheetOptions.setPaginateSheets(true);
        spreadsheetOptions.setCountRowsPerPage(5);        
        spreadsheetOptions.setRenderHiddenRows(true); 
        renderOptions.setSpreadsheetOptions(spreadsheetOptions);
        viewOptions.setRenderOptions(renderOptions);
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert
        InfoResult infoResult = infoApi.getInfo(request);

        assertEquals(3, infoResult.getPages().size());
    }

    @Test
    public void TestGetInfoWithCadOptions() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.ThreeLayoutsDwf.ToFileInfo());
        RenderOptions renderOptions = new RenderOptions();
        CadOptions cadOptions = new CadOptions();
        cadOptions.setScaleFactor(5.0);
        renderOptions.setCadOptions(cadOptions);;
        viewOptions.setRenderOptions(renderOptions);
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert
        InfoResult infoResult = infoApi.getInfo(request);

        assertEquals(3, infoResult.getPages().size());
    }

    @Test
    public void TestGetInfoWithProjectOptions() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.ProjectMpp.ToFileInfo());
        RenderOptions renderOptions = new RenderOptions();
        ProjectManagementOptions projectManagementOptions = new ProjectManagementOptions();
        projectManagementOptions.setPageSize(ProjectManagementOptions.PageSizeEnum.UNSPECIFIED);
        projectManagementOptions.setTimeUnit(ProjectManagementOptions.TimeUnitEnum.MONTHS);
        projectManagementOptions.setStartDate(OffsetDateTime.parse("2008-07-01T00:00:00Z"));
        projectManagementOptions.setEndDate(OffsetDateTime.parse("2008-07-31T00:00:00Z"));
        renderOptions.setProjectManagementOptions(projectManagementOptions);
        viewOptions.setRenderOptions(renderOptions);
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert
        InfoResult infoResult = infoApi.getInfo(request);

        assertTrue(infoResult.getPages().size() == 1 || infoResult.getPages().size() == 2);
    }

    @Test
    public void TestGetInfoWithImageOptions() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();        
        viewOptions.setFileInfo(TestFiles.OnePageDocx.ToFileInfo());
        viewOptions.setViewFormat(ViewFormatEnum.JPG);
        ImageOptions renderOptions = new ImageOptions();
        renderOptions.setExtractText(true);
        viewOptions.setRenderOptions(renderOptions);
        GetInfoRequest request = new GetInfoRequest(viewOptions);

        // Act & Assert
        InfoResult infoResult = infoApi.getInfo(request);

        assertEquals(1, infoResult.getPages().size());
        assertEquals(0, infoResult.getAttachments().size());
        PageInfo page = infoResult.getPages().get(0);
        assertEquals(1, (int)page.getNumber());
        assertTrue(page.getLines().size() > 0);

        Line line = page.getLines().get(0);
        assertEquals((Double) 85.05, (Double)line.getX());

    }    
      
}

