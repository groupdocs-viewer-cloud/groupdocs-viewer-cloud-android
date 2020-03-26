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

public class FolderApiTests extends BaseApiTest {

    @Test
    public void TestGetFilesList() throws ApiException
    {
        GetFilesListRequest request = new GetFilesListRequest("cad", null);        
        FilesList response = folderApi.getFilesList(request);
        
        assertTrue(response.getValue().size() > 0);
    }

    @Test
    public void TestPutCopyMoveFolder() throws ApiException
    {
            // Create temp folder
            CreateFolderRequest cRequest = new CreateFolderRequest("temp", null);
            folderApi.createFolder(cRequest);

            // Copy folder
            CopyFolderRequest copyRequest = new CopyFolderRequest("temp", "temp1", null, null);
            folderApi.copyFolder(copyRequest);

            // Check copied folder
            ObjectExistsRequest eRequest = new ObjectExistsRequest("temp1", null, null);
            ObjectExist eResponse = storageApi.objectExists(eRequest);
            assertTrue(eResponse.getExists());
            assertTrue(eResponse.getIsFolder());

            // Copy folder
            MoveFolderRequest moveRequest = new MoveFolderRequest("temp1", "temp2", null, null);
            folderApi.moveFolder(moveRequest);

            // Check moved folder
            eRequest = new ObjectExistsRequest("temp1", null, null);
            eResponse = storageApi.objectExists(eRequest);
            assertFalse(eResponse.getExists());
            
            eRequest = new ObjectExistsRequest("temp2", null, null);
            eResponse = storageApi.objectExists(eRequest);
            assertTrue(eResponse.getExists());

            // Delete temp and temp2 folders
            DeleteFolderRequest delRequest = new DeleteFolderRequest("temp", null, true);
            folderApi.deleteFolder(delRequest);
            delRequest = new DeleteFolderRequest("temp2", null, true);
            folderApi.deleteFolder(delRequest);              
    }        
}  