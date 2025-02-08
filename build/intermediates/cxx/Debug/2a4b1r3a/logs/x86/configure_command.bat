@echo off
"C:\\Users\\shubham\\AppData\\Local\\Android\\Sdk\\ndk\\25.1.8937393\\ndk-build.cmd" ^
  "NDK_PROJECT_PATH=null" ^
  "APP_BUILD_SCRIPT=C:\\shubham\\One Keyboard\\native\\jni\\AndroidNdk.mk" ^
  "NDK_APPLICATION_MK=C:\\shubham\\One Keyboard\\native\\jni\\Application.mk" ^
  "APP_ABI=x86" ^
  "NDK_ALL_ABIS=x86" ^
  "NDK_DEBUG=1" ^
  "APP_PLATFORM=android-30" ^
  "NDK_OUT=C:\\shubham\\One Keyboard\\build\\intermediates\\cxx\\Debug\\2a4b1r3a/obj" ^
  "NDK_LIBS_OUT=C:\\shubham\\One Keyboard\\build\\intermediates\\cxx\\Debug\\2a4b1r3a/lib" ^
  "APP_SHORT_COMMANDS=false" ^
  "LOCAL_SHORT_COMMANDS=false" ^
  -B ^
  -n
