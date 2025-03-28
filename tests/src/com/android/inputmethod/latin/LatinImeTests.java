/*
 * Copyright (C) 2014 The Android Open Source Project
 *
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
 * limitations under the License
 */

package com.android.inputmethod.latin;

import androidx.test.filters.LargeTest;

@LargeTest
public class LatinImeTests extends InputTestsBase {
    public void testDeferredDeallocation_doesntHappenBeforeTimeout() {
        mOneKeyboard.mHandler.onFinishInputView(true);
        runMessages();
        sleep(1000); // 1s
        runMessages();
        assertFalse("memory deallocation performed before timeout passed",
                ((OneKeyboardForTests) mOneKeyboard).getDeallocateMemoryWasPerformed());
    }

    public void testDeferredDeallocation_doesHappenAfterTimeout() {
        mOneKeyboard.mHandler.onFinishInputView(true);
        runMessages();
        sleep(11000); // 11s (timeout is at 10s)
        runMessages();
        assertTrue("memory deallocation not performed although timeout passed",
                ((OneKeyboardForTests) mOneKeyboard).getDeallocateMemoryWasPerformed());
    }
}
