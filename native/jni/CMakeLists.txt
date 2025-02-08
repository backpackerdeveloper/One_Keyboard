cmake_minimum_required(VERSION 3.10.2)
project(latinime)

file(GLOB_RECURSE SRC_CORE_SUGGEST			    "src/suggest/core/*.cpp"						"src/suggest/core/*.h")
file(GLOB_RECURSE SRC_DICNODE			        "src/suggest/core/dicnode/*.cpp"				"src/suggest/core/dicnode/*.h")
file(GLOB_RECURSE SRC_DICTIONARY		        "src/suggest/core/dictionary/*.cpp"				"src/suggest/core/dictionary/*.h")
file(GLOB_RECURSE SRC_LAYOUT			        "src/suggest/core/layout/*.cpp"				    "src/suggest/core/layout/*.h")
file(GLOB_RECURSE SRC_POLICY			        "src/suggest/core/policy/*.cpp"				    "src/suggest/core/policy/*.h")
file(GLOB_RECURSE SRC_RESULT			        "src/suggest/core/result/*.cpp"				    "src/suggest/core/result/*.h")
file(GLOB_RECURSE SRC_SESSION			        "src/suggest/core/session/*.cpp"				"src/suggest/core/session/*.h")
file(GLOB_RECURSE SRC_pDICTIONARY		        "src/suggest/policyimpl/dictionary/*.cpp"		"src/suggest/policyimpl/dictionary/*.h")
file(GLOB_RECURSE SRC_pGESTURE 			        "src/suggest/policyimpl/gesture/*.cpp"				"src/suggest/policyimpl/gesture/*.h")
file(GLOB_RECURSE SRC_pTYPING			        "src/suggest/policyimpl/typing/*.cpp"				"src/suggest/core/typing/*.h")
file(GLOB_RECURSE SRC_pUTILS		            "src/suggest/policyimpl/utils/*.cpp"				"src/suggest/core/session/*.h")
file(GLOB_RECURSE SRC_UTILS	    		        "src/utils/*.cpp"				"src/utils/*.h")
file(GLOB_RECURSE SRC_SWIPE						"src/swipe/*.cpp"				"src/swipe/*.h")
file(GLOB_RECURSE SRC_SRCDICTIONARY						"src/dictionary/*.cpp"				"src/dictionary/*.h")

add_library(jni_latinime
        SHARED
        src/defines.h
        ${SRC_CORE_SUGGEST}
        ${SRC_DICNODE}
        ${SRC_DICTIONARY}
        ${SRC_LAYOUT}
        ${SRC_POLICY}
        ${SRC_RESULT}
        ${SRC_SESSION}
        ${SRC_pDICTIONARY}
        ${SRC_pGESTURE}
        ${SRC_pTYPING}
        ${SRC_pUTILS}
        ${SRC_UTILS}
        ${SRC_SWIPE}
        ${SRC_SRCDICTIONARY}
        com_android_inputmethod_keyboard_ProximityInfo.cpp
        com_android_inputmethod_keyboard_ProximityInfo.h
        com_android_inputmethod_latin_BinaryDictionary.cpp
        com_android_inputmethod_latin_BinaryDictionary.h
        com_android_inputmethod_latin_BinaryDictionaryUtils.cpp
        com_android_inputmethod_latin_BinaryDictionaryUtils.h
        com_android_inputmethod_latin_DicTraverseSession.cpp
        com_android_inputmethod_latin_DicTraverseSession.h
        jni_common.cpp
        jni_common.h
)

target_include_directories(jni_latinime PUBLIC "${CMAKE_CURRENT_SOURCE_DIR}/src")
target_link_libraries(jni_latinime)