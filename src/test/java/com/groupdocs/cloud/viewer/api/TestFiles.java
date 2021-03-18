/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 *   Copyright (c) 2003-2021 Aspose Pty Ltd
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

import java.util.ArrayList;

public class TestFiles {

    
    public static TestFile OnePageDocx = new TestFile("one-page.docx", "words\\docx\\");
    public static TestFile NotExist = new TestFile("NotExist.docx", "some-folder/");
    public static TestFile PasswordProtectedDocx = new TestFile("password-protected.docx", "words\\docx\\");
    public static TestFile TwoHiddenPagesVsd = new TestFile("two-hidden-pages.vsd", "diagram\\vsd\\");
    public static TestFile WithHiddenRowsAndColumns = new TestFile("with-hidden-rows-and-columns.xlsx", "cells\\xlsx\\");
    public static TestFile ThreeLayoutsDwf = new TestFile("three-layouts.dwf", "cad\\dwf\\");    
    public static TestFile ProjectMpp = new TestFile("sample.mpp", "project\\mpp\\");
    public static TestFile UsesCustomFontPptx = new TestFile("uses-custom-font.pptx", "slides\\pptx\\");    
    public static TestFile FontTtf = new TestFile("foo.ttf", "font\\ttf\\");
    public static TestFile FourPagesDocx = new TestFile("four-pages.docx", "words\\docx\\");    
    
    static {
        PasswordProtectedDocx.setPassword("password");
    }

    public static ArrayList<TestFile> GetList() {
        
        ArrayList<TestFile> files = new ArrayList<TestFile>();

        files.add(OnePageDocx);
        files.add(PasswordProtectedDocx);
        files.add(TwoHiddenPagesVsd);
        files.add(WithHiddenRowsAndColumns);
        files.add(ThreeLayoutsDwf);
        files.add(ProjectMpp);
        files.add(UsesCustomFontPptx);
        files.add(FontTtf);
        files.add(FourPagesDocx);

        return files; 
    } 
}