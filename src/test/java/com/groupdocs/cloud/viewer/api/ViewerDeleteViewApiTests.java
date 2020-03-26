/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.viewer.api;

import static org.junit.Assert.*;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.model.requests.*;
import com.groupdocs.cloud.viewer.model.*;

import org.junit.Test;

public class ViewerDeleteViewApiTests extends BaseApiTest {

    @Test
    public void TestDeleteViewWithDefaultViewFormat() throws ApiException
    {
        // Create view
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.setFileInfo(TestFiles.OnePageDocx.ToFileInfo());
        CreateViewRequest request = new CreateViewRequest(viewOptions);        
        ViewResult viewResult = viewApi.createView(request);
        assertEquals(1, viewResult.getPages().size());       

        // Delete view                           
        DeleteViewOptions deleteViewOptions = new DeleteViewOptions();
        deleteViewOptions.setFileInfo(TestFiles.OnePageDocx.ToFileInfo());
        DeleteViewRequest dRequest = new DeleteViewRequest(deleteViewOptions);        
        viewApi.deleteView(dRequest);        
    }
}  