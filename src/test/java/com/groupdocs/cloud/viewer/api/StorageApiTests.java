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

import org.junit.Test;

public class StorageApiTests extends BaseApiTest {

    @Test
    public void TestGetDiscUsage() throws ApiException
    {
        GetDiscUsageRequest request = new GetDiscUsageRequest();        
        DiscUsage result = storageApi.getDiscUsage(request);
        assertTrue(result.getTotalSize() > 0);
        assertTrue(result.getUsedSize() > 0);
    }

    @Test
    public void TestStorageExists() throws ApiException
    {
        StorageExistsRequest request = new StorageExistsRequest();        
        request.setstorageName("First Storage");
        StorageExist result = storageApi.storageExists(request);
        assertTrue(result.getExists());        
    }    

    @Test
    public void TestGetListFileVersions() throws ApiException
    {
        GetFileVersionsRequest request = new GetFileVersionsRequest();        
        request.setpath(TestFiles.OnePageDocx.getPath());

        FileVersions result = storageApi.getFileVersions(request);
        assertTrue(result.getValue().size() > 0);        
    }    
    
    @Test
    public void TestGetObjectExists() throws ApiException
    {
        ObjectExistsRequest request = new ObjectExistsRequest();        
        request.setpath(TestFiles.OnePageDocx.getPath());

        ObjectExist result = storageApi.objectExists(request);
        assertTrue(result.getExists());        
        assertFalse(result.getIsFolder());        
    }      
}  