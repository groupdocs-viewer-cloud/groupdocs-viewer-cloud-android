/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.*;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.requests.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.ProjectManagementOptions.TimeUnitEnum;
import com.groupdocs.cloud.viewer.model.ViewOptions.ViewFormatEnum;

import org.junit.Test;
import org.threeten.bp.OffsetDateTime;
import java.io.File;

public class ViewerCreateViewApiTests extends BaseApiTest {

    @Test
    public void TestCreateViewReturnsMissingFileInfo()
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        CreateViewRequest request = new CreateViewRequest(viewOptions);

        // Act & Assert  
        try {
            viewApi.createView(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Parameter 'FileInfo' is not specified.", ex.getMessage());
        }          
    }

    @Test
    public void TestCreateViewReturnsFileNotFound()
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.NotExist.ToFileInfo());
        CreateViewRequest request = new CreateViewRequest(viewOptions);

        // Act & Assert  
        try {
            viewApi.createView(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'some-folder/NotExist.docx'.", ex.getMessage());
        }  
    }

    @Test
    public void TestCreateViewWithMinimalViewOptions() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.PasswordProtectedDocx.ToFileInfo());
        CreateViewRequest request = new CreateViewRequest(viewOptions);

        // Act & Assert
        ViewResult viewResult =viewApi.createView(request);

        assertEquals(4, viewResult.getPages().size());
        assertEquals(0, viewResult.getAttachments().size());

        // Download result
        PageView page = viewResult.getPages().get(0);
        DownloadFileRequest dlRequest = new DownloadFileRequest();
        dlRequest.setpath(page.getPath());
        File response = fileApi.downloadFile(dlRequest);
        assertTrue(response.getTotalSpace() > 0);
    }

    @Test
    public void TestCreateViewWithDefaultViewFormat() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.OnePageDocx.ToFileInfo());
        CreateViewRequest request = new CreateViewRequest(viewOptions);

        // Act & Assert
        ViewResult viewResult =viewApi.createView(request);

        assertEquals(1, viewResult.getPages().size());
        assertEquals(0, viewResult.getAttachments().size());
        PageView page = viewResult.getPages().get(0);
        assertEquals(1, (int)page.getNumber());
    }

    @Test
    public void TestCreateViewWithHtmlViewFormat() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.OnePageDocx.ToFileInfo());
        viewOptions.setViewFormat(ViewFormatEnum.HTML);
        CreateViewRequest request = new CreateViewRequest(viewOptions);

        // Act & Assert
        ViewResult viewResult =viewApi.createView(request);

        assertEquals(1, viewResult.getPages().size());
        assertEquals(0, viewResult.getAttachments().size());
        PageView page = viewResult.getPages().get(0);
        assertEquals(1, (int)page.getNumber());
    }

    @Test
    public void TestCreateViewWithImageViewFormat() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.OnePageDocx.ToFileInfo());
        viewOptions.setViewFormat(ViewFormatEnum.PNG);
        CreateViewRequest request = new CreateViewRequest(viewOptions);

        // Act & Assert
        ViewResult viewResult =viewApi.createView(request);

        assertEquals(1, viewResult.getPages().size());
        assertEquals(0, viewResult.getAttachments().size());
        PageView page = viewResult.getPages().get(0);
        assertEquals(1, (int)page.getNumber());
        assertTrue(page.getNumber() > 0);
    }

    @Test
    public void TestCreateViewWithRenderHiddenPages() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.TwoHiddenPagesVsd.ToFileInfo());
        RenderOptions renderOptions = new RenderOptions();
        renderOptions.setRenderHiddenPages(true);
        viewOptions.setRenderOptions(renderOptions);
        CreateViewRequest request = new CreateViewRequest(viewOptions);

        // Act & Assert
        ViewResult viewResult =viewApi.createView(request);

        assertEquals(3, viewResult.getPages().size());
    }

    @Test
    public void TestCreateViewWithSpreadsheetPaginateSheetsOption() throws ApiException
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
        CreateViewRequest request = new CreateViewRequest(viewOptions);

        // Act & Assert
        ViewResult viewResult =viewApi.createView(request);

        assertEquals(3, viewResult.getPages().size());
    }

    @Test
    public void TestCreateViewWithSpreadsheetRenderHiddenRowsOption() throws ApiException
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
        CreateViewRequest request = new CreateViewRequest(viewOptions);

        // Act & Assert
        ViewResult viewResult =viewApi.createView(request);

        assertEquals(3, viewResult.getPages().size());
    }

    @Test
    public void TestCreateViewWithCadOptions() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.ThreeLayoutsDwf.ToFileInfo());
        RenderOptions renderOptions = new RenderOptions();
        CadOptions cadOptions = new CadOptions();
        cadOptions.setWidth(800);
        renderOptions.setCadOptions(cadOptions);;
        viewOptions.setRenderOptions(renderOptions);
        CreateViewRequest request = new CreateViewRequest(viewOptions);

        // Act & Assert
        ViewResult viewResult =viewApi.createView(request);

        assertEquals(3, viewResult.getPages().size());
    }

    @Test
    public void TestCreateViewWithProjectOptions() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.ProjectMpp.ToFileInfo());
        RenderOptions renderOptions = new RenderOptions();
        ProjectManagementOptions projectManagementOptions = new ProjectManagementOptions();
        projectManagementOptions.setPageSize(ProjectManagementOptions.PageSizeEnum.UNSPECIFIED);
        projectManagementOptions.setTimeUnit(TimeUnitEnum.MONTHS);
        projectManagementOptions.setStartDate(OffsetDateTime.parse("2008-07-01T00:00:00Z"));
        projectManagementOptions.setEndDate(OffsetDateTime.parse("2008-07-31T00:00:00Z"));
        renderOptions.setProjectManagementOptions(projectManagementOptions);
        viewOptions.setRenderOptions(renderOptions);
        CreateViewRequest request = new CreateViewRequest(viewOptions);

        // Act & Assert
        ViewResult viewResult =viewApi.createView(request);

        assertTrue(viewResult.getPages().size() == 1 || viewResult.getPages().size() == 2);
    }

    @Test
    public void TestCreateViewWithHtmlOptions() throws ApiException
    {
        // Arrange
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.OnePageDocx.ToFileInfo());
        HtmlOptions htmlOptions = new HtmlOptions();
        htmlOptions.setExternalResources(true);
        viewOptions.setRenderOptions(htmlOptions);
        CreateViewRequest request = new CreateViewRequest(viewOptions);

        // Act & Assert
        ViewResult viewResult =viewApi.createView(request);

        assertEquals(1, viewResult.getPages().size());
        assertEquals(0, viewResult.getAttachments().size());
        PageView page = viewResult.getPages().get(0);
        assertEquals(1, (int)page.getNumber());
        assertTrue(page.getResources().size() > 0);
    }    
}

