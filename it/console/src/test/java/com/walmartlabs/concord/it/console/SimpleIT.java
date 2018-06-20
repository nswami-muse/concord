package com.walmartlabs.concord.it.console;

/*-
 * *****
 * Concord
 * -----
 * Copyright (C) 2017 Wal-Mart Store, Inc.
 * -----
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =====
 */

import org.junit.Test;
import org.openqa.selenium.By;

public class SimpleIT extends AbstractIT {

    @Test(timeout = 30000)
    public void test() throws Exception {
        start();
        waitForPage();
        waitFor("Logo should be visible", By.id("strati-logo"));
    }
}
