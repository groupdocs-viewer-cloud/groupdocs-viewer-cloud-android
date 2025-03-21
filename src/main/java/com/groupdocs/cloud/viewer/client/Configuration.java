/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Configuration.java">
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

package com.groupdocs.cloud.viewer.client;


public class Configuration {

    private String appSid = null;

    private String appKey = null;

    private String apiVersion = "/v2.0";

    private String apiBaseUrl = "https://api.groupdocs.cloud";

    private int timeout = 60 * 1000;

    /**
     * Constructor for Configuration
     * @param appSid Application identifier (App SID)
     * @param appKey Application private key (App Key)
     */
    public Configuration(String appSid, String appKey) {
        this.appSid = appSid;
        this.appKey = appKey;
    }

    /**
     * Gets Application identifier (App SID)
     *
     * @return Application identifier (App SID)
     */
    public String getAppSid() {
      return appSid;
    }

    /**
     * Sets application identifier (App SID)
     *
     * @param appSid Application identifier (App SID)
     */
    public void setAppSid(String appSid) {
      this.appSid = appSid;
    }

    /**
     * Gets Application private key (App Key)
     *
     * @return Application private key (App Key)
     */
    public String getAppKey() {
      return appKey;
    }

    /**
     * Sets application private key (App Key)
     *
     * @param appKey Application private key (App Key)
     */
    public void setAppKey(String appKey) {
      this.appKey = appKey;
    }

    /**
     * Gets API base URL, default value is https://api.groupdocs.cloud
     *
     * @return API base URL
     */
    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    /**
     * Sets API base URL
     *
     * @param apiBaseUrl API base URL
     */
    public void setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    /**
     * Gets connection timeout in milliseconds, default value is 60 * 1000 (60 seconds)
     *
     * @return Timeout in milliseconds 
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * Sets connection timeout in milliseconds, default value is 60 * 1000 (60 seconds)
     *
     * @param timeout Timeout in milliseconds 
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    /**
     * Gets Server URL e.g. https://api.groupdocs.cloud/v2.0
     *
     * @return Server URL
     */
    protected String getServerUrl(){
        return apiBaseUrl + apiVersion;
    }
}
