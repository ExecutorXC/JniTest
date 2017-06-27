//
// Created by chenxiao on 17/6/27.
//
#include "com_design_chenxiao_jnitest_NativeMoce.h"
#include "stdio.h"
/*
 * Class:     io_github_yanbober_ndkapplication_NdkJniUtils
 * Method:    getCLanguageString
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jint JNICALL Java_com_design_chenxiao_jnitest_NativeMoce_getHe
        (JNIEnv *env, jobject i, jint j, jint z) {
    return j + z;
}
