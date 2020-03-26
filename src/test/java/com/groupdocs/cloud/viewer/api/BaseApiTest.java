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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.client.Configuration;
import com.groupdocs.cloud.viewer.client.JSON;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.*;

import org.junit.After;
import org.junit.Before;

/**
 * API tests for ViewerApi
 */
public class BaseApiTest {

    protected InfoApi infoApi;
    protected ViewApi viewApi;
    protected StorageApi storageApi;
    protected FileApi fileApi;
    protected FolderApi folderApi;

    public BaseApiTest() {
        super();

        Configuration configuration = new Configuration(Config.AppSID, Config.AppKey);
        configuration.setApiBaseUrl(Config.ApiBaseUrl);

        infoApi = new InfoApi(configuration);
        viewApi = new ViewApi(configuration);
        storageApi = new StorageApi(configuration);
        fileApi = new FileApi(configuration);
        folderApi = new FolderApi(configuration);
    }    
    
    private static boolean setUpIsDone = false;

    @Before
    public void setUp() throws ApiException, FileNotFoundException {

        if (setUpIsDone) return;        

        for (TestFile file : TestFiles.GetList()) {

            ObjectExist response = storageApi.objectExists(new ObjectExistsRequest(file.getPath(), null, null));
            if(!response.getExists())
            {
                File fileObj = getTestFile(file);
                fileApi.uploadFile(new UploadFileRequest(file.getPath(), fileObj, null));
            }
        }

        setUpIsDone = true;
    }

    @After
    public void cleanup() throws ApiException {
        removeTempFiles();
    }

    private void removeTempFiles() throws ApiException {
        deleteFolderFromStorage("viewer");
    }

    private void deleteFolderFromStorage(String folderName) throws ApiException {
        folderApi.deleteFolder(new DeleteFolderRequest(folderName, null, true));
    }

    public File getTestFile(TestFile testFile) throws FileNotFoundException {
        Path filePath = Paths.get("resources", testFile.getFolder(), testFile.getFileName());
        File file = filePath.toFile();
        if (!file.exists())
            throw new FileNotFoundException(file.getAbsolutePath());

        return file;
    }

    public File toJsonFile(Object obj) throws IOException {
        JSON json = new JSON();
        String content = json.serialize(obj);

        File file = File.createTempFile("java", ".json");
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
        fileWriter.write(content);
        fileWriter.close();

        return file;
    }
}