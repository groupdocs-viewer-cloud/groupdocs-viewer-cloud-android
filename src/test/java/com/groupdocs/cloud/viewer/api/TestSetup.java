package com.groupdocs.cloud.viewer.api;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    AuthApiTests.class,
    FormatsApiTests.class,
    ViewerGetInfoApiTests.class,
    ViewerCreateViewApiTests.class,
    ViewerDeleteViewApiTests.class,
    StorageApiTests.class,
    FolderApiTests.class,
    FileApiTests.class
})

public class TestSetup {
    

}
